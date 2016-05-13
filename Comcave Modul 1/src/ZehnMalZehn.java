
public class ZehnMalZehn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int ersteZeile=1;ersteZeile<=10;ersteZeile++){
			System.out.print("\t" + ersteZeile);
		}
		for(int x =1;x<=10;x++){
			System.out.print("\n" + x);
			for(int y =1;y<=10;y++){
				System.out.print("\t" + (y*x));
				
				//System.out.println("Der Wert x (äussere Schleife) ist " + x + " Der Wert y (innere Schleife) ist "+ y);
				//System.out.print();			
			
			}
		}
		

	}

}
