package ComcaveProgramme;

import java.util.Random;

public class OverloadMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
for (int i=1;i<1000;i++){
		int zufallserg = random.nextInt(10); //
		System.out.println("Zuffallszahl " + i + " " + zufallserg);
		//zufälligerechenoperation
}
System.out.println("erstes " + rechne(5,6,"plus"));
System.out.println("zeites " + rechne(5,6,"minus"));
		}
	public static int rechne(int a){
		return a;
	}
	public static int rechne(int a, int b){
		return b;
	}
	public static int rechne(int a, int b, String s){
		//return b;
		
		switch (s){
		case "plus":
			return (a+b);
			//break;
		case "minus":
			return a-b;
			//break;
		default:
				return 0;
				//break;
		}
	}
}



