package ComcaveProgramme;

public class PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =5;
		int y=10;
		float f=4.98f;
		String s = "TextimString";
		
		System.out.println("Guten Tag " + x + " " +y);
		System.out.println("noch eine Zeile");
		
		System.out.printf("eine %d Zeile %d mit %fprintf%s",x,y,f,s);
		
		System.out.println();
		String testString = String.format("eine %d Zeile %d mit %fprintf%s",x,y,f,s);
		System.out.printf(testString);
		
	}

}
