import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIDefaults.LazyValue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DemitirFuncionario {

	private JFrame frmDemitirFuncionario;
	private JTextField txtcpf;

	/**
	 * Launch the application.
	 */
	public static void open(PessoaDB dbpessoa) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemitirFuncionario window = new DemitirFuncionario(dbpessoa);
					window.frmDemitirFuncionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemitirFuncionario(PessoaDB dbpessoa) {
		initialize(dbpessoa);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(PessoaDB dbpessoa) {
		frmDemitirFuncionario = new JFrame();
		frmDemitirFuncionario.setType(Type.UTILITY);
		frmDemitirFuncionario.setTitle("Demitir Funcionario");
		frmDemitirFuncionario.setBounds(100, 100, 420, 402);
		frmDemitirFuncionario.getContentPane().setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(10, 11, 66, 33);
		frmDemitirFuncionario.getContentPane().add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 89, 66, 33);
		frmDemitirFuncionario.getContentPane().add(lblNome);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFuno.setBounds(10, 133, 66, 33);
		frmDemitirFuncionario.getContentPane().add(lblFuno);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTurno.setBounds(10, 172, 66, 33);
		frmDemitirFuncionario.getContentPane().add(lblTurno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setBounds(10, 211, 66, 33);
		frmDemitirFuncionario.getContentPane().add(lblIdade);
		
		txtcpf = new JTextField();
		txtcpf.setText("(CPF)");
		txtcpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtcpf.setColumns(10);
		txtcpf.setBounds(82, 11, 180, 33);
		frmDemitirFuncionario.getContentPane().add(txtcpf);
		
		JLabel label_status = new JLabel("<Status Pesquisa>");
		label_status.setHorizontalAlignment(SwingConstants.CENTER);
		label_status.setBounds(92, 55, 170, 23);
		frmDemitirFuncionario.getContentPane().add(label_status);
		
		JLabel label_nome = new JLabel("<Nome>");
		label_nome.setHorizontalAlignment(SwingConstants.CENTER);
		label_nome.setBounds(102, 89, 160, 33);
		frmDemitirFuncionario.getContentPane().add(label_nome);
		
		JLabel label_funcao = new JLabel("<Fun\u00E7\u00E3o>");
		label_funcao.setHorizontalAlignment(SwingConstants.CENTER);
		label_funcao.setBounds(102, 133, 160, 33);
		frmDemitirFuncionario.getContentPane().add(label_funcao);
		
		JLabel label_turno = new JLabel("<Turno>");
		label_turno.setHorizontalAlignment(SwingConstants.CENTER);
		label_turno.setBounds(102, 172, 160, 33);
		frmDemitirFuncionario.getContentPane().add(label_turno);
		
		JLabel label_idade = new JLabel("<Idade>");
		label_idade.setHorizontalAlignment(SwingConstants.CENTER);
		label_idade.setBounds(102, 211, 160, 33);
		frmDemitirFuncionario.getContentPane().add(label_idade);
		
		JLabel label_demitir = new JLabel("<Status Demitir>");
		label_demitir.setHorizontalAlignment(SwingConstants.CENTER);
		label_demitir.setBounds(102, 289, 160, 33);
		frmDemitirFuncionario.getContentPane().add(label_demitir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf 	= txtcpf.getText();
				
				Pessoa pessoa = new Pessoa();
				pessoa = dbpessoa.consultar(cpf);
				
				if (pessoa != null) {
					label_status.setText("OK");
					label_nome.setText(pessoa.getNome());
				}
				else{
					label_status.setText("NAO EXISTE");
					label_nome.setText("");
				}
			}
		});
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisar.setBackground(new Color(135, 206, 250));
		btnPesquisar.setBounds(272, 16, 122, 23);
		frmDemitirFuncionario.getContentPane().add(btnPesquisar);
		
		JButton btnDemitir = new JButton("Demitir");
		btnDemitir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf 	= txtcpf.getText();
				
            	if (dbpessoa.excluir(cpf)) 
            		label_demitir.setText("DEMITIDO");
            	else
            		label_demitir.setText("FALHOU");
			}
		});
		btnDemitir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDemitir.setBackground(new Color(135, 206, 250));
		btnDemitir.setBounds(123, 255, 122, 23);
		frmDemitirFuncionario.getContentPane().add(btnDemitir);
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDemitirFuncionario.setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(135, 206, 250));
		button.setBounds(123, 333, 122, 23);
		frmDemitirFuncionario.getContentPane().add(button);
	}
}
