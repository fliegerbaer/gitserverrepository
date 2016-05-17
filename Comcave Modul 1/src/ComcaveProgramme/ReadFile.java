package ComcaveProgramme;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File datei = new File("c://test//testu.txt");
		
		if(datei.exists()){
			System.out.println("Datei " + datei.getName() + " gibt es ");
		}else{
			System.out.println("Datei " + datei.getName() + " gibt es nicht");
			
			
		}
		char[] myText = new char[100];//String mit 100 Zeichen vorbereiten
	try{ //prüfen, ob Datei vorhanden ist
			FileReader dateiLeser = new FileReader(datei);
			
			try 
			{
				dateiLeser.read(myText);
				dateiLeser.close();
			} catch (IOException e) 
			{
				System.out.println("Fehler io");
				e.printStackTrace();//Fehlerausdruck
			}
		}catch (FileNotFoundException e)
		{
			System.out.println("Fehler Datei nicht gefunden");
			e.printStackTrace();//Fehlerausdruck
		}
	for(int i=0;i<=99;i++){
		System.out.print(myText[i]);
		
		
	}
	}

}
