package ejercicios.Consultora;

public class Ingeniero extends Empleado{

	Ingeniero(String nif, String name, String apellidos, int aÒoContratacion, double retribucion, int antiguedad) {
		super(nif, name, apellidos, aÒoContratacion, retribucion, antiguedad);
	}

	@Override
	public double getSubidaSalarial() {
		double retribucion = getRetribucion() * 0.015;
		double aumentoAntiguedad = getRetribucion() * 0.01;
		if(getAntiguedad() >= 3) {
			retribucion = retribucion + aumentoAntiguedad;
		}
		return retribucion;
	}

}
