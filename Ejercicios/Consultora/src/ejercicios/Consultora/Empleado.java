package ejercicios.Consultora;

public abstract class Empleado {
	private String nif;
	private String name;
	private String apellidos;
	private int aÒoContratacion;
	private double retribucion;
	private int antiguedad;
	
	
	
	Empleado(String nif, String name, String apellidos, int aÒoContratacion, double retribucion, int antiguedad){
		this.nif = nif;
		this.name = name;
		this.apellidos = apellidos;
		this.aÒoContratacion = aÒoContratacion;
		this.retribucion = retribucion;
		this.antiguedad = antiguedad;
		
	}
	public String getNif() {
		return nif;
	}
	
	public String getName() {
		return name;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public int getAÒoContratacion() {
		return aÒoContratacion;
	}
	
	public double getRetribucion() {
		return retribucion;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	
	abstract public double getSubidaSalarial();

}
