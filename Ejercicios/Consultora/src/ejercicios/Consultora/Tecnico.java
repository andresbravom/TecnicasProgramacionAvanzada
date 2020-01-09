package ejercicios.Consultora;

public class Tecnico extends Empleado{

	Tecnico(String nif, String name, String apellidos, int aÒoContratacion, double retribucion, int antiguedad) {
		super(nif, name, apellidos, aÒoContratacion, retribucion, antiguedad);
	}

	@Override
	public double getSubidaSalarial() {
		double retribucion = getRetribucion() * 0.025;
		double aumentoAntiguedad = getRetribucion() * 0.01;
		if(getAntiguedad() >= 3) {
			retribucion = retribucion + aumentoAntiguedad;
		}
		return retribucion;
	}

}

