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


public class AlterarEstoque {

	private JFrame frmAlterarEstoque;
	private JTextField txtquantidade;
	private JTextField txtqteMin;
	private JTextField txtunidade;
	private JTextField txtpreoDaVenda;
	private JTextField txtprecocompra;
	private JTextField txtclassificao;
	private JButton btnVoltar;
	private JButton btnAdicionar;
	private JLabel lblNome;
	private JTextField txtnome;
	private JLabel lblId;
	private JLabel lblstatus2;
	private JLabel lblstatus;
	private JTextField txtid;
	private JButton btnPesquisar;

	/**
	 * Launch the application.
	 */
	public static void open(ProdutoDB dbproduto) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarEstoque window = new AlterarEstoque(dbproduto);
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
	public AlterarEstoque(ProdutoDB dbproduto) {
		initialize(dbproduto);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ProdutoDB dbproduto) {
		frmAlterarEstoque = new JFrame();
		frmAlterarEstoque.setType(Type.UTILITY);
		frmAlterarEstoque.setTitle("Alterar Estoque");
		frmAlterarEstoque.setBounds(100, 100, 392, 467);
		frmAlterarEstoque.getContentPane().setLayout(null);
		
		txtqteMin = new JTextField();
		txtqteMin.setText("(Qte. min.)");
		txtqteMin.setHorizontalAlignment(SwingConstants.CENTER);
		txtqteMin.setColumns(10);
		txtqteMin.setBounds(115, 160, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtqteMin);
		
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
		
		txtprecocompra = new JTextField();
		txtprecocompra.setText("(Pre\u00E7o da Compra)");
		txtprecocompra.setHorizontalAlignment(SwingConstants.CENTER);
		txtprecocompra.setColumns(10);
		txtprecocompra.setBounds(115, 277, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtprecocompra);
		
		txtclassificao = new JTextField();
		txtclassificao.setText("(Classifica\u00E7\u00E3o)");
		txtclassificao.setHorizontalAlignment(SwingConstants.CENTER);
		txtclassificao.setColumns(10);
		txtclassificao.setBounds(115, 316, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtclassificao);
		
		txtnome = new JTextField();
		txtnome.setText("(Nome)");
		txtnome.setHorizontalAlignment(SwingConstants.CENTER);
		txtnome.setColumns(10);
		txtnome.setBounds(115, 82, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtnome);
		
		txtquantidade = new JTextField();
		txtquantidade.setText("(Quantidade)");
		txtquantidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtquantidade.setColumns(10);
		txtquantidade.setBounds(115, 121, 122, 33);
		frmAlterarEstoque.getContentPane().add(txtquantidade);
		
		txtid = new JTextField();
		txtid.setText("(ID)");
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setColumns(10);
		txtid.setBounds(115, 11, 122, 33);
		txtid.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtid.setText("");
            }
		});
		frmAlterarEstoque.getContentPane().add(txtid);
		
		JLabel lblQted = new JLabel("Qte. min.");
		lblQted.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQted.setBounds(10, 160, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblQted);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(10, 121, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblQuantidade);
		
		JLabel lblPreoDaVenda = new JLabel("Unidade:");
		lblPreoDaVenda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda.setBounds(10, 199, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblPreoDaVenda);
		
		JLabel lblPreoDaVenda_1 = new JLabel("Pre\u00E7o da Venda:");
		lblPreoDaVenda_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda_1.setBounds(10, 238, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblPreoDaVenda_1);
		
		JLabel label_4 = new JLabel("Pre\u00E7o da Compra:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 277, 95, 33);
		frmAlterarEstoque.getContentPane().add(label_4);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClassificao.setBounds(10, 316, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblClassificao);
		
		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 82, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblNome);
		
		lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 11, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblId);
		
		lblstatus2 = new JLabel("<Status>");
		lblstatus2.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus2.setBounds(243, 355, 95, 33);
		frmAlterarEstoque.getContentPane().add(lblstatus2);
		
		lblstatus = new JLabel("<Status>");
		lblstatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus.setBounds(115, 42, 122, 33);
		frmAlterarEstoque.getContentPane().add(lblstatus);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtid.getText());

				Produto produto = new Produto();
				produto = dbproduto.consultar(id);
				
				if (produto != null) {
					txtnome.setText(produto.getNome());
					txtquantidade.setText(Integer.toString(produto.getQte()));
					txtqteMin.setText(Integer.toString(produto.getQte_min()));
					txtunidade.setText(Integer.toString(produto.getUnidade()));
					txtpreoDaVenda.setText(Integer.toString(produto.getPreco_venda()));
					txtprecocompra.setText(Integer.toString(produto.getPreco_compra()));
					txtclassificao.setText(produto.getClassificacao());
					lblstatus.setText("Valido");
				}
				else{
					lblstatus.setText("NAO EXISTE");
					txtnome.setText("");
					txtquantidade.setText("");
					txtqteMin.setText("");
					txtunidade.setText("");
					txtpreoDaVenda.setText("");
					txtprecocompra.setText("");
					txtclassificao.setText("");
					lblstatus.setText("");
				}
			}
		});
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAlterarEstoque.setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(115, 394, 122, 23);
		frmAlterarEstoque.getContentPane().add(btnVoltar);
		
		btnAdicionar = new JButton("Salvar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtid.getText());
				String nome = txtnome.getText();
				int qte = Integer.parseInt(txtquantidade.getText());
				int qte_min = Integer.parseInt(txtqteMin.getText());
				int unidade = Integer.parseInt(txtunidade.getText());
				int preco_venda = Integer.parseInt(txtpreoDaVenda.getText());
				int preco_compra = Integer.parseInt(txtprecocompra.getText());
				String classificacao = txtclassificao.getText();
				
				if (dbproduto.alterar(id, nome, qte, qte_min, unidade, preco_venda, preco_compra, classificacao)) {
					lblstatus2.setText("Alterado");
				}
				else
					lblstatus2.setText("Não Alterado");
			}
		});
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionar.setBackground(new Color(135, 206, 250));
		btnAdicionar.setBounds(115, 360, 122, 23);
		frmAlterarEstoque.getContentPane().add(btnAdicionar);
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisar.setBackground(new Color(135, 206, 250));
		btnPesquisar.setBounds(243, 16, 122, 23);
		frmAlterarEstoque.getContentPane().add(btnPesquisar);
	}
}
