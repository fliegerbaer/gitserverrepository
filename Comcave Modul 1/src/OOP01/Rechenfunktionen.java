package OOP01;

public class Rechenfunktionen {

	public Rechenfunktionen() {
		// TODO Auto-generated constructor stub
	}
	public void sortieren(int a[]){
		int laenge = a.length;
		System.out.println("Die laenge ist" + laenge);
		for (int aussen = 0;aussen<a.length;aussen++){
			for (int innen=aussen+1;innen<a.length;innen++){
				if (a[innen]<a[aussen]){
					int hilf=a[innen];
					a[innen]=a[aussen];
					a[aussen]=hilf;
				}
				
			}
		}
		return;
		
		
	}

}
