package praktikum5;

import lib.TextIO;

public class KulljaKiri {
	public static void main(String[] args) {
		kasutajaSisestus("Kas kull või kiri", 0, 1);
		
		
	}
	public static int kasutajaSisestus(String kysimus, int min, int max){
		System.out.println("Kas kull (1) või kiri (0)");
		int kasutajaSisestus = TextIO.getlnInt();
		kasutajaSisestus = (int)(Math.random() * 2);
		if(kasutajaSisestus == 1){
			System.out.println(" Kull");
		}
		else if(kasutajaSisestus == 0){
			System.out.println("Kiri"); 
		}
		else{
			System.out.println("Vale Sisestus"); 
		}
		return kasutajaSisestus;
	}
}
