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


public class IncluirEstoque {

	private JFrame frmIncluirEstoque;
	private JTextField txtquantidade;
	private JTextField txtqteMin;
	private JTextField txtunidade;
	private JTextField txtpreoDaVenda;
	private JTextField txtprecoComrpa;
	private JTextField txtclassificao;
	private JButton btnVoltar;
	private JButton btnAdicionar;
	private JLabel lblNome;
	private JTextField txtnome;
	private JLabel lblId;
	private JLabel lblid;
	private JLabel lblstatus;
	
	private Produto Produtos[] = new Produto[20];

	/**
	 * Launch the application.
	 */
	public static void open(ProdutoDB dbproduto) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirEstoque window = new IncluirEstoque(dbproduto);
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
	public IncluirEstoque(ProdutoDB dbproduto) {
		initialize(dbproduto);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ProdutoDB dbproduto) {
		frmIncluirEstoque = new JFrame();
		frmIncluirEstoque.setType(Type.UTILITY);
		frmIncluirEstoque.setTitle("Incluir Estoque");
		frmIncluirEstoque.setBounds(100, 100, 272, 434);
		frmIncluirEstoque.getContentPane().setLayout(null);
		
		JLabel lblQted = new JLabel("Qte. min.");
		lblQted.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQted.setBounds(10, 128, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblQted);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(10, 89, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblQuantidade);
		
		JLabel lblPreoDaVenda = new JLabel("Unidade:");
		lblPreoDaVenda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda.setBounds(10, 167, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblPreoDaVenda);
		
		JLabel lblPreoDaVenda_1 = new JLabel("Pre\u00E7o da Venda:");
		lblPreoDaVenda_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDaVenda_1.setBounds(10, 206, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblPreoDaVenda_1);
		
		lblstatus = new JLabel("<Status>");
		lblstatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus.setBounds(125, 318, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblstatus);
		
		JLabel label_4 = new JLabel("Pre\u00E7o da Compra:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 245, 95, 33);
		frmIncluirEstoque.getContentPane().add(label_4);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClassificao.setBounds(10, 284, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblClassificao);
		
		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 50, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblNome);
		
		lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 6, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblId);
		
		lblid = new JLabel("<ID>");
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setBounds(126, 6, 95, 33);
		frmIncluirEstoque.getContentPane().add(lblid);
		
		txtqteMin = new JTextField();
		txtqteMin.setText("(Qte. min.)");
		txtqteMin.setHorizontalAlignment(SwingConstants.CENTER);
		txtqteMin.setColumns(10);
		txtqteMin.setBounds(115, 128, 122, 33);
		txtqteMin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtqteMin.setText("");
            }
		});
		frmIncluirEstoque.getContentPane().add(txtqteMin);
		
		txtquantidade = new JTextField();
		txtquantidade.setText("(Quantidade)");
		txtquantidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtquantidade.setColumns(10);
		txtquantidade.setBounds(115, 89, 122, 33);
		txtquantidade.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtquantidade.setText("");
            }
		});
		frmIncluirEstoque.getContentPane().add(txtquantidade);
		
		txtunidade = new JTextField();
		txtunidade.setText("(Unidade)");
		txtunidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtunidade.setColumns(10);
		txtunidade.setBounds(115, 167, 122, 33);
		txtunidade.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtunidade.setText("");
            }
		});
		frmIncluirEstoque.getContentPane().add(txtunidade);
		
		txtpreoDaVenda = new JTextField();
		txtpreoDaVenda.setText("(Pre\u00E7o da Venda)");
		txtpreoDaVenda.setHorizontalAlignment(SwingConstants.CENTER);
		txtpreoDaVenda.setColumns(10);
		txtpreoDaVenda.setBounds(115, 206, 122, 33);
		txtpreoDaVenda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtpreoDaVenda.setText("");
            }
		});
		frmIncluirEstoque.getContentPane().add(txtpreoDaVenda);
		
		txtprecoComrpa = new JTextField();
		txtprecoComrpa.setText("(Pre\u00E7o da Compra)");
		txtprecoComrpa.setHorizontalAlignment(SwingConstants.CENTER);
		txtprecoComrpa.setColumns(10);
		txtprecoComrpa.setBounds(115, 245, 122, 33);
		txtprecoComrpa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtprecoComrpa.setText("");
            }
		});
		frmIncluirEstoque.getContentPane().add(txtprecoComrpa);
		
		txtclassificao = new JTextField();
		txtclassificao.setText("(Classifica\u00E7\u00E3o)");
		txtclassificao.setHorizontalAlignment(SwingConstants.CENTER);
		txtclassificao.setColumns(10);
		txtclassificao.setBounds(115, 284, 122, 33);
		txtclassificao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtclassificao.setText("");
            }
		});
		frmIncluirEstoque.getContentPane().add(txtclassificao);
		
		txtnome = new JTextField();
		txtnome.setText("(Nome)");
		txtnome.setHorizontalAlignment(SwingConstants.CENTER);
		txtnome.setColumns(10);
		txtnome.setBounds(115, 50, 122, 33);
		txtnome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	txtnome.setText("");
            }
		});
		frmIncluirEstoque.getContentPane().add(txtnome);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtnome.getText();
				int qte = Integer.parseInt(txtquantidade.getText());
				int qte_min = Integer.parseInt(txtqteMin.getText());
				int unidade = Integer.parseInt(txtunidade.getText());
				int preco_venda = Integer.parseInt(txtpreoDaVenda.getText());
				int preco_compra = Integer.parseInt(txtprecoComrpa.getText());
				String classificacao = txtclassificao.getText();
				
				int flag = dbproduto.incluir(nome, qte, qte_min, unidade, preco_venda, preco_compra, classificacao);
				if ( flag != 0) {
					lblstatus.setText("Inserido");
					lblid.setText(Integer.toString(flag));
				}
				else 
					lblstatus.setText("Nao Inserido");
			}
		});
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionar.setBackground(new Color(135, 206, 250));
		btnAdicionar.setBounds(10, 328, 95, 23);
		frmIncluirEstoque.getContentPane().add(btnAdicionar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIncluirEstoque.setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(10, 362, 95, 23);
		frmIncluirEstoque.getContentPane().add(btnVoltar);
	}
}
