package patrones.Builder;

public class UsuarioSinBuilder {
	private String email;
	private String nombre;
	private int añoNacimiento;
	private boolean activo;
	
	public UsuarioSinBuilder(String email) {
		this.email = email;this.nombre = "";
		this.añoNacimiento = 0;this.activo = false;
	}
	public UsuarioSinBuilder(String email, String nombre) {
		this.email = email;
		this.nombre = nombre;
		this.añoNacimiento = 0;
		this.activo = false;
	}
	
	public UsuarioSinBuilder(String email, String nombre,int añoNacimiento) {
		this.email = email;
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
		this.activo = false;
	}
	
	public UsuarioSinBuilder(String email, String nombre,int añoNacimiento, boolean activo) {
		this.email = email;
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
		this.activo = activo;
	}
}
