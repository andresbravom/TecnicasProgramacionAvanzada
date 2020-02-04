package ejercicios.Polinomio;

public class Polinomio {

	private int grado;
	private double [] coeficientes;
	
	public Polinomio(double [] coeficientes) {
	this.grado = coeficientes.length - 1;
	this.coeficientes = new double[coeficientes.length];
	
	for (int i=0; i<coeficientes.length; i++)
		this.coeficientes[i] = coeficientes[i];
	}
	
	public double evalua(double x) {
		return Polinomio.evalua(this, x);
	}
	
	public static double evalua(Polinomio p, double x) {
		double r = 0.0;
	
		for (int i=p.grado; i>=0; i--)
			r = r + p.coeficientes[i] * Math.pow(x, i);
	
	return r;
	}
	
	public Polinomio derivada() {
		return Polinomio.derivada(this);
	}
	
	public static Polinomio derivada(Polinomio p) {
		double [] coeficientes = new double[p.grado];
	
		for (int i=p.grado; i>0; i--)
			coeficientes[i-1] = i * p.coeficientes[i];
	
	return new Polinomio(coeficientes);
	}
	
	public Polinomio suma(Polinomio p) {
		return Polinomio.suma(this, p);
	}
	
	public static Polinomio suma(Polinomio p, Polinomio q) {
		int grado1 = Math.max(p.grado, q.grado);
		double[] b = new double[grado1 + 1];
		Polinomio c = new Polinomio(b);
	
		for (int i = 0; i <= p.grado; i++){
			c.coeficientes[i] += p.coeficientes[i];
		}
	
		for (int i = 0; i <= q.grado; i++){
			c.coeficientes[i] += q.coeficientes[i];
		}
	
		return c;
	}
	
	public static Polinomio producto (Polinomio p, Polinomio q) {
		
		double[] b = new double[p.grado+q.grado];
		Polinomio c = new Polinomio(b);
	
		for (int i = 0; i <= p.grado; i++){
			for (int j = 0; j< q.grado; j++) {
			c.coeficientes[i+j] += p.coeficientes[i] * q.coeficientes[j];
			}
		}
	
		return c;
		
	}
	
	public boolean esIgual(Polinomio p) {
		return Polinomio.esIgual(this, p);
	}
	
	public static boolean esIgual(Polinomio p, Polinomio q) {
		if(p.coeficientes.length == q.coeficientes.length){
			for(int i=0; i<p.coeficientes.length; i++) {
				if(p.coeficientes[i] != q.coeficientes[i]) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	public String toString(String s) {
		return Polinomio.toString(this, s);
	}
	
	public static String toString(Polinomio p, String s) {
		s = s + " = ";
	
		for (int i=p.grado; i>=0; i--) {
			if (p.coeficientes[i] != 0.0) {
				if (p.coeficientes[i] < 0)
					s = s + " - " + Math.abs(p.coeficientes[i]);
				else
					if (i == p.grado)
						s = s + p.coeficientes[i];
					else 
						s = s + " + " + p.coeficientes[i];
	
				if (i >= 1) {
					s = s + "x";
	
					if (i >= 2)
						s = s + "^" + i;
				}
			}
		}
		return s;
	} 
}

