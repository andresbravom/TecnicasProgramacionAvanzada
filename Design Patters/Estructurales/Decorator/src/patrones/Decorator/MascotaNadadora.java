package patrones.Decorator;

public class MascotaNadadora extends MascotaDecorador{
	
	public MascotaNadadora(Mascota mascota) {
		super(mascota);
	}
	
	public String masCaracteristicas() {
		return ", me gusta nadar";
	}
}
