package uebungen;

class Rechteck {

	int laenge;
	int breite;

	Rechteck(int laenge, int breite){
		if (laenge<=0 || breite<=0){
			System.out.println (">>Fehler! Negative Seitengroesse uebergeben!");
			System.out.println (">>Rechteck wird mit Seitengroessen 0 erzeugt!");
			laenge=0;
			breite=0;
		}
		else{
			this.laenge = laenge;
			this.breite = breite;
		}
	}

	Rechteck(int seitengroesse){
/*		if (seitengroesse<=0){
			System.out.println (">>Fehler! Negative Seitengroesse uebergeben!");
			System.out.println (">>Rechteck wird mit Seitengroessen 0 erzeugt!");
			laenge=0;
			breite=0;
		}
		else{
			laenge = seitengroesse;
			breite = seitengroesse;
		}
*/
		this(seitengroesse, seitengroesse);
	}

	Rechteck(){
/*		laenge = 1;
		breite = 1;
*/
		this(1,1);
	}


	/*public void schreibe_Rechteck(){
		System.out.print ("Laenge: "+laenge);
		System.out.println ("\tBreite: "+breite);
		System.out.println ();
	}*/
}