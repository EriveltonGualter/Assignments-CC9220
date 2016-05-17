import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaPrincipalFuncionario {

	private JFrame TelaPrincipal;
	private JTextField txtID;
	private JTextField txtQtd;
	private JTextField txtcpf;
	private JTextField txtvalorPago;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public void open(ProdutoDB dbproduto, PessoaDB dbpessoa, DBListaTemp dblista) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalFuncionario window = new TelaPrincipalFuncionario(dbproduto, dbpessoa, dblista);
					window.TelaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipalFuncionario(ProdutoDB dbproduto, PessoaDB dbpessoa, DBListaTemp dblista) {
		initialize(dbproduto, dbpessoa, dblista);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ProdutoDB dbproduto, PessoaDB dbpessoa, DBListaTemp dblista) {
		TelaPrincipal = new JFrame();
		TelaPrincipal.setTitle("TelaPrincipalFuncionario");
		TelaPrincipal.setBounds(100, 100, 579, 361);
		TelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaPrincipal.getContentPane().setLayout(null);
		
		txtID = new JTextField();
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setText("(ID)");
		txtID.setColumns(10);
		txtID.setBounds(91, 16, 133, 20);
		txtID.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtID.setText("");
            }
		});
		TelaPrincipal.getContentPane().add(txtID);
		
		txtQtd = new JTextField();
		txtQtd.setHorizontalAlignment(SwingConstants.CENTER);
		txtQtd.setText("(Quantidade)");
		txtQtd.setColumns(10);
		txtQtd.setBounds(91, 48, 133, 20);
		txtQtd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtQtd.setText("");
            }
		});
		TelaPrincipal.getContentPane().add(txtQtd);
		
		txtcpf = new JTextField();
		txtcpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtcpf.setText("(CPF)");
		txtcpf.setColumns(10);
		txtcpf.setBounds(364, 238, 133, 20);
		TelaPrincipal.getContentPane().add(txtcpf);
		txtcpf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtcpf.setText("");
            }
		});
		
		txtvalorPago = new JTextField();
		txtvalorPago.setText("(Valor Pago)");
		txtvalorPago.setHorizontalAlignment(SwingConstants.CENTER);
		txtvalorPago.setColumns(10);
		txtvalorPago.setBounds(364, 178, 133, 20);
		TelaPrincipal.getContentPane().add(txtvalorPago);
		txtvalorPago.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtvalorPago.setText("");
            }
		});
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 10, 71, 32);
		TelaPrincipal.getContentPane().add(lblId);
		
		JLabel lblQtd = new JLabel("Qtd:");
		lblQtd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQtd.setBounds(10, 42, 71, 32);
		TelaPrincipal.getContentPane().add(lblQtd);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setBounds(10, 80, 71, 20);
		TelaPrincipal.getContentPane().add(lblStatus);
		
		JLabel lblProdutor = new JLabel("Produto:");
		lblProdutor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProdutor.setBounds(10, 111, 71, 20);
		TelaPrincipal.getContentPane().add(lblProdutor);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor.setBounds(10, 142, 71, 20);
		TelaPrincipal.getContentPane().add(lblValor);
		
		JLabel lblstatus = new JLabel("<sucesso ou falha>");
		lblstatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus.setBounds(91, 80, 133, 20);
		TelaPrincipal.getContentPane().add(lblstatus);
		
		JLabel lblProduto = new JLabel("<produto escaneado>");
		lblProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduto.setBounds(91, 111, 133, 20);
		TelaPrincipal.getContentPane().add(lblProduto);
		
		JLabel lblvalor = new JLabel("<valor>");
		lblvalor.setHorizontalAlignment(SwingConstants.CENTER);
		lblvalor.setBounds(91, 142, 133, 20);
		TelaPrincipal.getContentPane().add(lblvalor);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(283, 232, 71, 32);
		TelaPrincipal.getContentPane().add(lblCpf);
		
		JLabel lbltroco = new JLabel("<troco>");
		lbltroco.setHorizontalAlignment(SwingConstants.CENTER);
		lbltroco.setBounds(364, 210, 133, 20);
		TelaPrincipal.getContentPane().add(lbltroco);
		
		JLabel lblTroco = new JLabel("Troco:");
		lblTroco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTroco.setBounds(283, 210, 71, 20);
		TelaPrincipal.getContentPane().add(lblTroco);
		
		JLabel lblValorPago = new JLabel("Valor Pago:");
		lblValorPago.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorPago.setBounds(283, 172, 71, 32);
		TelaPrincipal.getContentPane().add(lblValorPago);
		
		JLabel lbltotal = new JLabel("<total>");
		lbltotal.setHorizontalAlignment(SwingConstants.CENTER);
		lbltotal.setBounds(364, 142, 133, 20);
		TelaPrincipal.getContentPane().add(lbltotal);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setBounds(283, 142, 71, 20);
		TelaPrincipal.getContentPane().add(lblTotal);
		
		JButton btnAdicionarProduto = new JButton("Adicionar Produto");
		btnAdicionarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idproduto = Integer.parseInt(txtID.getText());
				double quantidade = Double.parseDouble(txtQtd.getText());
				double total = 0;
				
				Produto produto = new Produto();
				produto = dbproduto.consultar(idproduto);
				
				Object [][] dados = new Object[20][5];
				
				dados[0][0] = "ID";
				dados[0][1] = "Nome";
				dados[0][2] = "Qte.";
				dados[0][3] = "Preço";
				
				String [] Colunas = {"ID", "Nome", "Qte.", "Preço"};
				
				if (produto != null) {
					lblProduto.setText(produto.getNome());
					lblvalor.setText(Double.toString(produto.getPreco_venda()));	
					
					dblista.incluir(produto.getid(),produto.getNome(), quantidade, produto.getPreco_venda());
					
					for(int i=0; i<dblista.listar().length; i++) {
			    		ListaTemp plist = dblista.listar()[i];
			    		if (plist != null) {
							dados[i+1][0] = plist.getId();
							dados[i+1][1] = plist.getNome();
							dados[i+1][2] = plist.getQte();
							dados[i+1][3] = plist.getPreco();
							
							total = total + plist.getQte()*plist.getPreco();
			    		}
			    	}
					
					table = new JTable(dados, Colunas);
					table.setBounds(293, 16, 244, 118);
					TelaPrincipal.getContentPane().add(table);
					
					lbltotal.setText(Double.toString(total));
				}
				else {
					lblProduto.setText("PRODUTO NAO ENCONTRADO");
				}
			}
		});
		
		table = new JTable();
		table.setBounds(293, 16, 244, 118);
		TelaPrincipal.getContentPane().add(table);
		btnAdicionarProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionarProduto.setBackground(new Color(135, 206, 250));
		btnAdicionarProduto.setBounds(91, 173, 133, 23);
		TelaPrincipal.getContentPane().add(btnAdicionarProduto);
		
		JButton btnCancelarProduto = new JButton("Cancelar Produto");
		btnCancelarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CancelarProduto(dbproduto, dbpessoa, dblista).open(dbproduto, dbpessoa, dblista);
			}
		});
		btnCancelarProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelarProduto.setBackground(new Color(135, 206, 250));
		btnCancelarProduto.setBounds(91, 207, 133, 23);
		TelaPrincipal.getContentPane().add(btnCancelarProduto);
		
		JButton btnChamarCliente = new JButton("Chamar Gerente");
		btnChamarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChamarGerente().open();
			}
		});
		btnChamarCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChamarCliente.setBackground(new Color(135, 206, 250));
		btnChamarCliente.setBounds(91, 241, 133, 23);
		TelaPrincipal.getContentPane().add(btnChamarCliente);
		
		JButton btnLogoff = new JButton("Logoff");
		btnLogoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal.setVisible(false);
				new LoginInterface();
			}
		});
		btnLogoff.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogoff.setBackground(new Color(135, 206, 250));
		btnLogoff.setBounds(91, 275, 133, 23);
		TelaPrincipal.getContentPane().add(btnLogoff);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double valorPago = Double.parseDouble(txtvalorPago.getText());
				
				
				double troco = valorPago - Double.parseDouble(lbltotal.getText());
	
				lbltroco.setText(Double.toString(troco));
				
			}
		});
		btnFinalizarCompra.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFinalizarCompra.setBackground(new Color(135, 206, 250));
		btnFinalizarCompra.setBounds(364, 275, 133, 23);
		TelaPrincipal.getContentPane().add(btnFinalizarCompra);
	}

}
