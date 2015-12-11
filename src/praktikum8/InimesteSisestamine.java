package praktikum8;

import java.util.ArrayList;

import lib.TextIO;

public class InimesteSisestamine {
	
	public static void main(String[] args) {
				
		ArrayList<Inimene> inimesed = new ArrayList<Inimene>();
		while (true){
			String nimi = TextIO.getlnString();
			if (nimi.equals(""))
				break;
			int vanus = TextIO.getlnInt();
			Inimene keegi = new Inimene(nimi, vanus);
			inimesed.add(keegi);
		}
		for (Inimene inimene : inimesed) {
		    // Java kutsub välja Inimene klassi toString() meetodi
		    System.out.println(inimene);
		    inimene.tervita();
		}
	}
}
