package ejercicios.ProtectoraAnimales;

public class Gato extends Mascota{
	
	private String caracter; 
	
	Gato(String name, char genero, String color, String raza, int añoNacimiento, String caracter) {
		super(name, genero, color, raza, añoNacimiento);
		this.caracter = caracter;
	}

	public String getCaracter() {
		return caracter;
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}
	
	public String getDatos() {
		return ("Name: " + getName() + "\nGenero: " + getGenero() + "\nColor: " + getColor() 
				+ "\nRaza: " + getRaza() + "\nAño Nacimiento: " + getAñoNacimiento() + "\nEdad: " 
				+ getEdad() + "\nCaracter: " + getCaracter());
	}
}
