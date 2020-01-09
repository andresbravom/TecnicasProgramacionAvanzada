package ejercicios.Polinomio;

public class Main {

	public static void main(String[] args) {
		double a[] = {-3.5, 2.5, 3.0, -4.0}; 
		double b[] = {-3.5, 2.5, 3.0, -4.0};

		Polinomio p1 = new Polinomio(a);
		Polinomio p2 = new Polinomio(b);

		String f = "f(x)";
		String g = "g(x)";

		String resultf = p1.toString(p1, f );
		String resultg = p2.toString(p2, g);

		System.out.println(resultf);


		p1.evalua(p1, -1);
		p2.evalua(p2, -1);

		System.out.println("f(-1) = " + p1.evalua(p1, -1));
		System.out.println("f'(x) = " + p1.derivada().toString(p1.derivada(), f));
		System.out.println("f'(x) = " + p1.derivada().evalua(p1.derivada(), -1));

		System.out.println("\n" + resultg);
		System.out.println("g(-1) = " + p2.evalua(p2, -1));
		System.out.println("g'(x) = " + p2.derivada().toString(p2.derivada(), g));
		System.out.println("f'(x) = " + p2.derivada().evalua(p2.derivada(), -1));

		System.out.println(p1.suma(p1, p2).toString(p1.suma(p1, p2), f));

		System.out.println(p1.esIgual(p1, p2));

	}

}
