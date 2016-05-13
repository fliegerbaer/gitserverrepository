
public class Verzweigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if else
		
		
		//while schleife
		int zahl = 1;
		while(zahl<30)	{
		System.out.println(zahl);
		if(zahl%2 == 0) {
			System.out.println("Zahl " + zahl + " ist gerade");
			
		}
		else{
			System.out.println("Zahl " + zahl + " ist ungerade");}
			zahl++;
			System.out.println("die neue Zahl ist" + zahl);
		}
		
		
		//for-Schleife
		
		for(int i=0;i<=10;i++){
			System.out.println(i);
			if(i%3==0){
				System.out.println("Die Zahl ist durch 3 teilbar");
			}
		}
		
		//Vergleich
		//int x=1,y=2;
		

	}

	}
	
	/* public static String GroessenVergleich(double x,double y)
	{
	if(x==y){
		return "Die Zahlen sind gleich";
	}
	else{
	if(x>y){
		return( x + " ist grösser als " + y);
	}
	else{
		return(x + " ist kleiner als " + y);
	}*/
	
	

