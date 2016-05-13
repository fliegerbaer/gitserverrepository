
public class WhileSchleife {

	public static void main(String[] args) {
		//Programmbeginn
		
		
		//while kopfgesteuert
		int zaehler =0;
		while (zaehler < 10) {
			System.out.println(zaehler);
			
			zaehler++;
			
			
		}
		
		//do while auch kopfgesteuert!
		zaehler = 0;
		do {
System.out.println(zaehler);
			
			zaehler++;
			
		}while(zaehler<10);
		
		//schleife summe ungerade
		/*
		float summe = 0;
		zaehler = 0;
		do {
			zaehler++;
			if(zaehler%2==0){
				summe=summe+(float)zaehler;
			}
			System.out.println("Zähler: "+zaehler);
				
			}while(zaehler<20); //Schleifenende
		
		System.out.println("Schleifenende: " + summe); */
		
		
		
		float summe = 0;
		zaehler = 0;
		while(zaehler<20){
			zaehler++;
			if(zaehler%2==0){
				summe=summe+(float)zaehler;
			}
			System.out.println("Zähler: "+zaehler);
				
			}; //Schleifenende
		
		System.out.println("Schleifenende: " + summe);
		
		} //Programmende
			
		

	} //Klassenende


