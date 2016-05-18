package ComcaveProgramme;

import java.util.Scanner;

public class Primzahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anzahl der Primzahlen eingeben
		Scanner objscr = new Scanner(System.in);//Objekt der Klasse Scanner wird erzeugt
		System.out.println("Geben Sie die Anzahl der Primzahlen ein, die sie möchten");
		int i = objscr.nextInt();
		objscr.close();
		//System.out.println(i);
		//int[] myArray = new int[n];
		int[] primzahl = new int[i+1];
		primzahl[0]=1;
		primzahl[1]=3;
		int pruefzahl = 2;
		for (int primnummer = 1;primnummer<=i;primnummer++){ //erste bis n primzahlen
		//System.out.println(primzahl[primnummer]%pruefzahl==0);
		while ((primzahl[primnummer]%pruefzahl!=0)){//|(pruefzahl<primzahl[primnummer])){			
			System.out.println("prüfzahl:" + pruefzahl + "Primnummer" + primnummer);
			pruefzahl=pruefzahl+1;
			System.out.println("prüfzahl:" + pruefzahl + "Primnummer" + primnummer);
		}
		primzahl[primnummer]=pruefzahl;
		}
			
			//for (int pruefZahl=primzahl[primnummer-1];pruefzahl<=2;pruefzahl<= to ) 
		for (int n=1;n<=i;n++){
		System.out.println(primzahl[n]);	
			
		}
		
		

	}

}
