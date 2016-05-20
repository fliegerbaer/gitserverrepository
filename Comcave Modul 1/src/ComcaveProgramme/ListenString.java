package ComcaveProgramme;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math;

public class ListenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random r = random();
		String[] einArray = new String[50];
		
		
		
		//Liste --> nehmen nur komplexe Datentypen
		int a=3; //primitiver Datentyp
		Integer b=34; //komplexerDatentyp
		Integer z = a+b;
		System.out.println(z);
		
		List <String> myList = new ArrayList<String>();
		//Liste befüllen
		//Object m = random();
		//int r = random();
		myList.add("Montag");
		myList.add("Dienstag");
		myList.add("Mittwoch");
		myList.add("Donnerstag");
		//listengroesse=myList.size()
		for(int i = 0;i<myList.size();i++){
			System.out.println("Eintrag " + i + " ist: " + myList.get(i));}
		
		//eintrag entfernen
		int loesche=2;
		System.out.println("Lösche Eintrag Nummer "+ loesche);
		myList.remove(2);
		for(int i = 0;i<myList.size();i++){
			System.out.println("Eintrag " + i + " ist: " + myList.get(i));}
		

	}

}
