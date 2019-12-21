package patrones.Decorator;

public class Perro extends Mascota{
	
	public Perro (String nombre) {
		super(nombre);
	}
	
	@Override
	public String getCaracteristicas() {
		return "Soy un perro, digo gua y me llamo " + super.getNombre();
	}
}
