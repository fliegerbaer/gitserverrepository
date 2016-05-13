package Verschiedenes;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*/ Typ[] Name = new Typ[Anzahl]
		
		int[] myArray = {3,5,6,7,4,8,3,4,7};
		
		int erg = 0;
		
		
		for(int i=0;i<myArray.length;i++){
			erg = erg + myArray[i];
		}
		
		System.out.println(erg);
		
		*/
		
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
		
		System.out.println(durchschnitt);
		
	}

}
