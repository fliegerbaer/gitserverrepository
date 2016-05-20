package OOP01;

public class Fahrzeug {
	

	private int raederzahl;
	private int personenzahl;
	private String bezeichnung;
	
	//setter
	public void setRaederzahl(int raederzahl) {
		this.raederzahl = raederzahl;
	}
	public void setPersonenzahl(int personenzahl) {
		this.personenzahl = personenzahl;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	//getter
	public int getRaederzahl() {
		return raederzahl;
	}
	public int getPersonenzahl() {
		return personenzahl;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public String fahrzeuginformationen(){
		return "Hallo - Das Fahrzeug " + bezeichnung + " hat " + raederzahl + " Raeder" + " und Platz für " + personenzahl + " Personen.";
	}
	
	{}//Konstruktor	
	

}
