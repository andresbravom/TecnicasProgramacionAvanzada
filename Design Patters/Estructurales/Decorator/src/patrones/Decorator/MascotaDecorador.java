package patrones.Decorator;

public abstract class MascotaDecorador extends Mascota{

	 private Mascota mascota;
	 
	 public MascotaDecorador (Mascota mascota) {
		 this.mascota = mascota;
	 }
	 
	@Override
	public String getCaracteristicas() {
		return this.mascota.getCaracteristicas() + this.masCaracteristicas();
	}

	public abstract String masCaracteristicas(); 
}
