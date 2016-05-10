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


public class EditarFuncionario {

	private JFrame frmEditarFuncionario;
	private JTextField txtcpf;
	private JTextField txtnome;
	private JTextField txtsenha;
	private JTextField txtfuncao;
	private JTextField txtturno;
	private JTextField txtidade;

	/**
	 * Launch the application.
	 */
	public static void open(PessoaDB dbpessoa) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarFuncionario window = new EditarFuncionario(dbpessoa);
					window.frmEditarFuncionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditarFuncionario(PessoaDB dbpessoa) {
		initialize(dbpessoa);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(PessoaDB dbpessoa) {
		frmEditarFuncionario = new JFrame();
		frmEditarFuncionario.setType(Type.UTILITY);
		frmEditarFuncionario.setTitle("Editar Funcionario");
		frmEditarFuncionario.setBounds(100, 100, 359, 396);
		frmEditarFuncionario.getContentPane().setLayout(null);
		
		JLabel lbl_status1 = new JLabel("<Status>");
		lbl_status1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_status1.setBounds(92, 55, 95, 23);
		frmEditarFuncionario.getContentPane().add(lbl_status1);
		
		JLabel lbl_status2 = new JLabel("<Status>");
		lbl_status2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_status2.setBounds(226, 285, 95, 23);
		frmEditarFuncionario.getContentPane().add(lbl_status2);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(10, 11, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 89, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(10, 128, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblSenha);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFuno.setBounds(10, 167, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblFuno);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTurno.setBounds(10, 206, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblTurno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setBounds(10, 245, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblIdade);
		
		txtcpf = new JTextField();
		txtcpf.setText("(CPF)");
		txtcpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtcpf.setColumns(10);
		txtcpf.setBounds(82, 11, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtcpf);
		
		txtnome = new JTextField();
		txtnome.setText("(Nome)");
		txtnome.setHorizontalAlignment(SwingConstants.CENTER);
		txtnome.setColumns(10);
		txtnome.setBounds(82, 89, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtnome);
		
		txtsenha = new JTextField();
		txtsenha.setText("(Senha)");
		txtsenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtsenha.setColumns(10);
		txtsenha.setBounds(82, 128, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtsenha);
		
		txtfuncao = new JTextField();
		txtfuncao.setText("(Fun\u00E7\u00E3o)");
		txtfuncao.setHorizontalAlignment(SwingConstants.CENTER);
		txtfuncao.setColumns(10);
		txtfuncao.setBounds(82, 167, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtfuncao);
		
		txtturno = new JTextField();
		txtturno.setText("(Turno)");
		txtturno.setHorizontalAlignment(SwingConstants.CENTER);
		txtturno.setColumns(10);
		txtturno.setBounds(82, 206, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtturno);
		
		txtidade = new JTextField();
		txtidade.setText("(Idade)");
		txtidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtidade.setColumns(10);
		txtidade.setBounds(82, 245, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtidade);
		
		JButton btn_salvar = new JButton("Salvar");
		btn_salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = txtcpf.getText();
				String nome = txtnome.getText();
				String funcao = txtfuncao.getText();
				String turno = txtturno.getText();
				int idade = Integer.parseInt(txtidade.getText());
				
                if (dbpessoa.alterar(cpf, nome, funcao, turno, idade)) {
                	lbl_status2.setText("Alterado");
                }
                else {
                	lbl_status2.setText("N'ao Alterado");
                }
			}
		});
		btn_salvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_salvar.setBackground(new Color(135, 206, 250));
		btn_salvar.setBounds(82, 285, 122, 23);
		frmEditarFuncionario.getContentPane().add(btn_salvar);
		
		JButton btn_pesquisar = new JButton("Pesquisar");
		btn_pesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf 	= txtcpf.getText();
				
				Pessoa pessoa = new Pessoa();
				pessoa = dbpessoa.consultar(cpf);
				
				if (pessoa != null) {
					lbl_status1.setText("OK");
					txtnome.setText(pessoa.getNome());
					txtfuncao.setText(pessoa.getFuncao());
					txtturno.setText(pessoa.getTurno());
					txtidade.setText(Integer.toString(pessoa.getIdade()));
				}
				else{
					lbl_status1.setText("NAO EXISTE");
				}
			}
		});
		btn_pesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_pesquisar.setBackground(new Color(135, 206, 250));
		btn_pesquisar.setBounds(214, 16, 122, 23);
		frmEditarFuncionario.getContentPane().add(btn_pesquisar);
		
		JButton btn_voltar = new JButton("Voltar");
		btn_voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEditarFuncionario.setVisible(false);
			}
		});
		btn_voltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_voltar.setBackground(new Color(135, 206, 250));
		btn_voltar.setBounds(82, 319, 122, 23);
		frmEditarFuncionario.getContentPane().add(btn_voltar);
	}

}
