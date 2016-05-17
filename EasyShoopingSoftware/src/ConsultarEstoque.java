import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ConsultarEstoque {

	private JFrame frmConsultarEstoque;
	private JButton btnVoltar;
	private JLabel lblNome;
	private JLabel lblId;
	private JLabel lblstatus;
	private JTextField txtid;
	private JButton btnPesquisar;
	private JLabel lbnome;
	private JLabel lblqte;
	private JLabel lblqtemin;
	private JLabel lblunid;
	private JLabel lblpv;
	private JLabel lblpc;
	private JLabel lblclassificacao;
	
	private Produto Produtos[] = new Produto[20];

	/**
	 * Launch the application.
	 */
	public static void open(ProdutoDB dbproduto) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarEstoque window = new ConsultarEstoque(dbproduto);
					window.frmConsultarEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarEstoque(ProdutoDB dbproduto) {
		initialize(dbproduto);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ProdutoDB dbproduto) {
		frmConsultarEstoque = new JFrame();
		frmConsultarEstoque.setType(Type.UTILITY);
		frmConsultarEstoque.setTitle("Consultar Estoque");
		frmConsultarEstoque.setBounds(100, 100, 392, 424);
		frmConsultarEstoque.getContentPane().setLayout(null);
		
		JLabel lblQted = new JLabel("Qte. min.");
		lblQted.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQted.setBounds(10, 160, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblQted);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(10, 121, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblQuantidade);
		
		JLabel lblPreoDaVenda = new JLabel("Unidade:");
		lblPreoDaVenda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda.setBounds(10, 199, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblPreoDaVenda);
		
		JLabel lblPreoDaVenda_1 = new JLabel("Pre\u00E7o da Venda:");
		lblPreoDaVenda_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda_1.setBounds(10, 238, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblPreoDaVenda_1);
		
		JLabel label_4 = new JLabel("Pre\u00E7o da Compra:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 277, 95, 33);
		frmConsultarEstoque.getContentPane().add(label_4);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClassificao.setBounds(10, 316, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblClassificao);
		
		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 82, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblNome);
		
		lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 11, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblId);
		
		lblstatus = new JLabel("<Status>");
		lblstatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus.setBounds(115, 42, 122, 33);
		frmConsultarEstoque.getContentPane().add(lblstatus);
		
		txtid = new JTextField();
		txtid.setText("(ID)");
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setColumns(10);
		txtid.setBounds(111, 11, 122, 33);
		txtid.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtid.setText("");
            }
		});
		frmConsultarEstoque.getContentPane().add(txtid);
		
		lbnome = new JLabel("<Nome>");
		lbnome.setHorizontalAlignment(SwingConstants.CENTER);
		lbnome.setBounds(125, 82, 95, 33);
		frmConsultarEstoque.getContentPane().add(lbnome);
		
		lblqte = new JLabel("<Quantidade>");
		lblqte.setHorizontalAlignment(SwingConstants.CENTER);
		lblqte.setBounds(125, 121, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblqte);
		
		lblqtemin = new JLabel("<Qte. min>");
		lblqtemin.setHorizontalAlignment(SwingConstants.CENTER);
		lblqtemin.setBounds(125, 160, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblqtemin);
		
		lblunid = new JLabel("<Unidade>");
		lblunid.setHorizontalAlignment(SwingConstants.CENTER);
		lblunid.setBounds(125, 199, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblunid);
		
		lblpv = new JLabel("<Pre\u00E7o da Venda>");
		lblpv.setHorizontalAlignment(SwingConstants.CENTER);
		lblpv.setBounds(125, 238, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblpv);
		
		lblpc = new JLabel("<Pre\u00E7o da Compra>");
		lblpc.setHorizontalAlignment(SwingConstants.CENTER);
		lblpc.setBounds(125, 277, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblpc);
		
		lblclassificacao = new JLabel("<Classifica\u00E7\u00E3o>");
		lblclassificacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblclassificacao.setBounds(125, 316, 95, 33);
		frmConsultarEstoque.getContentPane().add(lblclassificacao);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmConsultarEstoque.setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(115, 360, 122, 23);
		frmConsultarEstoque.getContentPane().add(btnVoltar);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				int id = Integer.parseInt(txtid.getText());

				Produto produto = new Produto();
				produto = dbproduto.consultar(id);
				
				if (produto != null) {
					lbnome.setText(produto.getNome());
					lblqte.setText(Double.toString(produto.getQte()));
					lblqtemin.setText(Double.toString(produto.getQte_min()));
					lblunid.setText(produto.getUnidade());
					lblpv.setText(Double.toString(produto.getPreco_venda()));
					lblpc.setText(Double.toString(produto.getPreco_compra()));
					lblclassificacao.setText(produto.getClassificacao());
					lblstatus.setText("Valido");
					
				}
				else{
					lblstatus.setText("NAO EXISTE");
					lblqte.setText("");
					lblqtemin.setText("");
					lblunid.setText("");
					lblpv.setText("");
					lblpc.setText("");
					lblclassificacao.setText("");
				}
			}
		});
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisar.setBackground(new Color(135, 206, 250));
		btnPesquisar.setBounds(243, 16, 122, 23);
		frmConsultarEstoque.getContentPane().add(btnPesquisar);
	}
}
