package ejercicios.ProtectoraAnimales;

public class Perro extends Mascota{
	
	private static String tamaño; 

	Perro(String name, char genero, String color, String raza, int añoNacimiento, String tamaño) {
		super(name, genero, color, raza, añoNacimiento);
		this.tamaño = tamaño;
	}
	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
	//Se podria hacer de otra forma para llamar a la función de Mascota
	
	public String getDatos() {
		
		return ("Name: " + getName() + "\nGenero: " + getGenero() + "\nColor: " + getColor() 
				+ "\nRaza: " + getRaza() + "\nAño Nacimiento: " + getAñoNacimiento() + "\nEdad: " 
				+ getEdad() + "\nTamaño: " + getTamaño());
	}
}