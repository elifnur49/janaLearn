package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
   
      /*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */  
    Scanner scan=new Scanner (System.in);

        System.out.println("urun mıktarı gir");
    int  urunMiktari= scan.nextInt();

        System.out.println("urun fiyatı gir");
    int urunFiyati= scan.nextInt();
    
   double fatura= urunMiktari>100 ?( urunMiktari*urunFiyati*0.67):urunMiktari*urunFiyati;
        System.out.println("fatura = " + fatura);



    }
}
