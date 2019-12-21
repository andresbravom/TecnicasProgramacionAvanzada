package patrones.Observer;

public class Main {

	public static void main(String[] args) {
		
		EstacionMeteorologica m1 = new EstacionMeteorologica("Madrid Centro");
		EstacionMeteorologica m2 = new EstacionMeteorologica("Madrid Norte");
		EstacionMeteorologica m3 = new EstacionMeteorologica("Madrid Sur");
		EstacionMeteorologica m4 = new EstacionMeteorologica("Madrid Este");
		EstacionMeteorologica m5 = new EstacionMeteorologica("Madrid Oeste");
		
		Pantalla p1 = new Pantalla("Pantalla 1");
		Pantalla p2 = new Pantalla("Pantalla 2");
		Pantalla p3 = new Pantalla("Pantalla 3");
		
		m1.añadirObservador(p1);
		m1.añadirObservador(p2);
		m2.añadirObservador(p2);
		m2.añadirObservador(p3);
		m3.añadirObservador(p3);
		m4.añadirObservador(p1);
		m5.añadirObservador(p1);
		
		m1.mensaje("Día de frio y lluvia en el centro");
		m2.mensaje("Las lluvias remiten en el norte");
		m3.mensaje("Despejado en el sur");
		m4.mensaje("Día ventoso en el este");
		m5.mensaje("Día desapacible en el oeste");
		
		m1.eliminarObservador(p2);
		
		m1.mensaje("Suben las temperaturas en el centro");
	}

}