import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class IncluirFuncionario {

	private JFrame frmIncluirFuncionario;
	private JTextField txtcpf;
	private JTextField txtnome;
	private JTextField txtsenha;
	private JTextField txtfuno;
	private JTextField txtturno;
	private JTextField txtidade;

	/**
	 * Launch the application.
	 */
	public static void open(PessoaDB dbpessoa) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirFuncionario window = new IncluirFuncionario(dbpessoa);
					window.frmIncluirFuncionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IncluirFuncionario(PessoaDB dbpessoa) {
		initialize(dbpessoa);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(PessoaDB dbpessoa) {
		frmIncluirFuncionario = new JFrame();
		frmIncluirFuncionario.setType(Type.UTILITY);
		frmIncluirFuncionario.setTitle("Incluir Funcionario");
		frmIncluirFuncionario.setBounds(100, 100, 330, 348);
		frmIncluirFuncionario.getContentPane().setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(10, 11, 66, 33);
		frmIncluirFuncionario.getContentPane().add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 50, 66, 33);
		frmIncluirFuncionario.getContentPane().add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(10, 89, 66, 33);
		frmIncluirFuncionario.getContentPane().add(lblSenha);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFuno.setBounds(10, 128, 66, 33);
		frmIncluirFuncionario.getContentPane().add(lblFuno);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTurno.setBounds(10, 167, 66, 33);
		frmIncluirFuncionario.getContentPane().add(lblTurno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setBounds(10, 206, 66, 33);
		frmIncluirFuncionario.getContentPane().add(lblIdade);
		
		JLabel lblstatus = new JLabel("<status>");
		lblstatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus.setBounds(214, 241, 66, 33);
		frmIncluirFuncionario.getContentPane().add(lblstatus);
		
		txtcpf = new JTextField();
		txtcpf.setText("(CPF)");
		txtcpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtcpf.setColumns(10);
		txtcpf.setBounds(82, 11, 122, 33);
		frmIncluirFuncionario.getContentPane().add(txtcpf);
		
		txtnome = new JTextField();
		txtnome.setText("(Nome)");
		txtnome.setHorizontalAlignment(SwingConstants.CENTER);
		txtnome.setColumns(10);
		txtnome.setBounds(82, 50, 122, 33);
		frmIncluirFuncionario.getContentPane().add(txtnome);
		
		txtsenha = new JTextField();
		txtsenha.setText("(Senha)");
		txtsenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtsenha.setColumns(10);
		txtsenha.setBounds(82, 89, 122, 33);
		frmIncluirFuncionario.getContentPane().add(txtsenha);
		
		txtfuno = new JTextField();
		txtfuno.setText("(Fun\u00E7\u00E3o)");
		txtfuno.setHorizontalAlignment(SwingConstants.CENTER);
		txtfuno.setColumns(10);
		txtfuno.setBounds(82, 128, 122, 33);
		frmIncluirFuncionario.getContentPane().add(txtfuno);
		
		txtturno = new JTextField();
		txtturno.setText("(Turno)");
		txtturno.setHorizontalAlignment(SwingConstants.CENTER);
		txtturno.setColumns(10);
		txtturno.setBounds(82, 167, 122, 33);
		frmIncluirFuncionario.getContentPane().add(txtturno);
		
		txtidade = new JTextField();
		txtidade.setText("(Idade)");
		txtidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtidade.setColumns(10);
		txtidade.setBounds(82, 206, 122, 33);
		frmIncluirFuncionario.getContentPane().add(txtidade);
		
		JButton button = new JButton("Adicionar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf 	= txtcpf.getText();
				String nome = txtnome.getText();
				
				if(dbpessoa.incluir(cpf, nome, null))
					lblstatus.setText("INSERIDA");
                else
                	lblstatus.setText("NÃO INSERIDA");				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(135, 206, 250));
		button.setBounds(82, 246, 122, 23);
		frmIncluirFuncionario.getContentPane().add(button);
		
		JButton button_1 = new JButton("Voltar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIncluirFuncionario.setVisible(false);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(135, 206, 250));
		button_1.setBounds(82, 280, 122, 23);
		frmIncluirFuncionario.getContentPane().add(button_1);
	}
}
