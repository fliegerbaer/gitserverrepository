package Verschiedenes;

import java.util.Scanner;

public class zweiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		int zeilen=2;
		System.out.println(zeilen + " Zeilen und Wieviel Spalten?");
		
		int n=scanner.nextInt();
		
		System.out.println("Bitte geben Sie " + n +" Zahlen ein");
		
		int[][] myArray = new int[zeilen][n];
		
		for (int z=0;z<zeilen;z++){//Zeileneingabe
		System.out.println("Sie befinden sich bei der Eingabe von Zeile " + (z+1));
		
			
		for (int i=0;i<n;i++){//Spalteneingabe
			System.out.print("Spalte " + (i+1) + " ");
			myArray[z][i] = scanner.nextInt();
		}}
		scanner.close();
		
		for(int x =0;x<zeilen;x++){//Zeile
			System.out.print("\n" + (x+1));
			for(int y =0;y<n;y++){
				System.out.print("\t" + myArray[x][y]);
		
		/*float durchschnitt;
		
		float summe =0;
		for (int i=0;i<myArray.length;i++){
			summe = (float)myArray[i] + summe;
		}
		durchschnitt = summe/(float)myArray.length;
		
		System.out.println(durchschnitt);
*/
	}

		}}}
