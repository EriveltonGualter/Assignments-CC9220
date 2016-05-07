
public abstract class Forma {
	private String tipo;
	
	public Forma(String t) {
		tipo = t;
	}
	
	public void setTipo(String t) {
		tipo = t;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public abstract double perimetro();
	
	public String toString() {
		return String.format("\nTipo = %s", getTipo());
	}	
}
