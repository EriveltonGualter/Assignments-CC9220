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


public class ConsultarFuncionario {

	private JFrame frmConsultarFuncionario;
	private JTextField txtcpf;

	/**
	 * Launch the application.
	 */
	public static void open(PessoaDB dbpessoa) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarFuncionario window = new ConsultarFuncionario(dbpessoa);
					window.frmConsultarFuncionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarFuncionario(PessoaDB dbpessoa) {
		initialize(dbpessoa);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(PessoaDB dbpessoa) {
		frmConsultarFuncionario = new JFrame();
		frmConsultarFuncionario.setType(Type.UTILITY);
		frmConsultarFuncionario.setTitle("Consultar Funcionario");
		frmConsultarFuncionario.setBounds(100, 100, 420, 325);
		frmConsultarFuncionario.getContentPane().setLayout(null);
		
		txtcpf = new JTextField();
		txtcpf.setText("(CPF)");
		txtcpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtcpf.setColumns(10);
		txtcpf.setBounds(82, 11, 153, 33);
		frmConsultarFuncionario.getContentPane().add(txtcpf);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(10, 11, 66, 33);
		frmConsultarFuncionario.getContentPane().add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 89, 66, 33);
		frmConsultarFuncionario.getContentPane().add(lblNome);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFuno.setBounds(10, 133, 66, 33);
		frmConsultarFuncionario.getContentPane().add(lblFuno);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTurno.setBounds(10, 172, 66, 33);
		frmConsultarFuncionario.getContentPane().add(lblTurno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setBounds(10, 211, 66, 33);
		frmConsultarFuncionario.getContentPane().add(lblIdade);
		
		JLabel lblstatus = new JLabel("<Status>");
		lblstatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblstatus.setBounds(82, 55, 153, 23);
		frmConsultarFuncionario.getContentPane().add(lblstatus);
		
		JLabel label_nome = new JLabel("<Nome>");
		label_nome.setHorizontalAlignment(SwingConstants.CENTER);
		label_nome.setBounds(82, 89, 153, 33);
		frmConsultarFuncionario.getContentPane().add(label_nome);
		
		JLabel label_funcao = new JLabel("<Fun\u00E7\u00E3o>");
		label_funcao.setHorizontalAlignment(SwingConstants.CENTER);
		label_funcao.setBounds(82, 133, 153, 33);
		frmConsultarFuncionario.getContentPane().add(label_funcao);
		
		JLabel label_turno = new JLabel("<Turno>");
		label_turno.setHorizontalAlignment(SwingConstants.CENTER);
		label_turno.setBounds(82, 172, 153, 33);
		frmConsultarFuncionario.getContentPane().add(label_turno);
		
		JLabel label_idade = new JLabel("<Idade>");
		label_idade.setHorizontalAlignment(SwingConstants.CENTER);
		label_idade.setBounds(86, 211, 149, 33);
		frmConsultarFuncionario.getContentPane().add(label_idade);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf 	= txtcpf.getText();
				
				Pessoa pessoa = new Pessoa();
				pessoa = dbpessoa.consultar(cpf);
				
				if (pessoa != null) {
					lblstatus.setText("OK");
					label_nome.setText(pessoa.getNome());
				}
				else{
					lblstatus.setText("NAO EXISTE");
					label_nome.setText("");
				}
							
			}
		});
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisar.setBackground(new Color(135, 206, 250));
		btnPesquisar.setBounds(262, 16, 122, 23);
		frmConsultarFuncionario.getContentPane().add(btnPesquisar);
		
		JButton button_1 = new JButton("Voltar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmConsultarFuncionario.setVisible(false);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(135, 206, 250));
		button_1.setBounds(96, 252, 122, 23);
		frmConsultarFuncionario.getContentPane().add(button_1);
	}

}
