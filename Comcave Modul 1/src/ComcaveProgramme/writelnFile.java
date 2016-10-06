package ComcaveProgramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class writelnFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Dateiinhalt = "Hallo, ich bin der Inhalt";
		String dateiname = "C://test//Inhalt.txt";
		File datei = new File(dateiname);
		Formatter f= null;
		
		//hier wird bei eine neue Datei erstellt, wenn sie nicht bereits erstellt wurde
		if(!datei.exists()){
			try {
				Formatter formatierer = new Formatter(dateiname);
				System.out.println("Die Datei " + datei.getName() + " Wurde neu erstellt");
				formatierer.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}}
