package praktikum10;

public class Rekursioon {

	public static void main(String[] args) {
		System.out.println(astenda(2, 3));
		// astenda(2, 3) => 2 * astenda(2, 2)
		// astenda(2, 2) => 2 * astenda(2, 1)
		// astenda(2, 1) => 2
		
		int i = 0;
		while (true){
			System.out.println(i + " - " + fibonacci(i));
			i++;
		}
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n ==1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int astenda(int arv, int aste) {
		if (aste == 1)
			return arv;
		else
			return arv * astenda(arv, aste - 1);
	}
}
