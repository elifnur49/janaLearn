package Day_01;

import java.util.Scanner;

public class q003_odev {
    public static void main(String[] args) {

        /* Soru 5:
         * 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
         */


        // 1. -> degiskenlerimizi olusturuyoruz ve Scanner objemizi create ediyoruz

        int first, second, third , fourth , fifth;

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayinizi girer misiniz? ");
        first = scan.nextInt();

        System.out.print("Ikinci sayinizi girer misiniz? ");
        second = scan.nextInt();

        System.out.print("Ucuncu sayinizi girer misiniz? ");
        third = scan.nextInt();

        System.out.print("Dorduncu sayinizi girer misiniz? ");
        fourth = scan.nextInt();

        System.out.print("Besinci sayinizi girer misiniz? ");
        fifth = scan.nextInt();

        // 2. adimda matematiksel islemlerimizi gerceklestiriyoruz


        // 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.

        // ((((120 / 60) * 10) + 20) - 40)


        int sonuc = ((((first / second) * third) + fourth) - fifth);


        // 3. adimda ise sonucumuzu yazdiriyoruz

        System.out.println("((((" + first + " / " + second + ") * " + third + ") + " + fourth + ") - " + fifth + ") = " + sonuc);



    }



}
