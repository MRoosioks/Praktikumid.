package praktikum4;

public class Tsyklid {
	public static void main(String[] args) {

//	if (true){
//		
//		System.out.println("tingimus on tõene");
//		
//	}
	
		
	int number = 0;
	while (number < 3) {
		System.out.println("tingimus on tõene");
		System.out.println("number=" + number);
		number = number + 1; 
		if (number == 1)
			continue;
//			break;
		number = number + 1;

	}
	
	System.out.println("while tsükkel on lõppenud");
	System.out.println("number=" + number);
	
//	for (int i = 0;i < 3;i++){
//		System.out.println("for tsükkel, i väärtus on:" + i);
//		
//	}
}
}
