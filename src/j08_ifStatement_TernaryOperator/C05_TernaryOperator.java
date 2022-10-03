package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
// TASK-> girilen bir tamsayı çiftse yarısını değilse
// girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz
Scanner scan=new Scanner(System.in);

        System.out.println("agam bi tamsayı gir bakam");
       int aSayisi= scan.nextInt();

      //int sonuc=aSayisi%2==0? aSayisi/2:"girilen sayı tek oldugu için yarısı tamsayı degildir"

  /* Trıck-> ternary iki drum (F/F) icin faeklı data type cıktısı veriyorsa variable atama yapmadan sout yapılır.
 */
  System.out.println(aSayisi % 2 == 0 ? aSayisi/2: "girilen sayı tek oldugu icin yarsısı tamsayı degildir");



    }
}
