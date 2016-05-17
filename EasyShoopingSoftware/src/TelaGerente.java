import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class TelaGerente extends JFrame implements ActionListener {
	
	JButton btnEstoque		= new JButton("Estoque");
	JButton btnFuncionario 	= new JButton("Funcionário");
	JButton btnFinanceiro 	= new JButton("Relatório Financeiro");
	JButton btnLogoff 		= new JButton("Logoff");
	
	JLabel rVazio1 		= new JLabel("");
	JLabel rVazio2 		= new JLabel("");
	
	private PessoaDB dbpessoa;
	private ProdutoDB dbproduto;
	
	public TelaGerente(PessoaDB dbpessoa, ProdutoDB dbproduto) {
		
		Container windows = getContentPane();
		windows.setLayout(new GridLayout(3, 2));
		
		btnEstoque.addActionListener(this);
		btnFuncionario.addActionListener(this);
		btnFinanceiro.addActionListener(this);
		btnLogoff.addActionListener(this);
		
		windows.add(rVazio1);
		windows.add(rVazio2);
		windows.add(btnEstoque);
		windows.add(btnFinanceiro);
		windows.add(btnFuncionario);
		windows.add(btnLogoff);
		
		TelaEstoque 	telaEstoque 	= new TelaEstoque(dbproduto);
		TelaFuncionario telaFuncionario = new TelaFuncionario(dbpessoa);
        
		setTitle("Tela Principal - Gerente");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		
		this.dbpessoa = dbpessoa;
		this.dbproduto = dbproduto;
	}
	
	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == btnEstoque) {
			TelaEstoque.open(dbproduto);
			
		} else if (evento.getSource() == btnFuncionario) {
			TelaFuncionario.open(dbpessoa);
		   	
		} else if (evento.getSource() == btnFinanceiro) {
			RelatorioFinanceiro.open();
			
		} else if (evento.getSource() == btnLogoff) {
			setVisible(false); 
			dispose();
			new LoginInterface();
		}
	}
	
	public void open(PessoaDB dbpessoa, ProdutoDB dbproduto) {
		TelaGerente telaGerente = new TelaGerente(dbpessoa, dbproduto);
	}

}
