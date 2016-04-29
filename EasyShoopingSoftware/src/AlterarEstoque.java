import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;


public class AlterarEstoque {

	private JFrame frmAlterarEstoque;
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
	private JLabel label_10;
	private JLabel label;
	private JTextField txtid;
	private JButton btnPesquisar;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarEstoque window = new AlterarEstoque();
					window.frmAlterarEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AlterarEstoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlterarEstoque = new JFrame();
		frmAlterarEstoque.setType(Type.UTILITY);
		frmAlterarEstoque.setTitle("Alterar Estoque");
		frmAlterarEstoque.setBounds(100, 100, 392, 467);
		frmAlterarEstoque.getContentPane().setLayout(null);
		
		txtquantidade = new JTextField();
		txtquantidade.setText("(Quantidade)");
		txtquantidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtquantidade.setColumns(10);
		txtquantidade.setBounds(115, 121, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtquantidade);
		
		JLabel lblQted = new JLabel("Qte. min.");
		lblQted.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQted.setBounds(10, 160, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblQted);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(10, 121, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblQuantidade);
		
		txtqteMin = new JTextField();
		txtqteMin.setText("(Qte. min.)");
		txtqteMin.setHorizontalAlignment(SwingConstants.CENTER);
		txtqteMin.setColumns(10);
		txtqteMin.setBounds(115, 160, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtqteMin);
		
		JLabel lblPreoDaVenda = new JLabel("Unidade:");
		lblPreoDaVenda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda.setBounds(10, 199, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblPreoDaVenda);
		
		txtunidade = new JTextField();
		txtunidade.setText("(Unidade)");
		txtunidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtunidade.setColumns(10);
		txtunidade.setBounds(115, 199, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtunidade);
		
		txtpreoDaVenda = new JTextField();
		txtpreoDaVenda.setText("(Pre\u00E7o da Venda)");
		txtpreoDaVenda.setHorizontalAlignment(SwingConstants.CENTER);
		txtpreoDaVenda.setColumns(10);
		txtpreoDaVenda.setBounds(115, 238, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtpreoDaVenda);
		
		JLabel lblPreoDaVenda_1 = new JLabel("Pre\u00E7o da Venda:");
		lblPreoDaVenda_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda_1.setBounds(10, 238, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblPreoDaVenda_1);
		
		JLabel label_4 = new JLabel("Pre\u00E7o da Compra:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 277, 95, 33);
		frmAlterarEstoque.getContentPane().add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setText("(Pre\u00E7o da Compra)");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(115, 277, 122, 33);
		frmAlterarEstoque.getContentPane().add(textField_4);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClassificao.setBounds(10, 316, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblClassificao);
		
		txtclassificao = new JTextField();
		txtclassificao.setText("(Classifica\u00E7\u00E3o)");
		txtclassificao.setHorizontalAlignment(SwingConstants.CENTER);
		txtclassificao.setColumns(10);
		txtclassificao.setBounds(115, 316, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtclassificao);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(115, 394, 122, 23);
		frmAlterarEstoque.getContentPane().add(btnVoltar);
		
		btnAdicionar = new JButton("Salvar");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionar.setBackground(new Color(135, 206, 250));
		btnAdicionar.setBounds(115, 360, 122, 23);
		frmAlterarEstoque.getContentPane().add(btnAdicionar);
		
		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 82, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblNome);
		
		txtnome = new JTextField();
		txtnome.setText("(Nome)");
		txtnome.setHorizontalAlignment(SwingConstants.CENTER);
		txtnome.setColumns(10);
		txtnome.setBounds(115, 82, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtnome);
		
		lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 11, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblId);
		
		label_10 = new JLabel("<Status>");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(243, 355, 95, 33);
		frmAlterarEstoque.getContentPane().add(label_10);
		
		label = new JLabel("<Status>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(115, 42, 122, 33);
		frmAlterarEstoque.getContentPane().add(label);
		
		txtid = new JTextField();
		txtid.setText("(ID)");
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setColumns(10);
		txtid.setBounds(111, 11, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtid);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisar.setBackground(new Color(135, 206, 250));
		btnPesquisar.setBounds(243, 16, 122, 23);
		frmAlterarEstoque.getContentPane().add(btnPesquisar);
	}
}
