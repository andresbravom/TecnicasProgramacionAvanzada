package ejercicios.Consultora;

public class Auxiliar extends Empleado{

	Auxiliar(String nif, String name, String apellidos, int añoContratacion, double retribucion, int antiguedad) {
		super(nif, name, apellidos, añoContratacion, retribucion, antiguedad);
		
	}

	@Override
	public double getSubidaSalarial() {
		double retribucion = getRetribucion() * 0.035;
		double aumentoAntiguedad = getRetribucion() * 0.01;
		if(getAntiguedad() >= 3) {
			retribucion = retribucion + aumentoAntiguedad;
		}
		return retribucion;
	}

}
