package ComcaveProgramme;
import java.io.File;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File datei = new File("c://test//testu.txt");
		
		if(datei.exists()){
			System.out.println("Datei " + datei.getName() + " gibt es ");
		}else{
			System.out.println("Datei " + datei.getName() + " gibt es nicht");
		}

	}

}
