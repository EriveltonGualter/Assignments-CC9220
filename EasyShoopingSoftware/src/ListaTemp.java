
public class ListaTemp {
	private int id;
	private String nome;
	private double qte;
	private double preco;
	
	ListaTemp (int i, String n, double q, double p) {
		id = i;
		nome = n;
		qte = q;
		preco = p;
	}
	
	ListaTemp () {
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public void setQte (double q) {
		qte = q;
	}
	
	public void setPreco (double p) {
		preco = p;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getQte() {
		return qte;
	}
	
	public double getPreco() {
		return preco;
	}
}
