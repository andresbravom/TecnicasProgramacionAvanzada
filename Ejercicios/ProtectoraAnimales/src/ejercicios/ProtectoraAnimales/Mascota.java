package ejercicios.ProtectoraAnimales;

public class Mascota implements java.io.Serializable{
	private String name;
	private char genero;
	private String color;
	private String raza;
	private int añoNacimiento;
	
	Mascota(String name, char genero, String color, String raza, int añoNacimiento){
		this.name = name;
		this.genero = genero;
		this.color = color;
		this.raza = raza;
		this.añoNacimiento = añoNacimiento;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getAñoNacimiento() {
		return añoNacimiento;
	}
	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	
	public String getEdad() {

		int actual = 2019;
		int total = actual -getAñoNacimiento(); 
		String edad = null;
		int años = 2019 - getAñoNacimiento(); 
		
		if (total <= 1) {
			edad = "Cachorro";
		}else if(total <= 3) {
			edad = "Adolescente";
		}else if(total <= 6) {
			edad = "Joven";
		}else if(total <= 9) {
			edad = "Adulto";
		}else if(total > 9) {
			edad = "Viejo";
		}
		return edad;
	}
	public String getDatos() {
		
		return ("Name: " + getName() + "\nGenero: " + getGenero() + "\nColor: " + getColor() 
				+ "\nRaza: " + getRaza() + "\nAño Nacimiento: " + getAñoNacimiento() + "\nEdad: " + getEdad());
	}
}
