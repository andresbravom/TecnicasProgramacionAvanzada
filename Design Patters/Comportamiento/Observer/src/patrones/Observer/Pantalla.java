package patrones.Observer;

public class Pantalla implements Observer{

	private String nombre;
	
	public Pantalla(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void actualizar(String nombre, String mensaje) {
		System.out.println(this.nombre + " <- [" + nombre + "] "+ mensaje);
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
