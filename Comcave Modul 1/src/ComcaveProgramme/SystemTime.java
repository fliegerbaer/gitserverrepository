package ComcaveProgramme;

import java.util.Calendar;
import java.util.Date;

public class SystemTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time = System.currentTimeMillis();
		
		System.out.println("Milisekunden seit 1.1.1970 "+ time);
		
		System.out.println("Sekunden seit 1.1.1970 "+ time/1000);
		
		Date d = new Date();
		
		//Calendar c = new Calendar();
		
		System.out.println(d);
		
		//get instance holt sich die aktuelle zeit
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));  //Komforttable 
		
		

	}

}
