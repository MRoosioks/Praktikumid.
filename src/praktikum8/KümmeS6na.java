package praktikum8;

import lib.TextIO;

public class KümmeS6na {
	public static void main(String[] args) {
		String s;
		System.out.print("Sisesta 10 sõna: ");
		for (int i = 0; i < 10; i++) {
			s = TextIO.getlnString();
		System.out.print(s.length() + " " + s);
		System.out.println();

		}

	}
}
