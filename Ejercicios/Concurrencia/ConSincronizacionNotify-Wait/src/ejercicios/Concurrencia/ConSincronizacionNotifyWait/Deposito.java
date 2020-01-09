package ejercicios.Concurrencia.ConSincronizacionNotifyWait;

public class Deposito extends Thread {
	private Cuenta cuenta;
	private int transacciones;
	private double importe;
	
	public Deposito(Cuenta cuenta, int transacciones, double importe) {
		this.cuenta = cuenta; 
		this.transacciones = transacciones;
		this.importe = importe;
		
	}public void run() {
		for(int i = 1; i <= this.transacciones; i++) {
			synchronized (this.cuenta) {
				this.cuenta.deposito(this.importe);
				this.cuenta.notify();
			}
		}
	}
}
