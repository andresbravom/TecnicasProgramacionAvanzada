package patrones.Composite;

public class Main {
	public static void main (String args[]){
		
		Componente textbox = new Objeto("Textbox");
		Componente combobox = new Objeto("Combobox");
		Componente aceptar = new Boton("Ok");
		Componente label = new Objeto("Etiqueta");
		Componente cancelar = new Boton("Cancel");
		
		Ventana menu = new Ventana();
		
		menu.agrega(label);
		menu.agrega(textbox);
		menu.agrega(combobox);
		menu.agrega(aceptar);
		menu.agrega(cancelar);
		
		ActuadorComponentes ac = new ActuadorComponentes();
		
		ac.desplaza(label, 5, 5);
		ac.desplaza(textbox, 10, 10);
		ac.desplaza(combobox, 0, 10);
		ac.desplaza(menu, 50, 50);
	}
}