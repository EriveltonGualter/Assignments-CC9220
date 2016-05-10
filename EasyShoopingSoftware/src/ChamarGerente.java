import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ChamarGerente {

	private JFrame frmChamarGerente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChamarGerente window = new ChamarGerente();
					window.frmChamarGerente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChamarGerente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChamarGerente = new JFrame();
		frmChamarGerente.setTitle("Chamar Gerente");
		frmChamarGerente.setBounds(100, 100, 312, 155);
		frmChamarGerente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChamarGerente.getContentPane().setLayout(null);
		
		JLabel lblSolicitaoEnviada = new JLabel("Solicita\u00E7\u00E3o Enviada");
		lblSolicitaoEnviada.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolicitaoEnviada.setBounds(79, 30, 133, 20);
		frmChamarGerente.getContentPane().add(lblSolicitaoEnviada);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmChamarGerente.setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(135, 206, 250));
		btnVoltar.setBounds(79, 61, 133, 23);
		frmChamarGerente.getContentPane().add(btnVoltar);
	}

}
