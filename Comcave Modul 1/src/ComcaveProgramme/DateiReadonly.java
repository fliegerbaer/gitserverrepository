package ComcaveProgramme;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Formatter;

public class DateiReadonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File datei = new File("//Users//frank//test//Datei1.txt");  //datei = Repräsentant der Datei
		
		//falls Datei nicht erzeugt, erstellen
		try {
			Formatter f = new Formatter(datei);
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Datei breits vorhanden");
		}
		
		//Datei ist jetzt erzeugt
		
		//Datei  mit Worten befüllen
		
		String text="Hallo ich bin ein Text";
		
		long laenge = datei.length();
		
		System.out.println(datei.length());
		
		if(datei.canWrite()){
			System.out.println("Datei ist beschreibbar");
		}
		else{System.out.println("Datei ist nicht beschreibbar");
			
		}
		//datei.setReadOnly();
		//Filewriter(datei,1);
		
		
		
		

	}
	//FileWriter;

}
