package patrones.State;

public class Main {
	
	public static void main(String[] args) {
		
		Pedido p1 = new Pedido("Pedido1");
		Pedido p2 = new Pedido("Pedido2");
		
		System.out.println(p1.getEstado());
		
		p1.estadoSiguiente();
		System.out.println(p1.getEstado());
		
		p1.estadoSiguiente();
		System.out.println(p1.getEstado());
		
		p1.estadoSiguiente();
		System.out.println(p1.getEstado());
		
		p2.estadoSiguiente();
		System.out.println(p2.getEstado());
	}

}
