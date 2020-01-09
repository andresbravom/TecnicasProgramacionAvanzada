package ejercicios.ProtectoraAnimales;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) {
		Protectora adoptame = new Protectora("www.adoptame.com");
		
		adoptame.registrarMascota(new Perro("Golfo", 'M', "Negro", "Común", 2018, "Mediano"));
		adoptame.registrarMascota(new Perro("Luna", 'H', "Negro", "Cocker", 2019, "Mediano"));
		adoptame.registrarMascota(new Perro("Roco", 'M', "Canela", "Boxer", 2015, "Mediano"));
		adoptame.registrarMascota(new Perro("Igor", 'M', "Canela", "Pastor", 2012, "Mediano"));
		adoptame.registrarMascota(new Perro("Boris", 'M', "Paja", "Golden", 2016, "Grande"));
		adoptame.registrarMascota(new Perro("Nevada", 'H', "Blanco", "Caniche", 2012, "Pequeño"));
		adoptame.registrarMascota(new Gato("Bala", 'M', "Gris", "Común", 2012, "Mimoso"));
		adoptame.registrarMascota(new Gato("Chiara", 'H', "Blanco", "Común", 2017, "Cariñosa"));
		adoptame.registrarMascota(new Gato("Lucas", 'M', "Pardo", "Común", 2014, "Cariñoso"));
		adoptame.registrarMascota(new Gato("Virgola", 'H', "Gris", "Común", 2010, "Cariñoso"));
		
		adoptame.imprimirMascotas();
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Perro");
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Gato");
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Perro", "Cachorro");
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Perro", "Adolescente");
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Perro", "Joven");
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Perro", "Adulto");
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Gato", "Adolescente");
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Gato", "Joven");
		System.out.println("--------------------------------------------");
		adoptame.imprimirMascotas("Gato", "Adulto");

		System.out.println("--------------------------------------------");
		
		adoptame.printFile();
		//adoptame.readFile();
		
	}
}
