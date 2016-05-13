
public class Monate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int monat=0;monat<=13;monat++){
switch(monat){

case 1:
	System.out.println("Januar");
	break;
case 2:
	System.out.println("Februar");
	break;
case 3:
	System.out.println("März");
	break;
case 4:
	System.out.println("April");
	break;
case 5:
	System.out.println("Mai");
	break;
case 6:
	System.out.println("Juni");
	break;
case 7:
	System.out.println("Juli");
	break;
case 8:
	System.out.println("August");
	break;
case 9:
	System.out.println("September");
	break;
case 10:
	System.out.println("Oktober");
	break;
case 11:
	System.out.println("November");
	break;
case 12:
	System.out.println("Dezember");
	break;
	default:
		System.out.println("kein Monat");
}

String [] wochentag={"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sontag"};
if((monat>=1 & monat<=6)){
System.out.println(wochentag[monat]);
System.out.println(wochentag.length);
}
else{
	System.out.println("kein Wochentag");
}
	}
	}
	
	

}
