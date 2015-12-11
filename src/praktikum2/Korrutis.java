package praktikum2;

import lib.TextIO;

public class Korrutis {
public static void main(String[] args) {
	double a;
    double b;
    double c;
    
    System.out.print("Sisesta esimene arv: ");
    a = TextIO.getlnDouble();
    
    System.out.print("Sisesta teine arv arv: ");
    b = TextIO.getlnDouble();
    
    c = a * b;
    System.out.printf(a + " * " + b + " = " + c, c);
}
}
