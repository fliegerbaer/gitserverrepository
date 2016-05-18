package ComcaveProgramme;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Formatter;

public class TextAnDateiAnhaengen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File datei = new File("//Users//frank//test//Datei1.txt");
		
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
		
		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter(datei)); //Neuer aussenkanal öffnen
			out.newLine(); //Neue Zeile einfügen
			out.write(text);
			out.newLine();
			for(int i = 1; i<=100;i++){
				out.write(text);
				out.newLine();
			}
			out.append(text);
			out.flush();
			out.close();
			System.out.println(datei.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Filewriter(datei,1);
		
		
		
		

	}
	//FileWriter;

}
