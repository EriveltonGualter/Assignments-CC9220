import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;


public class ExcluirEstoque {

	private JFrame frmExcluirEstoque;
	private JButton btnVoltar;
	private JLabel lblNome;
	private JLabel lblId;
	private JLabel label_10;
	private JLabel label;
	private JTextField txtid;
	private JButton btnPesquisar;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JButton btnExcluir;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirEstoque window = new ExcluirEstoque();
					window.frmExcluirEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExcluirEstoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExcluirEstoque = new JFrame();
		frmExcluirEstoque.setType(Type.UTILITY);
		frmExcluirEstoque.setTitle("Excluir Estoque");
		frmExcluirEstoque.setBounds(100, 100, 393, 477);
		frmExcluirEstoque.getContentPane().setLayout(null);
		
		JLabel lblQted = new JLabel("Qte. min.");
		lblQted.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQted.setBounds(10, 160, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblQted);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(10, 121, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblQuantidade);
		
		JLabel lblPreoDaVenda = new JLabel("Unidade:");
		lblPreoDaVenda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda.setBounds(10, 199, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblPreoDaVenda);
		
		JLabel lblPreoDaVenda_1 = new JLabel("Pre\u00E7o da Venda:");
		lblPreoDaVenda_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda_1.setBounds(10, 238, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblPreoDaVenda_1);
		
		JLabel label_4 = new JLabel("Pre\u00E7o da Compra:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 277, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_4);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClassificao.setBounds(10, 316, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblClassificao);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(115, 405, 122, 23);
		frmExcluirEstoque.getContentPane().add(btnVoltar);
		
		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 82, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblNome);
		
		lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 11, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblId);
		
		label_10 = new JLabel("<Status>");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(125, 373, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_10);
		
		label = new JLabel("<Status Pesquisa>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(115, 42, 122, 33);
		frmExcluirEstoque.getContentPane().add(label);
		
		txtid = new JTextField();
		txtid.setText("(ID)");
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setColumns(10);
		txtid.setBounds(111, 11, 122, 33);
		frmExcluirEstoque.getContentPane().add(txtid);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisar.setBackground(new Color(135, 206, 250));
		btnPesquisar.setBounds(243, 16, 122, 23);
		frmExcluirEstoque.getContentPane().add(btnPesquisar);
		
		label_1 = new JLabel("<Nome>");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(125, 82, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_1);
		
		label_2 = new JLabel("<Quantidade>");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(125, 121, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_2);
		
		label_3 = new JLabel("<Qte. min>");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(125, 160, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_3);
		
		label_5 = new JLabel("<Unidade>");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(125, 199, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_5);
		
		label_6 = new JLabel("<Pre\u00E7o da Venda>");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(125, 238, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_6);
		
		label_7 = new JLabel("<Pre\u00E7o da Compra>");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(125, 277, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_7);
		
		label_8 = new JLabel("<Classifica\u00E7\u00E3o>");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(125, 316, 95, 33);
		frmExcluirEstoque.getContentPane().add(label_8);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.setBackground(new Color(135, 206, 250));
		btnExcluir.setBounds(115, 349, 122, 23);
		frmExcluirEstoque.getContentPane().add(btnExcluir);
	}
}
