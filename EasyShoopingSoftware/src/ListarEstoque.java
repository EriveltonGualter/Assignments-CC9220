import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ListarEstoque {

	private JFrame frmListarEstoque;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void open(ProdutoDB dbproduto) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarEstoque window = new ListarEstoque(dbproduto);
					window.frmListarEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListarEstoque(ProdutoDB dbproduto) {
		initialize(dbproduto);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ProdutoDB dbproduto) {
		frmListarEstoque = new JFrame();
		frmListarEstoque.setTitle("Listar Estoque");
		frmListarEstoque.setBounds(100, 100, 520, 312);
		frmListarEstoque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListarEstoque.getContentPane().setLayout(null);
			
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmListarEstoque.setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(135, 206, 250));
		button.setBounds(399, 242, 95, 23);
		frmListarEstoque.getContentPane().add(button);
		
		Object [][] dados = new Object[20][8];
		
		dados[0][0] = "ID";
		dados[0][1] = "Nome"; 
		dados[0][2] = "Qte.";
		dados[0][3] = "Qte. min."; 
		dados[0][4] = "Unidade";
		dados[0][5] = "Preço de Venda";
		dados[0][6] = "Preço de Compra"; 
		dados[0][7] = "Classsificação";
				
		for(int i=0; i<dbproduto.listar().length; i++) {
    		Produto plist = dbproduto.listar()[i];
    		if (plist != null) {
				dados[i+1][0] = plist.getid();
				dados[i+1][1] = plist.getNome();
				dados[i+1][2] = plist.getQte();
				dados[i+1][3] = plist.getQte_min();
				dados[i+1][4] = plist.getUnidade();
				dados[i+1][5] = plist.getPreco_venda();
				dados[i+1][6] = plist.getPreco_compra();
				dados[i+1][7] = plist.getClassificacao();
    		}
    	}

		String [] Colunas = {"ID", "Nome", "Qte.", "Qte. min.", "Unidade", "Preço de Venda", "Preço de Compra", "Classsificação"};
		
		table = new JTable(dados, Colunas);
		table.setBounds(10, 10, 484, 221);
		frmListarEstoque.getContentPane().add(table);

	}
}
