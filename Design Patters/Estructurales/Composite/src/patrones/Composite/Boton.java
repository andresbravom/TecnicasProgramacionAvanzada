package patrones.Composite;

public class Boton extends Componente{

	private String id;
	
	public Boton(String id) {
		this.id = id;
	}

	@Override
	public void desplaza(int dx, int dy) {
		System.out.println("Boton " + id + " desplazado (" + dx + ", " + dy + ")");
	}
	
	
}
