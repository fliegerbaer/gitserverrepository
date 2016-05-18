package ComcaveProgramme;

import java.io.File;
import java.util.Formatter;

public class writelnFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Dateiinhalt = "Hallo, ich bin der Inhalt";
		File datei = new File("C://test//Inhalt.txt");
		Formatter f= null;
		
		if(datei.exists()){
			try {
				Formatter formatierer = new Formatter("c://test//Inhalt.txt");
				
				System.out.println("Die Datei " + datei.getName() + " Wurde neu erstellt");
				formatierer.close();
				
				//Scanner Leser = new
			}
		}

	}

}
