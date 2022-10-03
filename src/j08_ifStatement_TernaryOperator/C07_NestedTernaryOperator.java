package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {

 /*
        TASK :
         Girilen bir pozitif tamsayı  4 basamaklı ise  “4 Basamaklı” print eden
         4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise “4 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “4 basamaklı olmayan tek sayı yazdırın.”

         */

       Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayi gir");
        int aSayisi= scan.nextInt();

        System.out.println((aSayisi>999&&aSayisi<10000)? "4 Basamaklı": aSayisi% 2 == 0 ? " 4 Basamaklı olmayan cift sayi ": " 4 basamaklı olmauan tek sayi");







    }
}
