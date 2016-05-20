package ComcaveProgramme;
//import thread; --> warum geht das nicht? run funktioniert nur wenn vererbt? Klären
public class ThreadDemo extends Thread {
	
	@Override
	public void run() {
		long zaehler =0;
		long anfang = System.currentTimeMillis();
		// TODO Auto-generated method stub
		//super.run();
		for(int i =0;i<=100;i++){
			for (int a = 0; a <50000000; a++) {
				zaehler++;
			}
			System.out.println("lade " + i + "% Milisekunden:" + (System.currentTimeMillis()-anfang));
		}
		System.out.println("Done! in Milisekunden: " + (System.currentTimeMillis()-anfang) );
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			
		
		ThreadDemo myThread = new ThreadDemo();
		myThread.start();}
	}

}
