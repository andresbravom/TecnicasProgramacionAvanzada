package patrones.Observer;


public interface Subject {

	public void añadirObservador(Observer o);
	public void eliminarObservador(Observer o);
	public void notificarObservadores(String mensaje);
	
}
