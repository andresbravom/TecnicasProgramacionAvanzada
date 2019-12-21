package patrones.Decorator;

public abstract class Mascota {
	private String nombre;
	
	public Mascota() {
		
	}
	 public Mascota (String nombre) {
		 this.nombre = nombre;
	 }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 
	public abstract String getCaracteristicas();

}
