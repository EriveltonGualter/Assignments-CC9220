
public class MAIN {
	public static void main(String args[]){
		Forma formas[] = new Forma[2];
		formas[0] = new Circulo("Circulo", 9);
		formas[1] = new Retangulo("Retangulo", 4, 2);
		
		for (Forma formaCorrente:formas) {
			System.out.println(formaCorrente);
			
			if(formaCorrente instanceof Circulo) {
				Circulo forma = (Circulo) formaCorrente;
				System.out.printf("Area %.2f", forma.area());
			}
		}
	}
}
