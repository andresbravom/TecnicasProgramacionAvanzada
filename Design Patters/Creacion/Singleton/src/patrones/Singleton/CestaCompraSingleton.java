package patrones.Singleton;
import java.util.Vector;

public class CestaCompraSingleton {
	private Vector<String> productos;
	private static CestaCompraSingleton instancia = null;
	
	//El constuctor de la clase se declara private
	
	private CestaCompraSingleton() {
		this.productos = new Vector<String>();
	}
	
	//El método getInstance() solo crea la instancia si es null
	
	public static synchronized CestaCompraSingleton getInstancia() {
		if(instancia == null) {
			instancia = new CestaCompraSingleton();
		}
		return instancia;
	}
	
	public void añadeProducto(String producto) {
		this.productos.add(producto);
	}
	
	public String getProductos() {
		String productos = "";
		
		for(String p : this.productos) {
			productos = productos + p + "\n";
		}
		return productos;
	}
}
