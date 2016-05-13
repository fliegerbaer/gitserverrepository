
public class Fakultät {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long fak=20;
		
		System.out.println(fak);
		System.out.println("Die Fakultät von" + fak + "! ist " + fakultät(fak));
			
		}
		

	

	private static long fakultät(long fak) {
		// TODO Auto-generated method stub
		long erg=1;
		long i = 1;
		if (fak==0){return 1;} else {
		//System.out.println("ergebnis: " + erg + "fakultät: " +fak);
		while(i<=fak){
			//System.out.println("ergebnis: " + erg + "zähler: " + i);
			erg = erg * i;
			i++;
		};
		return erg;}
		
	}

}
