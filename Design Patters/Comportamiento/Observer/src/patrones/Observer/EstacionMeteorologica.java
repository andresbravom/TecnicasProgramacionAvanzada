package patrones.Observer;

import java.util.Vector;

public class EstacionMeteorologica implements Subject{
	
	private String nombre;
	private Vector<Observer> observadores;
	
	public EstacionMeteorologica(String nombre) {
		this.nombre = nombre;
		this.observadores = new Vector<Observer>();
	}
	
	@Override
	public void añadirObservador(Observer o) {
		this.observadores.add(o);
	}
	
	@Override
	public void eliminarObservador(Observer o) {
		this.observadores.remove(0);
	}
	
	@Override
	public void notificarObservadores(String mensaje) {
		for(Observer o : this.observadores) {
			o.actualizar(this.nombre, mensaje);
		}
	}
	
	public void mensaje(String mensaje) {
		System.out.println("\n" + this.nombre + " -> " + mensaje + "\n");
		notificarObservadores(mensaje);
	}

}