
package praktikum7;
import lib.TextIO;
public class ArvudVastupidisesJ2rjekorras {
	
	public static void main(String[] args) {
		
		
		int[] arvud = new int[10];
		
		
		
		for (int i = 0; i <= 9; i++) {
			arvud[i] = TextIO.getlnInt();
			
		}
		
		for (int i = arvud.length; i > 0; i--) {
			System.out.println(arvud[i-1]);
			
		}
		
		
	}
}

