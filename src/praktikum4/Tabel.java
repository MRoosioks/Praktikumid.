package praktikum4;

public class Tabel {
	public static void main(String[] args) {

	        int tabeliSuurus = 7;
	        
	       
	        for (int i = 0; i < tabeliSuurus * 2 + 3; i++) {
				System.out.print("-");
				
			}
	        System.out.println();
	        
	        for (int j = 0; j < tabeliSuurus; j++) {
				System.out.print("| ");
			}
	        
	        for (int j = 0; j < tabeliSuurus; j++) {
	        	System.out.print("| ");
	            for (int i = 0; i < tabeliSuurus; i++) {
	                if (i == j || i + j == tabeliSuurus - 1)
	                    System.out.print("x ");
	                else 
	                    System.out.print("0 ");
	                
	               // System.out.print("(j=" + j + "i=" + i + ")");
	            }
	            System.out.print("| ");
	            System.out.println(); // reavahetus
	        for (int i = 0; i < tabeliSuurus * 2 + 3; i++) {
	        	System.out.print("-");{
						}
					}
	        }
	    }
	}
