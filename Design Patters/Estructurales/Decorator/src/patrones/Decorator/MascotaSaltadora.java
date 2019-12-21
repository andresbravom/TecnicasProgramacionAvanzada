package patrones.Decorator;

public class MascotaSaltadora extends MascotaDecorador{

	public MascotaSaltadora(Mascota mascota) {
		super(mascota);
	}
	
	public String masCaracteristicas() {
		return ", me gusta saltar";
	}
}
