import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;


public class CancelarProduto {

	private JFrame CancelarProd;
	private JTextField txtloginGerente;
	private JTextField txtsenhaGerente;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelarProduto window = new CancelarProduto();
					window.CancelarProd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CancelarProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CancelarProd = new JFrame();
		CancelarProd.setTitle("Cancelar Produto");
		CancelarProd.setBounds(100, 100, 302, 299);
		CancelarProd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CancelarProd.getContentPane().setLayout(null);
		
		txtloginGerente = new JTextField();
		txtloginGerente.setText("(Login Gerente)");
		txtloginGerente.setHorizontalAlignment(SwingConstants.CENTER);
		txtloginGerente.setColumns(10);
		txtloginGerente.setBounds(81, 16, 133, 20);
		CancelarProd.getContentPane().add(txtloginGerente);
		
		JLabel lblGerente = new JLabel("Gerente:");
		lblGerente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGerente.setBounds(0, 10, 71, 32);
		CancelarProd.getContentPane().add(lblGerente);
		
		txtsenhaGerente = new JTextField();
		txtsenhaGerente.setText("(Senha Gerente)");
		txtsenhaGerente.setHorizontalAlignment(SwingConstants.CENTER);
		txtsenhaGerente.setColumns(10);
		txtsenhaGerente.setBounds(81, 48, 133, 20);
		CancelarProd.getContentPane().add(txtsenhaGerente);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(0, 42, 71, 32);
		CancelarProd.getContentPane().add(lblSenha);
		
		textField_2 = new JTextField();
		textField_2.setText("(ID)");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(81, 80, 133, 20);
		CancelarProd.getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(0, 74, 71, 32);
		CancelarProd.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setText("(Quantidade)");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(81, 112, 133, 20);
		CancelarProd.getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("Qtd:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(0, 106, 71, 32);
		CancelarProd.getContentPane().add(label_3);
		
		JButton button = new JButton("Cancelar Produto");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(135, 206, 250));
		button.setBounds(81, 143, 133, 23);
		CancelarProd.getContentPane().add(button);
		
		JLabel label_4 = new JLabel("<valor>");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(81, 183, 133, 20);
		CancelarProd.getContentPane().add(label_4);
		
		JButton button_1 = new JButton("Cancelar Produto");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(135, 206, 250));
		button_1.setBounds(81, 214, 133, 23);
		CancelarProd.getContentPane().add(button_1);
	}

}
