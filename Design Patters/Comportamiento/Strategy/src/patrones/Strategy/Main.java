package patrones.Strategy;

public class Main {

	public static void main(String[] args) {
		
		CondicionesTiempo t1 = new CondicionesTiempo(25,40, new MaratonStrategy());
		CondicionesTiempo t2 = new CondicionesTiempo(15,50, new SenderismoStrategy());
		CondicionesTiempo t3 = new CondicionesTiempo(-5,50, new SenderismoStrategy());
		
		System.out.println(((t1.getRecomendacion()? "Se aconseja" : "Evite")) + " correr un maratón con " + t1.getTemperatura() + "ºC y " + t1.getHumedad() + "% humedad");
		System.out.println(((t2.getRecomendacion()? "Se aconseja" : "Evite")) + " hacer senderismo con " + t2.getTemperatura() + "ºC y " + t2.getHumedad() + "% humedad");
		
		t2.setEstrategia(new MaratonStrategy());
		
		System.out.println(((t2.getRecomendacion()? "Se aconseja" : "Evite")) + " correr un maratón con " + t2.getTemperatura() + "ºC y " + t2.getHumedad() + "% humedad");
		System.out.println(((t3.getRecomendacion()? "Se aconseja" : "Evite")) + " hacer senderismo con " + t3.getTemperatura() + "ºC y " + t3.getHumedad() + "% humedad");
		
		t3.setEstrategia(new MaratonStrategy());
		
		System.out.println(((t3.getRecomendacion()? "Se aconseja" : "Evite")) + " correr un maraton con " + t3.getTemperatura() + "ºC y " + t3.getHumedad() + "% humedad");
		
		t3.setEstrategia(new GimnasioStrategy());
		
		System.out.println(((t3.getRecomendacion()? "Se aconseja" : "Evite")) + " ir al gimnasio con " + t3.getTemperatura() + "ºC y " + t3.getHumedad() + "% humedad");
	}

}