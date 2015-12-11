package praktikum15;
import java.util.ArrayList;

public class Autosadu {
	
	ArrayList<Auto> autod = new ArrayList<Auto>();
	public Autosadu (int autodeArv, int aknaLaius, int aknaKorgus) {
		
	
		for(int i=0 ; i<autodeArv ; i++){
			autod.add(new Auto((int)Math.random()*1000));
	
		}
	}
}
