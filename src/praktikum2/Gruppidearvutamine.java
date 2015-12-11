package praktikum2;

import lib.TextIO;

public class Gruppidearvutamine {
public static void main(String[] args) {
    int inimestearv;
    int grupisuurus;
    int gruppidearv;
    
    System.out.println("Sisesta inimeste arv: ");
    inimestearv = TextIO.getlnInt();
    
    System.out.println("Sisesta gruppide suurus: ");
    grupisuurus = TextIO.getlnInt();
    
    gruppidearv = inimestearv / grupisuurus;
    System.out.println("Gruppide arv: " + gruppidearv);
    
    int j22k = inimestearv % grupisuurus;
    System.out.println("Üle jääb " + j22k + " inimest: ");
    }
}
