import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class LoginInterface extends JFrame implements ActionListener {

	JLabel rotuloUsuário		= new JLabel("Usuário:");
	JLabel rotuloSenha			= new JLabel("Senha:");
	JLabel rotuloStatus			= new JLabel("<Status>");
	JTextField textoUsuario		= new JTextField(20);
	JTextField textoSenha 		= new JTextField(20);
	
	JPasswordField passwordField= new JPasswordField(10);
		
	JButton botaoEnter	 		= new JButton("Enter");
	
	public LoginInterface() { // construtor

		Container caixa = getContentPane();
		caixa.setLayout(new GridLayout(7, 1));		// Define size of the Layout 5x3

		botaoEnter.addActionListener(this);
		passwordField.setActionCommand("Entre com a senha");
		passwordField.addActionListener(this);
		rotuloSenha.setLabelFor(passwordField);

		caixa.add(rotuloUsuário);
		caixa.add(textoUsuario);
		caixa.add(rotuloSenha);
		caixa.add(passwordField);
		caixa.add(rotuloStatus);
		caixa.add(botaoEnter);

		setTitle("Cadastro de Pessoas");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

	} // end construtor PessoaInterfaceGrafico

	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == botaoEnter) {
			String usuario = textoUsuario.getText();
			char[] senha = passwordField.getPassword();
			
			if (senhaCorrera(senha))
				rotuloStatus.setText("SENHA CORRETA");
			else
				rotuloStatus.setText("Senha INCORRETA");
			//rotuloStatus.setText("Botão ENTER Pressionado");
		}

	} // end actionPerformed
	
    private static boolean senhaCorrera (char[] input) {
        boolean isCorrect = true;
        char[] correctPassword = { 'e', 'r', 'i', 'v', 'e', 'l', 't', 'o', 'n' };

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals (input, correctPassword);
        }
        
        //Zero out the password.
        Arrays.fill(correctPassword,'0');

        return isCorrect;
    }
	
	public static void main(String args[]) {
		LoginInterface loginInterface = new LoginInterface();
	} // end main

} // end class PessoaInterfaceGrafico