package patrones.Decorator;

public class Main {

	public static void main(String[] args) {
		
		Mascota gato = new Gato("Félix"); 
		Mascota perro = new Perro("Max");
		
		System.out.println(gato.getCaracteristicas());
		System.out.println(perro.getCaracteristicas());
		
		Mascota perroNadador = new MascotaNadadora(perro);
		System.out.println(perroNadador.getCaracteristicas());
		
		Mascota perroSaltador = new MascotaSaltadora(perro);
		System.out.println(perroSaltador.getCaracteristicas());
		
		Mascota perroNadadorSaltador = new MascotaSaltadora(perroNadador);
		System.out.println(perroNadadorSaltador.getCaracteristicas());
		
		Mascota gatoNadador = new MascotaNadadora(gato);
		System.out.println(gatoNadador.getCaracteristicas());
	}

}
