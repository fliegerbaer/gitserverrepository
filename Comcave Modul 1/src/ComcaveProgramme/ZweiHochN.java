package ComcaveProgramme;

public class ZweiHochN {

	public static void main(String[] args) {
		for (int t=0; t<=10;t++){
		System.out.println("Zweihoch:" + zweihoch(t));
		// TODO Auto-generated method stub

		System.out.println(t + "Ist gerade:" + ist_gerade(t));

		//System.out.println(ist_gerade(3));
		}
	}
	
	public static int zweihoch(int n){
		if(n==0){
			return 1;
		}else{
			int erg=1;
			for (int i=1;i<=n;i++){
				erg=erg*2;
			}
			return erg;
			
		}
	}//ende zweihoch
	
	public static boolean ist_gerade(int z){
		return (z%2==0);
	}
	
	

}
