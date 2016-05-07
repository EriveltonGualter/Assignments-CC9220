
public class Retangulo extends Forma{
	private int comprimento;
	private int largura;
	
	public Retangulo (String t, int c, int l) {
		super(t);
		setComprimento(c);
		setLargura(l);
	}
	
	public void setComprimento(int c) {
		comprimento = c;
	}
	
	public void setLargura(int l) {
		largura = l;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public double perimetro() {
		return 2*(comprimento + largura);
	}
	
	public String toString() {
		return String.format("\n%s \nPerimetro: %.2f", super.toString(), perimetro());
	}
}
