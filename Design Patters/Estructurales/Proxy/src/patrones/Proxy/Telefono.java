package patrones.Proxy;

public class Telefono implements LlamadaTelefonica{
	
	@Override
	public void llamar(String numero) {
		System.out.println("Llamando con el telefono, ");
		System.out.println("marcando el número " + numero);
	}
}