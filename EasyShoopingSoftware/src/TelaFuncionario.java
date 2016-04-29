import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;


public class TelaFuncionario {

	private JFrame frmFuncionario;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionario window = new TelaFuncionario();
					window.frmFuncionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFuncionario = new JFrame();
		frmFuncionario.setFont(new Font("Dialog", Font.BOLD, 12));
		frmFuncionario.getContentPane().setBackground(new Color(248, 248, 255));
		frmFuncionario.setTitle("Funcionario");
		frmFuncionario.setType(Type.UTILITY);
		frmFuncionario.setBounds(100, 100, 450, 300);
		frmFuncionario.getContentPane().setLayout(null);
		
		frmFuncionario.setSize(120, 250);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIncluir.setBackground(new Color(135, 206, 250));
		btnIncluir.setBounds(10, 11, 100, 23);
		frmFuncionario.getContentPane().add(btnIncluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConsultar.setBackground(new Color(135, 206, 250));
		btnConsultar.setBounds(10, 45, 100, 23);
		frmFuncionario.getContentPane().add(btnConsultar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.setBackground(new Color(135, 206, 250));
		btnExcluir.setBounds(10, 79, 100, 23);
		frmFuncionario.getContentPane().add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAlterar.setBackground(new Color(135, 206, 250));
		btnAlterar.setBounds(10, 113, 100, 23);
		frmFuncionario.getContentPane().add(btnAlterar);
		
		JButton btnListarTodos = new JButton("Listar Todos");
		btnListarTodos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListarTodos.setBackground(new Color(135, 206, 250));
		btnListarTodos.setBounds(10, 147, 100, 23);
		frmFuncionario.getContentPane().add(btnListarTodos);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(10, 181, 100, 23);
		frmFuncionario.getContentPane().add(btnVoltar);
	}
}
