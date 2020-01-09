package ejercicios.NumerosComplejos;

public class NumerosComplejos {
	private float real;
	private float imaginario;
	
	public NumerosComplejos() {
		
	}
	public NumerosComplejos(float real, float imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImaginario() {
		return imaginario;
	}
	public void setImaginario(float imaginario) {
		this.imaginario = imaginario;
	}
		
	public NumerosComplejos suma (NumerosComplejos c) {
		NumerosComplejos numeroComplejo = new NumerosComplejos();
		numeroComplejo.real = real;
		numeroComplejo.imaginario = imaginario;
		
		return numeroComplejo;
	}
	public NumerosComplejos resta (NumerosComplejos c) {
		NumerosComplejos numeroComplejo = new NumerosComplejos();
		numeroComplejo.real = real;
		numeroComplejo.imaginario = imaginario;
		
		return numeroComplejo;
	}
	public NumerosComplejos producto (NumerosComplejos c) {
		NumerosComplejos numeroComplejo = new NumerosComplejos();
		numeroComplejo.real = real;
		numeroComplejo.imaginario = imaginario;
		
		return numeroComplejo;
	}
	
	public static NumerosComplejos suma(NumerosComplejos a, NumerosComplejos b) {
		float real = a.real + b.real;
		float imaginario = a.imaginario + b.imaginario;
		
		return new NumerosComplejos(real, imaginario);
	}
	
	public static NumerosComplejos resta(NumerosComplejos a, NumerosComplejos b) {
		float real = a.real - b.real;
		float imaginario = a.imaginario - b.imaginario;
		
		return new NumerosComplejos(real, imaginario);	
	}
	
	public static NumerosComplejos producto(NumerosComplejos a, NumerosComplejos b) {
		float real = (a.real * b.real) - (a.imaginario * b.imaginario);
		float imaginario = (b.imaginario * b.imaginario) - (a.imaginario * b.imaginario);
		
		return new NumerosComplejos(real, imaginario);
	}
	
	public static String toString(String s, NumerosComplejos c) {
		return c.toString(s);
	}
	
	public  String toString(String s) {
		String num = s + " = (" + this.real;
		if (this.imaginario >= 0) {
			num = num +  " + ";
		}else{
			
			num = num + " -";
		}if (Math.abs(this.imaginario) != 1.0f) {
			num = num + Math.abs(this.imaginario);
		}
			num = num + "i)";
			return num;
	}
}
