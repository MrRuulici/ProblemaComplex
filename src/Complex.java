
public class Complex {
	
	private double r, i;
	private static int contor = 0;
	
	public Complex(double r, double i) {

		this.r = r;
		this.i = i;
		contor ++;
		
	}
	
	public double Calcul() {
		
		double calcul = Math.sqrt(r*r + i*i);
		return calcul;
		
	}

	public void Afisare() {
		
		System.out.println("Numarul complex = " + (r+"+ i"+i));
		
	}
	
	public Complex Suma(Complex z) {
		Complex Z = new Complex(z.r , z.i);
		Z.r = Z.r + r;
		Z.i = Z.i + i;
		return Z;
	}
	
	public int Contor() {
		return contor;
	}
	
}
