package patrones.Builder;

public class Usuario {
	private String email;
	private String nombre;
	private int añoNacimiento;
	private boolean activo;
	
	// método constructorprivate 
	Usuario(UsuarioBuilder usuario) {
		this.email = usuario.email;
		this.nombre = usuario.nombre;
		this.añoNacimiento = usuario.añoNacimiento;
		this.activo = usuario.activo;
		
	}
	public String getEmail() {
		return this.email;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getAñoNacimiento() {
		return this.añoNacimiento;
	}
	
	public boolean getActivo() {
		return this.activo;
	}
	
	public String getDatos() {
		return this.email + "\t" + this.nombre + "\t" + ((this.añoNacimiento != 0) ? this.añoNacimiento : "????") +"\t" + ((this.activo) ? "activo" : "inactivo");
	}
}