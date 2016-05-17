import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CancelarProduto {

	private JFrame CancelarProd;
	private JTextField txtloginGerente;
	private JTextField txtsenhaGerente;
	private JTextField txtid;
	private JTextField txtquant;
	
	JPasswordField passwordField= new JPasswordField(10);
	
	/**
	 * Launch the application.
	 */
	public void open(ProdutoDB dbproduto, PessoaDB dbpessoa, DBListaTemp dblista) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelarProduto window = new CancelarProduto(dbproduto, dbpessoa, dblista);
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
	public CancelarProduto(ProdutoDB dbproduto,PessoaDB dbpessoa, DBListaTemp dblista) {
		initialize(dbproduto, dbpessoa, dblista);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ProdutoDB dbproduto,PessoaDB dbpessoa, DBListaTemp dblista) {
		CancelarProd = new JFrame();
		CancelarProd.setTitle("Cancelar Produto");
		CancelarProd.setBounds(100, 100, 302, 299);
		CancelarProd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CancelarProd.getContentPane().setLayout(null);
		CancelarProd.setLocationRelativeTo(null);
		
		txtloginGerente = new JTextField();
		txtloginGerente.setText("(Login Gerente)");
		txtloginGerente.setHorizontalAlignment(SwingConstants.CENTER);
		txtloginGerente.setColumns(10);
		txtloginGerente.setBounds(81, 16, 133, 20);
		txtloginGerente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtloginGerente.setText("");
            }
		});
		CancelarProd.getContentPane().add(txtloginGerente);
		
		txtid = new JTextField();
		txtid.setText("(ID)");
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setColumns(10);
		txtid.setBounds(81, 80, 133, 20);
		txtid.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtid.setText("");
            }
		});
		CancelarProd.getContentPane().add(txtid);
		
		txtsenhaGerente = new JTextField();
		txtsenhaGerente.setText("(Senha Gerente)");
		txtsenhaGerente.setHorizontalAlignment(SwingConstants.CENTER);
		txtsenhaGerente.setColumns(10);
		txtsenhaGerente.setBounds(81, 48, 133, 20);
		txtsenhaGerente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtsenhaGerente.setText("");
            }
		});
		CancelarProd.getContentPane().add(txtsenhaGerente);
		
		txtquant = new JTextField();
		txtquant.setText("(Quantidade)");
		txtquant.setHorizontalAlignment(SwingConstants.CENTER);
		txtquant.setColumns(10);
		txtquant.setBounds(81, 112, 133, 20);
		txtquant.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtquant.setText("");
            }
		});
		CancelarProd.getContentPane().add(txtquant);
		
		JLabel lblGerente = new JLabel("Gerente:");
		lblGerente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGerente.setBounds(0, 10, 71, 32);
		CancelarProd.getContentPane().add(lblGerente);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(0, 42, 71, 32);
		CancelarProd.getContentPane().add(lblSenha);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(0, 74, 71, 32);
		CancelarProd.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Qtd:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(0, 106, 71, 32);
		CancelarProd.getContentPane().add(label_3);
		
		JLabel lblstatus = new JLabel("<status cancelado>");
		lblstatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus.setBounds(81, 183, 133, 20);
		CancelarProd.getContentPane().add(lblstatus);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelarProd.setVisible(false);
			}
		});
		
		JButton button = new JButton("Cancelar Produto");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String usuario = txtloginGerente.getText();
				String senha = txtsenhaGerente.getText();
				String s = String.valueOf(senha);
				
				if (dbpessoa.checkUsuario(usuario, s) == 3) {
					int id = Integer.parseInt(txtid.getText());
					double quant = Double.parseDouble(txtquant.getText());
					
					ListaTemp consulta = new ListaTemp();
					consulta =  dblista.consultar(id);
					if (consulta != null) {
						if ( consulta.getQte() == quant) {
							if (dblista.excluir(id)) {
								lblstatus.setText("Pedido excluido");
							}
						}
						else {
							double preco = consulta.getPreco();
							String Nome = consulta.getNome();
							dblista.alterar(id, Nome, quant, preco);
						}
					}
					else
						lblstatus.setText("Consulta Inválida");
				}
				else
					lblstatus.setText("Senha Inválida");
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(135, 206, 250));
		button.setBounds(81, 143, 133, 23);
		CancelarProd.getContentPane().add(button);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(81, 214, 133, 23);
		CancelarProd.getContentPane().add(btnVoltar);
	}

}
