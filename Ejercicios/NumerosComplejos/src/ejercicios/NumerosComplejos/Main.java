package ejercicios.NumerosComplejos;

public class Main {

	public static void main(String[] args) {
		NumerosComplejos a, b, i;
		
		a = new NumerosComplejos(  1, -2 );
		b = new NumerosComplejos(  4,  3 );
		i = new NumerosComplejos( 0, 1 );
		
		System.out.println(NumerosComplejos.toString("a", a));
		System.out.println(NumerosComplejos.toString("b", b));
		System.out.println(NumerosComplejos.toString("i", i));
		System.out.println(NumerosComplejos.toString("suma(a,b)       ",NumerosComplejos.suma(a, b)));
		System.out.println(NumerosComplejos.toString("resta(a,b)      ",NumerosComplejos.resta(a, b)));
		System.out.println(NumerosComplejos.toString("producto(i,i)   ",NumerosComplejos.producto(i, i)));
		
	}
}
