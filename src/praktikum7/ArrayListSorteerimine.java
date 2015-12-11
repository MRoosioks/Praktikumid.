package praktikum7;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class ArrayListSorteerimine {
	public static void main(String[] args) {
		ArrayList <String> nimed = new ArrayList<String>();
		
		
		nimed.add("Mati");
		nimed.add("A");
		nimed.add("E");
		Collections.sort(nimed);
		for (String nimi : nimed) {
			System.out.println(nimi);
		}

	}
}
