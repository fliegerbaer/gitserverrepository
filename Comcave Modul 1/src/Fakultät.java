
public class Fakult�t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long fak=20;
		
		System.out.println(fak);
		System.out.println("Die Fakult�t von" + fak + "! ist " + fakult�t(fak));
			
		}
		

	

	private static long fakult�t(long fak) {
		// TODO Auto-generated method stub
		long erg=1;
		long i = 1;
		if (fak==0){return 1;} else {
		//System.out.println("ergebnis: " + erg + "fakult�t: " +fak);
		while(i<=fak){
			//System.out.println("ergebnis: " + erg + "z�hler: " + i);
			erg = erg * i;
			i++;
		};
		return erg;}
		
	}

}
