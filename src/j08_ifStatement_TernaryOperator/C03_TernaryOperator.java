package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
     Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int aSayisi= scan.nextInt();

        System.out.println("    *** if-else   ***   ");

if(aSayisi%2==0){
    System.out.println("sayi CİFT");
}else System.out.println("sayi TEK");

System.out.println("    *** ternary    ***   ");
   String sunuc= (aSayisi%2==0? "sayi CİFT":"sayi TEK");  //komut cıktısı string type variable

        System.out.println( aSayisi%2==0? "sayi CİFT":"sayi TEK");
   /*TRİCK->ternary operator işlem sonucunda true veya false gore bir cıktı verir.
   eger  bu cıktı type gore bır varaible atanmazsa sout ile dogrudan print edilmeli.yoksa hata  verir.
   */

    // Task02-> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz

        System.out.println("   ***   TASK02   ***   ");

        System.out.println(aSayisi<0?"sayi NEGATİF":" sayi NEGATİF degil");






    }
        }
