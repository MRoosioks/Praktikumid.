package praktikum13;

import java.util.ArrayList;

public class Keskmine {

	public static void main( String[] args){
		
		
	    String kataloogitee = Keskmine.class.getResource(".").getPath();
	    ArrayList<String> failiSisu = FailiLugeja.loeFail(kataloogitee + "numbrid.txt");	
	    System.out.println(failiSisu);
	    
	    double summa = 0;
	    int vigaseidRidu = 0;
	    for (String rida : failiSisu) {
			System.out.println(rida);
			double nr;
			
			try {
				nr = Double.parseDouble(rida);
				summa += nr;
			} catch (NumberFormatException e) {
				System.out.println("Vigane rida(ei arvesta arvutuses)" + rida);
				vigaseidRidu++;
			}			
			
		}
	    double keskmine = summa/(failiSisu.size() - vigaseidRidu);
	    System.out.println("Keskmine on " + keskmine);
	    
	}
}
