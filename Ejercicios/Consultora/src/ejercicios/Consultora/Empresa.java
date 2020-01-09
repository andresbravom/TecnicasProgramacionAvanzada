package ejercicios.Consultora;

import java.util.Vector;

public class Empresa {
	private String web;
	private Vector<Empleado> empleados = new Vector<Empleado>();
	
	Empresa(String web){
		this.web = web;
	}
	public String getWeb() {
		return web;
	}
	
	public void altaEmpleado(Empleado e) {
		e.getName();
		e.getApellidos();
		e.getAntiguedad();
		e.getRetribucion();
		e.getSubidaSalarial();
		e.getClass().getName();
		
		empleados.add(e);
	}
	
	public void imprimirEmpleados() {
		if(empleados != null) {
			for(int i=0; i< empleados.size(); i++) {
				System.out.println(i+1 + " "+ empleados.get(i).getName() + ", " 
									+ empleados.get(i).getApellidos() + " "
									+ empleados.get(i).getAntiguedad() + " aÒos " 
									+ empleados.get(i).getRetribucion() + " eur "
									+ empleados.get(i).getSubidaSalarial() + " eur "
									+ empleados.get(i).getClass().getSimpleName());
			}
		}
	}
}

