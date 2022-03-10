
public class ClientComplex {

	public static void main(String[] args) {
		Complex a = new Complex(12,20);
		Complex b = new Complex(10, 15);
		a.Afisare();
		double calcul = a.Calcul();
		System.out.println(calcul);
		int contor = a.Contor();
		System.out.println(contor);
		Complex c = a.Suma(b);
		
		c.Afisare();
		a.Contor();
		

	}
	

}
