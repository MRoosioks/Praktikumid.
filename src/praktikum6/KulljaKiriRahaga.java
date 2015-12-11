package praktikum6;

import lib.TextIO;

public class KulljaKiriRahaga {
	public static void main(String[] args) {
		int kasutajaRaha = 100;
		System.out.println("Palun sisesta panus (max 25)");
		int panus = TextIO.getlnInt();
		kasutajaRaha -= panus;
		
		while(true){
		
			int kullV6iKiri = Araarvamismang.suvalineArv(0,1);
		
			if (kullV6iKiri == 0){
				System.out.println("Võitsid, saad topelt raha tagasi");
				kasutajaRaha += panus*2;
				
			}else{
				System.out.println("Sa kaotasid");
				
			}
		
			System.out.println("Sul on " + kasutajaRaha + " raha. ");
			continue;
		}
	}
}
