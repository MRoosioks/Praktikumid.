package praktikum5;

import lib.TextIO;

public class ArvuVahemik {
	public static void main(String[] args) {
		kasutajaSisestus(1, 10);
	}
	public static double kasutajaSisestus(double min, double max){
		
		while (true){
		System.out.println("Sisesta arv vahemikus " + min + " kuni " + max);	
		int kasutajaSisestus = TextIO.getlnInt();
		if (kasutajaSisestus >= min && kasutajaSisestus <= max){
			System.out.println("Sisestus korras");
			return kasutajaSisestus;
		}
		else{
			System.out.println("ebakorrekne sisestus");
			
		}
		
	}
	
	}
}
