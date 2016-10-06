package uebungen;

class Kreis{

	private int radius=0;
	private boolean ist_gefuellt=false;
	private double pi = 3.1415;


	Kreis (int radius, boolean ist_gefuellt){
		if (radius<=0){
			System.out.println 
			(">>Fehler im Konstruktor der Klasse!");
			System.out.println (">>Negativer Radius!");
			radius=0;
			ist_gefuellt=false;	
		}
		else{
			this.radius = radius;
			this.ist_gefuellt = ist_gefuellt;
		} 
	}

	Kreis (){
		this(1,false);
/*		radius=1;
		ist_gefuellt=false;
*/
	}

	Kreis (int radius){
		this(radius, false);
/*		this.radius = radius;
		ist_gefuellt = false;
*/
	}

	Kreis (boolean ist_gefuellt){
		this(1, ist_gefuellt);
/*		this.ist_gefuellt = ist_gefuellt;
		radius = 1;
*/
	}


	Kreis (boolean ist_gefuellt, int radius){
		this(radius, ist_gefuellt);
/*		this.radius = radius;
		this.ist_gefuellt = ist_gefuellt; 
*/
	}


	public int gebe_Radius (){
		return radius;
	}

	public void setze_Radius (int radius){
		this.radius = radius;
	}


	public boolean gebe_ist_gefuellt (){
		return ist_gefuellt;
	}

	public void schreibe_Kreis(){
		System.out.println("Radius: "+radius);
		if (ist_gefuellt)
			System.out.println ("Der Kreis ist gefuellt");
		else 	System.out.println ("Der Kreis ist nicht gefuellt");
		System.out.println ();
	}
}