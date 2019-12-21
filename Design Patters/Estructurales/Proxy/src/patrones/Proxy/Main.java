package patrones.Proxy;

public class Main {

	public static void main(String[] args) {
		LlamadaTelefonica telefono;
		
		if((int) (Math.random() * 100 % 2) == 0) {
			telefono = new Telefono();
		}else {
			telefono = new TelefonoProxy();
		}
		
		telefono.llamar("+34635432999");

	}

}
