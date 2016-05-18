package ComcaveProgramme;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objscr = new Scanner(System.in);//Objekt der Klasse Scanner wird erzeugt
		Double i,a,b ;
		System.out.println("Bitte geben Sie eine Zahl ein");
		i = objscr.nextDouble(); //nextDouble ist eine Instanzmethode der Klasse Scanner 
		System.out.println("Bitte geben Sie eine zeite Zahl ein");
		a = objscr.nextDouble();
		b = i/a;
		System.out.println("Die Divison von " + i + " durch " + a + " ist " + b);
		objscr.close();
	}
	

}
