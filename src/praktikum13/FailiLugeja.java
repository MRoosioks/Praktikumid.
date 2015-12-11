package praktikum13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class FailiLugeja {
	
	public static ArrayList<String> loeFail(String failinimi){
		
		ArrayList<String> read = new ArrayList<>();
		
		File file = new File(failinimi);
		
		try {
		    // avame faili lugemise jaoks
			BufferedReader in = new BufferedReader(new FileReader(file));
			String rida;

			// loeme failist rida haaval
			while ((rida = in.readLine()) != null) {
				read.add(rida);
				
			}
		}
		catch (FileNotFoundException e) {
		    System.out.println("Faili ei leitud: \n" + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error, jee, mingi muu error: " + e.getMessage());
		}
		
		return read;
	}
	
	public static void main(String[] args) {
	    
	    // punkt tÃ¤histab jooksvat kataloogi
	    String kataloogitee = FailiLugeja.class.getResource(".").getPath();
	    ArrayList<String> failiSisu = loeFail(kataloogitee + "kala.txt");	
	    Collections.sort(failiSisu);
	    System.out.println(failiSisu);
	}
}
	
