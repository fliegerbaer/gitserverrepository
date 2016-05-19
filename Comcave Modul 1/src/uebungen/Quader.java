package uebungen;

//import org.omg.CORBA.StructMemberHelper;

public class Quader extends Rechteck {
	
	private int hoehe=0;
	private int laenge=0;
	private int breite=0;
	
		Quader(int dieBreite){
			setBreite(dieBreite);
			setLaenge(dieBreite);
			setHoehe(dieBreite);
			System.out.println("Würfel");
			}
		Quader(int dieBreite,int dieHoehe){
			setBreite(dieBreite);
			setLaenge(dieBreite);
			setHoehe(dieHoehe);
			System.out.println("Quader mit quadratischer Kantenlaenge");
			
		}
		Quader(int dieBreite,int dieLaenge,int dieHoehe){
			setBreite(dieBreite);
			setLaenge(dieLaenge);
			setHoehe(dieHoehe);
			System.out.println("Quader");
			
		}
			
		
		
	
	public void schreibe_Quader(){
		//System.out.print ("Laenge: "+laenge);
		//System.out.print ("\tBreite: "+breite);
		//schreibe_Rechteck();
			
		System.out.println ("\tLänge:\t "+laenge);
		System.out.println ("\tBreite:\t "+breite);
		System.out.println ("\tHoehe:\t "+hoehe);	
		}
	
	
	
	
	public int getHoehe() {
		return hoehe;
	}
	public int getLaenge() {
		return laenge;
	}
	public int getBreite() {
		return breite;
	}
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	public void setBreite(int breite) {
		this.breite = breite;
	}
	}


		
	
	
