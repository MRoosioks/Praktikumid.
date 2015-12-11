package praktikum3;

import lib.TextIO;

public class Tehisintellekt {
	public static void main(String[] args) {
		
		int EsimeneVanus;
		int TeineVanus;
		System.out.println("Sisesta esimene vanus:");
	    EsimeneVanus = TextIO.getlnInt();
	    System.out.println("Sisesta teine vanus:");
	    TeineVanus = TextIO.getlnInt();
	    
	    int vanusevahe = Math.abs(EsimeneVanus - TeineVanus);
	    
	    if(vanusevahe > 10){
	    	System.out.println("Jube suur vanusevahe");
	    }
	    else if(vanusevahe > 5){
	    	System.out.println("Jube vanusevahe");
	    }
	    else{
	    	System.out.println("Sobib");
	    }
	    
	}
}
