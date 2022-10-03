package Day_01;

import java.util.Scanner;

public class Q09_Scanner {
    //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
    //  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
    //  Isim – soyisim : Elly Dainty
    //  Kullanicidan ismini alip isminin bas harfini yazdirin.

    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      // double yaricap= scan.nextDouble();
       // System.out.println("yaricap = " + yaricap);
         // System.out.println("cemberin cevresi : " + 2*3.14*yaricap);
       //   System.out.println("dairenin alani : " + 3.14*yaricap*yaricap);


        System.out.println("lutfen isim giriniz:");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisim giriniz:");
        String soyisim=scan.nextLine();
        System.out.println("isim-soyisim = " + isim+" "+soyisim);

        System.out.println("isminizi girin");
       char ilkharf=scan.next().charAt(0) ;
        System.out.println("girdiginiz ismin ilk harfi:"+ilkharf);
    }



}