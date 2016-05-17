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
	
	PessoaDB dbpessoa;
	ProdutoDB dbproduto;
	DBListaTemp dblista;
	
	public LoginInterface() { // construtor
		
		dbpessoa = new PessoaDB();
		dbproduto = new ProdutoDB();
		dblista = new DBListaTemp();
		 
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
		setLocationRelativeTo(null);

	} // end construtor PessoaInterfaceGrafico

	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == botaoEnter) {
			String usuario = textoUsuario.getText();
			char[] senha = passwordField.getPassword();
			String s = String.valueOf(senha);
			
			switch (dbpessoa.checkUsuario(usuario, s)) {
				case 0:	// usuario Incorreto
					rotuloStatus.setText("USUARIO INCORRETA");
					break;
				case 1:	// Senha Incorreta
					rotuloStatus.setText("SENHA INCORRETA");
					break;
				case 2:	// Correto Outros
					rotuloStatus.setText("SENHA CORRETA - Caixa");
					new TelaPrincipalFuncionario(dbproduto, dbpessoa, dblista).open(dbproduto, dbpessoa, dblista);
					setVisible(false);
					break;
				case 3:	// Correto Gerente
					this.setVisible(false);
				   	new TelaGerente(dbpessoa, dbproduto).setVisible(true);
					rotuloStatus.setText("SENHA CORRETA - Gerente");
					setVisible(false);
					break;
				default:
					break;
			}
		}

	} // end actionPerformed
	
	public static void main(String args[]) {
		LoginInterface loginInterface = new LoginInterface();
	} // end main

} // end class PessoaInterfaceGrafico