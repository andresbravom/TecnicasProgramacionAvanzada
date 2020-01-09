package ejercicios.Concurrencia.SinSincronizacion;

public class Cuenta {
	private double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposito(double importe) {
		double nuevoSaldo = this.saldo;
		nuevoSaldo = nuevoSaldo + importe;
		
		try {
			Thread.sleep(300); // simula el tiempode la transacción
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		
		System.out.println("el saldo después del depósito " + nuevoSaldo);
		
		this.saldo = nuevoSaldo;
	}
	
	public void retiro(double importe) {
		if (this.saldo < importe) {
			System.out.println("No hay saldo suficiente!");
			return;
		}
		
		double nuevoSaldo = this.saldo;
		nuevoSaldo = nuevoSaldo -importe;
		try {
			Thread.sleep(200);  // simula el tiempode la transacción
			} catch (InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
		System.out.println("el saldo después del retiro " + nuevoSaldo);
		this.saldo = nuevoSaldo;
	}
}

