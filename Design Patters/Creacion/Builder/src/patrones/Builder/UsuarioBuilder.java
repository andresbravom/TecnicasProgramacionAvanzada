package patrones.Builder;

public class UsuarioBuilder {
	String email;
	String nombre;
	int añoNacimiento;
	boolean activo;
	
	//Constructor para los atributos obligatorios: nombre del usuario, email
	
	public UsuarioBuilder(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}
	
	//Métodos set para los atributos opcionales del constructor: añoNacimiento, activo
	
	public UsuarioBuilder setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
		return this;
	}
	
	public UsuarioBuilder setActivo(boolean activo) {
		this.activo = activo;
		return this;
	}
	
	//Método build con validación para garantizar que la instancia almacena datos correctamente
	
	public Usuario build() {
		Usuario usuario = new Usuario(this);
		
		if(usuario.getAñoNacimiento() > 2000)
			throw new IllegalArgumentException("El usuario " + usuario.getNombre() + " debe ser mayor de edad");
		return new Usuario(this);
	}

}
