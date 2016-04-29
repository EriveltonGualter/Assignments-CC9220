import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaEstoque {

	private JFrame frmEstoque;

	/**
	 * Launch the application.
	 */
	public static void open(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoque window = new TelaEstoque();
					window.frmEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaEstoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEstoque = new JFrame();
		frmEstoque.setFont(new Font("Dialog", Font.BOLD, 12));
		frmEstoque.getContentPane().setBackground(new Color(248, 248, 255));
		frmEstoque.setTitle("Estoque");
		frmEstoque.setType(Type.UTILITY);
		frmEstoque.setBounds(100, 100, 450, 300);
		frmEstoque.getContentPane().setLayout(null);
		
		frmEstoque.setSize(120, 250);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new IncluirEstoque().open();
			}
		});
		btnIncluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIncluir.setBackground(new Color(135, 206, 250));
		btnIncluir.setBounds(10, 11, 100, 23);
		frmEstoque.getContentPane().add(btnIncluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ConsultarEstoque().open();
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConsultar.setBackground(new Color(135, 206, 250));
		btnConsultar.setBounds(10, 45, 100, 23);
		frmEstoque.getContentPane().add(btnConsultar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ExcluirEstoque().open();
			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.setBackground(new Color(135, 206, 250));
		btnExcluir.setBounds(10, 79, 100, 23);
		frmEstoque.getContentPane().add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AlterarEstoque().open();
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAlterar.setBackground(new Color(135, 206, 250));
		btnAlterar.setBounds(10, 113, 100, 23);
		frmEstoque.getContentPane().add(btnAlterar);
		
		JButton btnListarTodos = new JButton("Listar Todos");
		btnListarTodos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListarTodos.setBackground(new Color(135, 206, 250));
		btnListarTodos.setBounds(10, 147, 100, 23);
		frmEstoque.getContentPane().add(btnListarTodos);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(10, 181, 100, 23);
		frmEstoque.getContentPane().add(btnVoltar);
		
	}
}
