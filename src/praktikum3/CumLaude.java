package praktikum3;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {
		
		int lõputööhinne;
	    System.out.println("Sisesta lõputöö hinne: ");
	    lõputööhinne = TextIO.getlnInt();
		double keskminehinne;
	    System.out.println("Sisesta keskmine hinne: ");
	    keskminehinne = TextIO.getlnDouble();
	    
	    if (keskminehinne > 4.5 && lõputööhinne == 5) {
	    	//See blokk täidetakse, kui see tingimus vastab tõele
	    	System.out.println("Jah saad cum laude diplomile");
	    	
	    } else if(keskminehinne < 0 || lõputööhinne < 1 ) {
			System.out.println("Sisesta korrektsesd numbrid");
			return;
		    }
	    
	    else  {
	    	System.out.println("Sa ei saa cum laude diplomile"); 
	    }

	}
}
