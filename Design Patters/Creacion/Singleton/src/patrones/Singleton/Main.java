package patrones.Singleton;

public class Main {
	public static void main(String[] args) {
		
		CestaCompraSingleton cesta1, cesta2;
		
		// el objeto cesta1 no se instancia con new,sino con el método getInstancia()
		
		cesta1 = CestaCompraSingleton.getInstancia();
		cesta1.añadeProducto("Producto 1");
		cesta1.añadeProducto("Producto 2");
		cesta1.añadeProducto("Producto 3");
		
		System.out.println("Contenido de la cesta 1 \n");
		System.out.println(cesta1.getProductos());
		
		cesta2 = CestaCompraSingleton.getInstancia();
		cesta2.añadeProducto("Producto 4");
		cesta2.añadeProducto("Producto 5");
		cesta2.añadeProducto("Producto 6");
		
		System.out.println("Contenido de la cesta 2 \n");
		System.out.println(cesta2.getProductos());
		
		System.out.println("Contenido dela cesta 1 \n");
		System.out.println(cesta1.getProductos());
		
	}
}