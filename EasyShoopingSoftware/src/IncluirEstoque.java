import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;


public class IncluirEstoque {

	private JFrame frmIncluirEstoque;
	private JTextField txtquantidade;
	private JTextField txtqteMin;
	private JTextField txtunidade;
	private JTextField txtpreoDaVenda;
	private JTextField textField_4;
	private JTextField txtclassificao;
	private JButton btnVoltar;
	private JButton btnAdicionar;
	private JLabel lblNome;
	private JTextField txtnome;
	private JLabel lblId;
	private JLabel label_9;
	private JLabel label_10;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirEstoque window = new IncluirEstoque();
					window.frmIncluirEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IncluirEstoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIncluirEstoque = new JFrame();
		frmIncluirEstoque.setType(Type.UTILITY);
		frmIncluirEstoque.setTitle("Incluir Estoque");
		frmIncluirEstoque.setBounds(100, 100, 272, 434);
		frmIncluirEstoque.getContentPane().setLayout(null);
		
		txtquantidade = new JTextField();
		txtquantidade.setText("(Quantidade)");
		txtquantidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtquantidade.setColumns(10);
		txtquantidade.setBounds(115, 89, 122, 33);
		frmIncluirEstoque.getContentPane().add(txtquantidade);
		
		JLabel lblQted = new JLabel("Qte. min.");
		lblQted.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQted.setBounds(10, 128, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblQted);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(10, 89, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblQuantidade);
		
		txtqteMin = new JTextField();
		txtqteMin.setText("(Qte. min.)");
		txtqteMin.setHorizontalAlignment(SwingConstants.CENTER);
		txtqteMin.setColumns(10);
		txtqteMin.setBounds(115, 128, 122, 33);
		frmIncluirEstoque.getContentPane().add(txtqteMin);
		
		JLabel lblPreoDaVenda = new JLabel("Unidade:");
		lblPreoDaVenda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda.setBounds(10, 167, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblPreoDaVenda);
		
		txtunidade = new JTextField();
		txtunidade.setText("(Unidade)");
		txtunidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtunidade.setColumns(10);
		txtunidade.setBounds(115, 167, 122, 33);
		frmIncluirEstoque.getContentPane().add(txtunidade);
		
		txtpreoDaVenda = new JTextField();
		txtpreoDaVenda.setText("(Pre\u00E7o da Venda)");
		txtpreoDaVenda.setHorizontalAlignment(SwingConstants.CENTER);
		txtpreoDaVenda.setColumns(10);
		txtpreoDaVenda.setBounds(115, 206, 122, 33);
		frmIncluirEstoque.getContentPane().add(txtpreoDaVenda);
		
		JLabel lblPreoDaVenda_1 = new JLabel("Pre\u00E7o da Venda:");
		lblPreoDaVenda_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda_1.setBounds(10, 206, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblPreoDaVenda_1);
		
		JLabel label_4 = new JLabel("Pre\u00E7o da Compra:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 245, 95, 33);
		frmIncluirEstoque.getContentPane().add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setText("(Pre\u00E7o da Compra)");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(115, 245, 122, 33);
		frmIncluirEstoque.getContentPane().add(textField_4);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClassificao.setBounds(10, 284, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblClassificao);
		
		txtclassificao = new JTextField();
		txtclassificao.setText("(Classifica\u00E7\u00E3o)");
		txtclassificao.setHorizontalAlignment(SwingConstants.CENTER);
		txtclassificao.setColumns(10);
		txtclassificao.setBounds(115, 284, 122, 33);
		frmIncluirEstoque.getContentPane().add(txtclassificao);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(10, 362, 95, 23);
		frmIncluirEstoque.getContentPane().add(btnVoltar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionar.setBackground(new Color(135, 206, 250));
		btnAdicionar.setBounds(10, 328, 95, 23);
		frmIncluirEstoque.getContentPane().add(btnAdicionar);
		
		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 50, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblNome);
		
		txtnome = new JTextField();
		txtnome.setText("(Nome)");
		txtnome.setHorizontalAlignment(SwingConstants.CENTER);
		txtnome.setColumns(10);
		txtnome.setBounds(115, 50, 122, 33);
		frmIncluirEstoque.getContentPane().add(txtnome);
		
		lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 6, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblId);
		
		label_9 = new JLabel("<ID>");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(126, 6, 95, 33);
		frmIncluirEstoque.getContentPane().add(label_9);
		
		label_10 = new JLabel("<Status>");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(125, 318, 95, 33);
		frmIncluirEstoque.getContentPane().add(label_10);
	}
}
