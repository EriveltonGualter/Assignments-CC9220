import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaFuncionario {

	private JFrame frmFuncionario;

	/**
	 * Launch the application.
	 */
	public static void open(PessoaDB dbpessoa) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionario window = new TelaFuncionario(dbpessoa);
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
	public TelaFuncionario(PessoaDB dbpessoa) {
		initialize(dbpessoa);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(PessoaDB dbpessoa) {
		frmFuncionario = new JFrame();
		frmFuncionario.setFont(new Font("Dialog", Font.BOLD, 12));
		frmFuncionario.getContentPane().setBackground(new Color(248, 248, 255));
		frmFuncionario.setTitle("Funcionario");
		frmFuncionario.setType(Type.UTILITY);
		frmFuncionario.setBounds(100, 100, 450, 300);
		frmFuncionario.getContentPane().setLayout(null);
		frmFuncionario.setSize(120, 250);
		
		Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(120, 250);
        int wdwLeft = 300 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        frmFuncionario.setLocation(wdwLeft, wdwTop);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new IncluirFuncionario(dbpessoa).open(dbpessoa);
			}
		});
		btnIncluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIncluir.setBackground(new Color(135, 206, 250));
		btnIncluir.setBounds(10, 11, 100, 23);
		frmFuncionario.getContentPane().add(btnIncluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ConsultarFuncionario(dbpessoa).open(dbpessoa);
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConsultar.setBackground(new Color(135, 206, 250));
		btnConsultar.setBounds(10, 45, 100, 23);
		frmFuncionario.getContentPane().add(btnConsultar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DemitirFuncionario(dbpessoa).open(dbpessoa);
			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.setBackground(new Color(135, 206, 250));
		btnExcluir.setBounds(10, 79, 100, 23);
		frmFuncionario.getContentPane().add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EditarFuncionario(dbpessoa).open(dbpessoa);
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAlterar.setBackground(new Color(135, 206, 250));
		btnAlterar.setBounds(10, 113, 100, 23);
		frmFuncionario.getContentPane().add(btnAlterar);
		
		JButton btnListarTodos = new JButton("Listar Todos");
		btnListarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarFuncionario(dbpessoa).open(dbpessoa);
			}
		});
		btnListarTodos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListarTodos.setBackground(new Color(135, 206, 250));
		btnListarTodos.setBounds(10, 147, 100, 23);
		frmFuncionario.getContentPane().add(btnListarTodos);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFuncionario.setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(10, 181, 100, 23);
		frmFuncionario.getContentPane().add(btnVoltar);
	}
}
