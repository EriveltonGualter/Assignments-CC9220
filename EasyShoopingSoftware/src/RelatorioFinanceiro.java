import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JComboBox;


public class RelatorioFinanceiro {

	private JFrame frmRelatrioFinanceiro;
	private JTextField txtDataInicial;
	private JTextField txtDataFinal;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelatorioFinanceiro window = new RelatorioFinanceiro();
					window.frmRelatrioFinanceiro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RelatorioFinanceiro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRelatrioFinanceiro = new JFrame();
		frmRelatrioFinanceiro.setTitle("Relat\u00F3rio Financeiro");
		frmRelatrioFinanceiro.setBounds(100, 100, 450, 500);
		frmRelatrioFinanceiro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRelatrioFinanceiro.getContentPane().setLayout(null);
		
		txtDataInicial = new JTextField();
		txtDataInicial.setBounds(81, 17, 86, 20);
		frmRelatrioFinanceiro.getContentPane().add(txtDataInicial);
		txtDataInicial.setColumns(10);
		
		txtDataFinal = new JTextField();
		txtDataFinal.setColumns(10);
		txtDataFinal.setBounds(328, 17, 86, 20);
		frmRelatrioFinanceiro.getContentPane().add(txtDataFinal);
		
		JLabel lblDataInicial = new JLabel("Data Inicial:");
		lblDataInicial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataInicial.setBounds(0, 11, 71, 32);
		frmRelatrioFinanceiro.getContentPane().add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data Final:");
		lblDataFinal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataFinal.setBounds(247, 11, 71, 32);
		frmRelatrioFinanceiro.getContentPane().add(lblDataFinal);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProduto.setBounds(0, 49, 71, 32);
		frmRelatrioFinanceiro.getContentPane().add(lblProduto);
		
		JLabel lblPeriodo = new JLabel("Per\u00EDodo:");
		lblPeriodo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeriodo.setBounds(0, 87, 71, 32);
		frmRelatrioFinanceiro.getContentPane().add(lblPeriodo);
		
		JRadioButton rdbSemanal = new JRadioButton("Semanal");
		rdbSemanal.setBounds(82, 93, 109, 20);
		frmRelatrioFinanceiro.getContentPane().add(rdbSemanal);
		
		JRadioButton rdbMensal = new JRadioButton("Mensal");
		rdbMensal.setBounds(81, 116, 109, 20);
		frmRelatrioFinanceiro.getContentPane().add(rdbMensal);
		
		JRadioButton rdbAnual = new JRadioButton("Anual");
		rdbAnual.setBounds(81, 139, 109, 20);
		frmRelatrioFinanceiro.getContentPane().add(rdbAnual);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisar.setBackground(new Color(135, 206, 250));
		btnPesquisar.setBounds(81, 166, 110, 23);
		frmRelatrioFinanceiro.getContentPane().add(btnPesquisar);
		
		JLabel label = new JLabel("<Status>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(247, 166, 95, 23);
		frmRelatrioFinanceiro.getContentPane().add(label);
		
		JLabel lblVendasPorPerodo = new JLabel("Vendas por per\u00EDodo");
		lblVendasPorPerodo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendasPorPerodo.setBounds(26, 200, 95, 23);
		frmRelatrioFinanceiro.getContentPane().add(lblVendasPorPerodo);
		
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOk.setBackground(new Color(135, 206, 250));
		btnOk.setBounds(162, 427, 110, 23);
		frmRelatrioFinanceiro.getContentPane().add(btnOk);
		
		table_1 = new JTable();
		table_1.setBounds(26, 229, 382, 185);
		frmRelatrioFinanceiro.getContentPane().add(table_1);
	}
}
