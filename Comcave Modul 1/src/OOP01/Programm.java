package OOP01;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//erzeuge Instanz der Klasse Fahrzeug
		Fahrzeug auto1 = new Fahrzeug();
		auto1.setBezeichnung("S-Klasse");
		auto1.setPersonenzahl(5);
		auto1.setRaederzahl(4);
		
		System.out.println(auto1.fahrzeuginformationen());
		
	}

}
