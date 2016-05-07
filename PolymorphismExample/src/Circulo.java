
public class Circulo extends Forma{
	private int raio;
	
	public Circulo( String t, int r) {
		super(t);
		setRaio(r);
	}
	
	public void setRaio(int r) {
		raio = r;
	}
	
	public int getRaio() {
		return raio;
	}
	
	public double area() {
		return Math.PI*raio*raio;
	}
	
	public double perimetro() {
		return 2*Math.PI*raio;
	}
	
	public String toString() {
		return String.format("\n%s \nPerimetro: %.2f", super.toString(), perimetro());
	}
}
