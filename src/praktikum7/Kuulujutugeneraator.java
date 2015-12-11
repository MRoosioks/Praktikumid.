package praktikum7;

public class Kuulujutugeneraator {
	public static void main(String[] args) {

		
		String[] naisenimi = {"Mari", "Kadri", "Ets"};
		int suvalineIndeks = (int)(Math.random() * naisenimi.length);
		
		String[] mehenimi = {"Jaak", "Ain", "Peeter"};
		int suvalineIndeks1 = (int)(Math.random() * mehenimi.length);
		
		String[] tegus6na = {"laulavad", "tantsivad", "magavad"};
		int suvalineIndeks2 = (int)(Math.random() * tegus6na.length);
		
		System.out.println(naisenimi[suvalineIndeks] + " ja " + mehenimi[suvalineIndeks1] + " " + tegus6na [suvalineIndeks2] + " koos.");
		
	}
}
