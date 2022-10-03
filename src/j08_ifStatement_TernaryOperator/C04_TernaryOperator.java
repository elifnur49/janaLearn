package j08_ifStatement_TernaryOperator;

import java.util.Scanner;
public class C04_TernaryOperator {
    public static void main(String[] args) {
        // TASK-> girilen bir pozitif tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

    Scanner scan=new Scanner(System.in);
        System.out.println("agam bir tamsayı gir bakam:");
    int aSayisi= scan.nextInt();
       System.out.println(aSayisi > 9 ? "sayi iki veya daha fazla basamaklı ": "sayi tek basamaklı");

  String sonuc=( aSayisi > 9 ||aSayisi<-9) ? " sayi iki veya daha fazla basamaklı ": "sayi tek basamaklı";
        System.out.println(sonuc);


    }
}
