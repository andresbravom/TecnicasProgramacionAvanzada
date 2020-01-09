package ejercicios.Consultora;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Empleado> lista = new Vector<Empleado>();
		Empresa e = new Empresa("www.empresa.com"); 
		Auxiliar a1 = new Auxiliar("qwerty", "Jaime", "Gonzalez", 2017, 18000, 2);
		Tecnico t = new Tecnico("qwerty", "Jaime", "Gonzalez", 2017, 18000, 2);
		lista.add(t);
		e.altaEmpleado(a1);
		e.altaEmpleado(t);
		e.imprimirEmpleados();
	}

}
