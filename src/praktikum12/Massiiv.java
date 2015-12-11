package praktikum12;

public class Massiiv {
	public static void main(String[] args){
		 
		int[] mingiMassiiv = {1,3,6,7};
		tryki(mingiMassiiv);
		
		 System.out.println();
			int [][] neo = {
					{1, 1, 1, 1, 1},
					{2, 3, 4, 5, 6},
					{3, 4, 5, 6, 7},
					{4, 5, 6, 7, 8},
					{5, 6, 7, 8, 9},
			};
			tryki(neo);
	}
	
	public static void tryki(int[] massiiv){
		
		for (int i = 0; i < massiiv.length; i++) {
			
			System.out.print(massiiv[i] + " ");
		}
    System.out.println();
    
    
    }
	
	public static void tryki(int[][] maatriks){
		
		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks[i].length; j++) {
				System.out.print(maatriks[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[] ridadeSummad(int[][] maatriks){
		int[] summad = new int[maatriks.length];
		for (int i = 0; i < maatriks.length; i++) {
// TODO ... reasumma
		}
		return summad;
	}
	
	public static int reaSumma(int[] rida){
		int summa = 0;
		for (int i : rida){
			summa += 1;
		}
		return summa;
	}
}
























