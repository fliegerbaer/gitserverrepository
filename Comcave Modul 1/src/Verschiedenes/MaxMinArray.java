package Verschiedenes;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wieviel Zahlen?");
		
		int n=scanner.nextInt();
		
		System.out.println("Bitte geben Sie " + n +" Zahlen ein");
		
		int[] myArray = new int[n];
		
		for (int i=0;i<myArray.length;i++){
			myArray[i] = scanner.nextInt();
		}
		scanner.close();
		float durchschnitt;
		float summe =0;
		for (int i=0;i<myArray.length;i++){
			summe = (float)myArray[i] + summe;
		}
		durchschnitt = summe/(float)myArray.length;
		//maximum berechnen
		//int maximum=myArray[0],minimum=myArray[0];
		int maximum=0,minimum=0;
		for (int x=0;x<myArray.length;x++){
			if(myArray[x]>maximum){
				maximum=myArray[x];
			}}
			
		//minimum berechnen	
		//	int minimum=0;
			for (int x=0;x<myArray.length;x++){
				if(myArray[x]<minimum){
					minimum=myArray[x];
				}
		}
		
		//Ausgabe
		System.out.println("Durchschnitt: "+ durchschnitt);
		System.out.println("Maximum: "+ maximum);
		System.out.println("Minimum: "+ minimum);
		

	}

}
