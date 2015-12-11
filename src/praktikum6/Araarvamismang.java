
package praktikum6;

import lib.TextIO;

public class Araarvamismang {
	public static void main(String[] args) {
		int arvutiArv = suvalineArv(1, 100);
		System.out.println("Arva ära number 1-100 ");

		while (true) {
			int kasutajaArvas = TextIO.getlnInt();

			if (arvutiArv == kasutajaArvas) {
				System.out.println("Ära arvasid");
				break;

			} else if (arvutiArv > kasutajaArvas) {
				System.out.println("See arv on suurem");

			} else {
				System.out.println("See arv on väiksem");
			}
		}

	}

	public static int suvalineArv(int min, int max) {

		int vahemik = max - min + 1;
		return (int) (Math.random() * vahemik) + min;

	}
}
