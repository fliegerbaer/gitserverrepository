package ComcaveProgramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileErstellen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File datei = new File("C://test/neuedatei.txt");
		
		if(!datei.exists()){
			try {
				Formatter formatierer = new Formatter("C://test/neuedatei.txt");
				
				System.out.println("Die Datei " + datei.getName() + " wurde erstellt");
				formatierer.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//formatierer.close();
		}
		else{
			System.out.println("Die Datei " + datei.getName() + " existiert bereits");
		}

	}

}
