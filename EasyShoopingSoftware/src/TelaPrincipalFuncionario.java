import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;


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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalFuncionario window = new TelaPrincipalFuncionario();
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
	public TelaPrincipalFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		TelaPrincipal.getContentPane().add(txtID);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 10, 71, 32);
		TelaPrincipal.getContentPane().add(lblId);
		
		JLabel lblQtd = new JLabel("Qtd:");
		lblQtd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQtd.setBounds(10, 42, 71, 32);
		TelaPrincipal.getContentPane().add(lblQtd);
		
		txtQtd = new JTextField();
		txtQtd.setHorizontalAlignment(SwingConstants.CENTER);
		txtQtd.setText("(Quantidade)");
		txtQtd.setColumns(10);
		txtQtd.setBounds(91, 48, 133, 20);
		TelaPrincipal.getContentPane().add(txtQtd);
		
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
		
		JLabel label_2 = new JLabel("<valor>");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(91, 142, 133, 20);
		TelaPrincipal.getContentPane().add(label_2);
		
		JButton btnAdicionarProduto = new JButton("Adicionar Produto");
		btnAdicionarProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionarProduto.setBackground(new Color(135, 206, 250));
		btnAdicionarProduto.setBounds(91, 173, 133, 23);
		TelaPrincipal.getContentPane().add(btnAdicionarProduto);
		
		JButton btnCancelarProduto = new JButton("Cancelar Produto");
		btnCancelarProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelarProduto.setBackground(new Color(135, 206, 250));
		btnCancelarProduto.setBounds(91, 207, 133, 23);
		TelaPrincipal.getContentPane().add(btnCancelarProduto);
		
		JButton btnChamarCliente = new JButton("Chamar Cliente");
		btnChamarCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChamarCliente.setBackground(new Color(135, 206, 250));
		btnChamarCliente.setBounds(91, 241, 133, 23);
		TelaPrincipal.getContentPane().add(btnChamarCliente);
		
		JButton btnLogoff = new JButton("Logoff");
		btnLogoff.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogoff.setBackground(new Color(135, 206, 250));
		btnLogoff.setBounds(91, 275, 133, 23);
		TelaPrincipal.getContentPane().add(btnLogoff);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFinalizarCompra.setBackground(new Color(135, 206, 250));
		btnFinalizarCompra.setBounds(364, 275, 133, 23);
		TelaPrincipal.getContentPane().add(btnFinalizarCompra);
		
		txtcpf = new JTextField();
		txtcpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtcpf.setText("(CPF)");
		txtcpf.setColumns(10);
		txtcpf.setBounds(364, 238, 133, 20);
		TelaPrincipal.getContentPane().add(txtcpf);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(283, 232, 71, 32);
		TelaPrincipal.getContentPane().add(lblCpf);
		
		JLabel label_1 = new JLabel("<troco>");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(364, 210, 133, 20);
		TelaPrincipal.getContentPane().add(label_1);
		
		JLabel lblTroco = new JLabel("Troco:");
		lblTroco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTroco.setBounds(283, 210, 71, 20);
		TelaPrincipal.getContentPane().add(lblTroco);
		
		txtvalorPago = new JTextField();
		txtvalorPago.setText("(Valor Pago)");
		txtvalorPago.setHorizontalAlignment(SwingConstants.CENTER);
		txtvalorPago.setColumns(10);
		txtvalorPago.setBounds(364, 178, 133, 20);
		TelaPrincipal.getContentPane().add(txtvalorPago);
		
		JLabel lblValorPago = new JLabel("Valor Pago:");
		lblValorPago.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorPago.setBounds(283, 172, 71, 32);
		TelaPrincipal.getContentPane().add(lblValorPago);
		
		JLabel label_5 = new JLabel("<total>");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(364, 142, 133, 20);
		TelaPrincipal.getContentPane().add(label_5);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setBounds(283, 142, 71, 20);
		TelaPrincipal.getContentPane().add(lblTotal);
		
		table = new JTable();
		table.setBounds(293, 16, 244, 118);
		TelaPrincipal.getContentPane().add(table);
	}

}
