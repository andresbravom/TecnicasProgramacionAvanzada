package ejercicios.ProtectoraAnimales;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Protectora implements java.io.Serializable{
	private String web;
	private Vector<Mascota> mascotas;
	
	Protectora(String web){
		this.web = web;
		this.mascotas = new Vector<Mascota>();
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
	public void registrarMascota(Mascota m) {
		mascotas.add(m);
	}
	
	public void imprimirMascotas() {
		if(mascotas != null) {
			for(int i=0; i< mascotas.size(); i++) {
				System.out.println(mascotas.get(i).getDatos());
			}
		}
	}
	
	public void imprimirMascotas(String clase) {
		if(mascotas != null) {
			for(int i=0; i<mascotas.size(); i++) {
				if(mascotas.get(i).getClass() == Perro.class) {
					if(clase.equals("Perro")) {
						System.out.println(mascotas.get(i).getDatos());
					}
				}else if(mascotas.get(i).getClass() == Gato.class) {
					if(clase.equals("Gato")) {
						System.out.println(mascotas.get(i).getDatos());
					}
				}
				
			}
		}
	}
	public void imprimirMascotas(String clase, String edad) {
		if(mascotas != null) {
			for(int i=0; i<mascotas.size(); i++) {
				if(mascotas.get(i).getClass() == Perro.class) {
					if(clase.equals("Perro") & edad.equals(mascotas.get(i).getEdad())) {
						System.out.println(mascotas.get(i).getDatos());
					}
				}else if(mascotas.get(i).getClass() == Gato.class) {
					if(clase.equals("Gato") & edad.equals(mascotas.get(i).getEdad())) {
						System.out.println(mascotas.get(i).getDatos());
					}
				}
			}
		}
	}
	public void printFile() {
		String file = "./File.dat";
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			
			if(mascotas != null) {
				for(int i=0; i<mascotas.size(); i++) {
					oos.writeObject(mascotas.get(i).getDatos());;
					
				}
				oos.close();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}