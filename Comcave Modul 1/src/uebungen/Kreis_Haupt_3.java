package uebungen;

class Kreis_Haupt_3{
	public static void main (String[] args){
		
		System.out.println("Ein Kreis k1 wird erzeugt mit dem Konstruktor ohne Parameter:");
		Kreis k1 = new Kreis();
		k1.schreibe_Kreis();

		System.out.println("Ein Kreis k2 wird erzeugt");
		System.out.println("mit dem Konstruktor mit einem Integer-Parameter");
		System.out.println("Es wird \"5\" uebegeben:");
		Kreis k2 = new Kreis(5);
		k2.schreibe_Kreis();

		System.out.println("Ein Kreis k3 wird erzeugt ");
		System.out.println("mit dem Konstruktor mit einem booleschen Parameter");
		System.out.println("Es wird \"true\" uebegeben:");
		Kreis k3 = new Kreis(true);
		k3.schreibe_Kreis();

		System.out.println("Ein Kreis k4 wird erzeugt ");
		System.out.println("mit dem Konstruktor mit beiden Parametern");
		System.out.println("erst der Radius, dann der boolesche Wert.");
		System.out.println("Es wird \"7\" und \"true\" uebegeben:");
		Kreis k4 = new Kreis(7,true);
		k4.schreibe_Kreis();

		System.out.println("Ein Kreis k5 wird erzeugt ");
		System.out.println("mit dem Konstruktor mit beiden Parametern");
		System.out.println("dieses Mal in umgekehrter Reihenfolge");
		System.out.println("Es wird \"false\" und \"4\" uebegeben:");
		Kreis k5 = new Kreis(false, 4);
		k5.schreibe_Kreis();

		System.out.println("Ein Kreis k6 wird erzeugt ");
		System.out.println("mit dem Konstruktor mit beiden Parametern,");
		System.out.println("aber es wird ein negativer Radius Übergeben:");
		System.out.println("Es wird \"-5\" und \"true\" uebegeben:");
		Kreis k6 = new Kreis(-5, true);
		k6.schreibe_Kreis();
	}
}