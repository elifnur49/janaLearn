package j03_ScannerClass_TypeCating;

//import java.util.Scanner;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {
        //kullanıcıdan veri almak için şu adım takip edilir.
        //1.adım-> Scanner classtan obj create edilir.

        //Scanner scan =new Scanner(System.in);//Scanner classından scan isminde degerini System icinden olan bir obj.

        //2.adım-> kullanıcıdan istenen veri için bildirimde bulunur-sout("....");
        // System.out.println("adınızı giriniz");


        //3.adım-kullanıcının girdigi veri data type göre bir varaible atanır.
        // String isim=scan.nextLine();//kullanıcıdan gelen string tipinde isim verisi scan obj'ni nextline() methodu atandı.

        // System.out.println("isim = " + isim);

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz.


       // System.out.println("alan:"+(kenar*kenar)+"cevre:"+(kenar*4));
        /*
      Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
     Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
     1 seker = 1.7 gr
     Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz
    */

         // System.out.println("gunluk ictiginiz cay sayısını giriniz");//2.adım
           // int caysayisi= scan.nextInt();cay icin 3.adım

        //System.out.println("seker sayisini giriniz");//seker için 2.adım
        //int seker= scan.nextInt();//seker için 3.adım

       // System.out.println("yıllık seker tuketıminiz:"+("caysayisisekeri*1.7*365)/1000+kg"));

        Scanner sc = new Scanner(System.in);//1. adım
        System.out.println("isminiz giriniz : ");//2. adım
      //  char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
       // System.out.println("isminizin ilk karakteri :" + ch);


       // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
       String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
       System.out.println("ad = " + ad);

      // System.out.println("isim = " + isim);







    }
}

