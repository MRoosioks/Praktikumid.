package praktikum5;

public class ArvuKuup {
	public static void main(String[] args) {
		int arv = 3;
		kuup(arv);
		//System.out.println(arvukuup());
		
	}
	public static int kuup(int sisend){
		System.out.println("Kuup meetod töötab");
		int b = (int) Math.pow(sisend, 3);
		System.out.println("Arvu kuup on " + b);
		
		return b;
	}

}
