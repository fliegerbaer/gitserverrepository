package uebungen;

class Rechteck_Haupt_11{
	public static void main (String[] args){

		System.out.print   ("Ein Rechteck r1 wird erzeugt ");
		System.out.println ("mit dem ersten von uns def. Konstruktor,");
		System.out.println ("dem mit 2 Paramtern u. ihm 3 u. 5 uebergeben:");
		Rechteck r1 = new Rechteck(3,5);
		//r1.schreibe_Rechteck();

		System.out.print   ("Ein Rechteck r2 wird erzeugt ");
		System.out.println ("mit dem zweiten von uns def. Konstruktor,");
		System.out.println ("dem ohne Paramtern:");
		Rechteck r2 = new Rechteck();
		//r2.schreibe_Rechteck();

		System.out.print   ("Ein Rechteck r3 wird erzeugt ");
		System.out.println ("mit dem dritten von uns def. Konstruktor,");
		System.out.print   ("mit genau einem Paramter,");
		System.out.println ("dem wir die 7 uebergeben:");
		Rechteck r3 = new Rechteck(7);
		//r3.schreibe_Rechteck();

		System.out.print   ("Ein Rechteck r4 wird erzeugt ");
		System.out.println ("mit dem Konstruktor mit 2 Parametern,");
		System.out.println ("aber es wird ein unsinniger, negativer Wert uebergeben:");
		Rechteck r4 = new Rechteck(-3,5);
		//r4.schreibe_Rechteck();		

		System.out.print   ("Ein Rechteck r5 wird erzeugt ");
		System.out.println ("mit dem Konstruktor mit einem Parameter,");
		System.out.println ("aber es wird ein unsinniger, negativer Wert uebergeben:");
		Rechteck r5 = new Rechteck(-8);
		//r5.schreibe_Rechteck();		
	}
}