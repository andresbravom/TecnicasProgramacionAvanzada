package patrones.Builder;

import patrones.Builder.Usuario;
//import patrones.Builder.Usuario.UsuarioBuilder;
public class Programa {
	public static void main (String args[]){
		try {
			Usuario maria = new UsuarioBuilder("maria","maria.gonzalez@alumnos.nebrija.es").setAñoNacimiento(2000).build();
			Usuario carlos = new UsuarioBuilder("carlos","carlos.robles@alumnos.nebrija.es").setActivo(true).build();
			Usuario luis = new UsuarioBuilder("luis","luis.rodriguez@alumnos.nebrija.es").setAñoNacimiento(1998).setActivo(false).build();
			System.out.println(maria.getDatos());
			System.out.println(carlos.getDatos());
			System.out.println(luis.getDatos());
			Usuario juan = new UsuarioBuilder("juan","juan.hernando@alumnos.nebrija.es").setAñoNacimiento(2010).setActivo(false).build();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		};
	}
}
