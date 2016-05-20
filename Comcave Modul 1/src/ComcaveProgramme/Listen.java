package ComcaveProgramme;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math;

public class Listen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random r = random();
		int[] einArray = new int[50];
		
		
		
		//Liste --> nehmen nur komplexe Datentypen
		int a=3; //primitiver Datentyp
		Integer b=34; //komplexerDatentyp
		Integer z = a+b;
		System.out.println(z);
		
		List <Integer> myList = new ArrayList<Integer>();
		//Liste befüllen
		//Object m = random();
		//int r = random();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(5);
		//listengroesse=myList.size()
		for(int i = 0;i<myList.size();i++){
		System.out.println("Zahl "+(i+1)+" ist \t"+myList.get(i));
		}
		System.out.print("======================\nDie Summe ist:\t");
		int summe=0;
		for(int i = 0;i<myList.size();i++){
			summe=summe+myList.get(i);
			}
		System.out.println(summe);

	}

}
