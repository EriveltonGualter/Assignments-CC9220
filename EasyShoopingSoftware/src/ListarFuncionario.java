import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ListarFuncionario {

	private JFrame frmListarFuncionario;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void open(PessoaDB dbpessoa) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarFuncionario window = new ListarFuncionario(dbpessoa);
					window.frmListarFuncionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListarFuncionario(PessoaDB dbpessoa) {
		initialize(dbpessoa);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(PessoaDB dbpessoa) {
		frmListarFuncionario = new JFrame();
		frmListarFuncionario.setTitle("Lista de Funcionarios");
		frmListarFuncionario.setBounds(100, 100, 520, 312);
		frmListarFuncionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListarFuncionario.getContentPane().setLayout(null);
			
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmListarFuncionario.setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(135, 206, 250));
		button.setBounds(399, 242, 95, 23);
		frmListarFuncionario.getContentPane().add(button);
			
		Object [][] dados = new Object[20][5];
		
		dados[0][0] = "CPF";
		dados[0][1] = "Nome";
		dados[0][2] = "Função";
		dados[0][3] = "Turno";
		dados[0][4] = "Idade";
				
		for(int i=0; i<dbpessoa.listar().length; i++) {
    		Pessoa plist = dbpessoa.listar()[i];
    		if (plist != null) {
				dados[i+1][0] = plist.getNome();
				dados[i+1][1] = plist.getCpf();
				dados[i+1][2] = plist.getFuncao();
				dados[i+1][3] = plist.getTurno();
				dados[i+1][4] = plist.getIdade();
    		}
    	}

		String [] Colunas = {"CPF", "Nome", "Função", "Turno", "Idade"};
		
		table = new JTable(dados, Colunas);
		table.setBounds(10, 10, 484, 221);
		frmListarFuncionario.getContentPane().add(table);
	}

}
