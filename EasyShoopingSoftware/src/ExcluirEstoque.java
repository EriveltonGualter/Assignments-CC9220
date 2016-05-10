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


public class ExcluirEstoque {

	private JFrame frmExcluirEstoque;
	private JButton btnVoltar;
	private JLabel lblNome;
	private JLabel lblId;
	private JLabel lblstatus2;
	private JLabel lblstatus1;
	private JTextField txtid;
	private JButton btnPesquisar;
	private JLabel lblnome;
	private JLabel lblquant;
	private JLabel lblquantmin;
	private JLabel lblunid;
	private JLabel lblpv;
	private JLabel lblpc;
	private JLabel lblc;
	private JButton btnExcluir;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void open(ProdutoDB dbproduto) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirEstoque window = new ExcluirEstoque(dbproduto);
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
	public ExcluirEstoque(ProdutoDB dbproduto) {
		initialize(dbproduto);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ProdutoDB dbproduto) {
		frmExcluirEstoque = new JFrame();
		frmExcluirEstoque.setType(Type.UTILITY);
		frmExcluirEstoque.setTitle("Excluir Estoque");
		frmExcluirEstoque.setBounds(100, 100, 393, 477);
		frmExcluirEstoque.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("<ID>");
		textField.setBounds(134, 17, 86, 20);
		textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            	textField.setText("");
            }
		});
		frmExcluirEstoque.getContentPane().add(textField);
		textField.setColumns(10);
		
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
		
		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 82, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblNome);
		
		lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 11, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblId);
		
		lblstatus2 = new JLabel("<Status>");
		lblstatus2.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus2.setBounds(125, 373, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblstatus2);
		
		lblstatus1 = new JLabel("<Status Pesquisa>");
		lblstatus1.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus1.setBounds(115, 42, 122, 33);
		frmExcluirEstoque.getContentPane().add(lblstatus1);
		
		lblnome = new JLabel("<Nome>");
		lblnome.setHorizontalAlignment(SwingConstants.CENTER);
		lblnome.setBounds(125, 82, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblnome);
		
		lblquant = new JLabel("<Quantidade>");
		lblquant.setHorizontalAlignment(SwingConstants.CENTER);
		lblquant.setBounds(125, 121, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblquant);
		
		lblquantmin = new JLabel("<Qte. min>");
		lblquantmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblquantmin.setBounds(125, 160, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblquantmin);
		
		lblunid = new JLabel("<Unidade>");
		lblunid.setHorizontalAlignment(SwingConstants.CENTER);
		lblunid.setBounds(125, 199, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblunid);
		
		lblpv = new JLabel("<Pre\u00E7o da Venda>");
		lblpv.setHorizontalAlignment(SwingConstants.CENTER);
		lblpv.setBounds(125, 238, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblpv);
		
		lblpc = new JLabel("<Pre\u00E7o da Compra>");
		lblpc.setHorizontalAlignment(SwingConstants.CENTER);
		lblpc.setBounds(125, 277, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblpc);
		
		lblc = new JLabel("<Classifica\u00E7\u00E3o>");
		lblc.setHorizontalAlignment(SwingConstants.CENTER);
		lblc.setBounds(125, 316, 95, 33);
		frmExcluirEstoque.getContentPane().add(lblc);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmExcluirEstoque.setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(115, 405, 122, 23);
		frmExcluirEstoque.getContentPane().add(btnVoltar);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id	= Integer.parseInt(textField.getText());
				
				Produto produto = new Produto();
				produto = dbproduto.consultar(id);
				
				if (produto != null) {
					lblstatus1.setText("OK");
					lblquant.setText(Integer.toString(produto.getQte()));
					lblquantmin.setText(Integer.toString(produto.getQte_min()));
					lblunid.setText(Integer.toString(produto.getUnidade()));
					lblpv.setText(Integer.toString(produto.getPreco_venda()));
					lblpc.setText(Integer.toString(produto.getPreco_compra()));
					lblc.setText(produto.getClassificacao());
				}
				else{
					lblstatus1.setText("NAO EXISTE");
					lblquant.setText("");
					lblquantmin.setText("");
					lblunid.setText("");
					lblpv.setText("");
					lblpc.setText("");
					lblc.setText("");
				}
			}
		});
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisar.setBackground(new Color(135, 206, 250));
		btnPesquisar.setBounds(243, 16, 122, 23);
		frmExcluirEstoque.getContentPane().add(btnPesquisar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id	= Integer.parseInt(textField.getText());
				
            	if (dbproduto.excluir(id)) 
            		lblstatus2.setText("DELATADO");
            	else
            		lblstatus2.setText("FALHOU");
			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.setBackground(new Color(135, 206, 250));
		btnExcluir.setBounds(115, 349, 122, 23);
		frmExcluirEstoque.getContentPane().add(btnExcluir);
	}
}
