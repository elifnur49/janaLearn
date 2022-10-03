package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernary {
    public static void main(String[] args) {
/* TASK:
      kullanıcında bir sasyi aliniz.
      Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadıgını kontrol edınız.
      10 dan kucuk ise ekrana "Rakam" yazdırınız degılse "Pozitif" yazdırırız
      Sayi 0 dan lucuk ise ekrana " negatif sayı" yazdırınınz
      */
        Scanner scan=new Scanner(System.in);
        System.out.println("tamsayı gir:");
   int aSayisi= scan.nextInt();
        System.out.println( aSayisi >= 0 ? (aSayisi< 10 ?"Rakam":"Pozitif Sayi" ):"Negatif sayi");







    }
}
