package ComcaveProgramme;

public class Methoden {

	static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Methoden und Funktionen ...
		System.out.println(a);
		SayHello();
		System.out.println(Sum(40, 50));

	}
	public static void SayHello() {
		
		
		
		System.out.println("ich bin eine Methode");
		
	}
	public static String MakeString(String str){
		
		return str;
		
	}
	
	public static int Sum(int a, int b){
		return a+b;
		
	}

}
