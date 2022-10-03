package j04_AritmeticOperators;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {


        /*
        *kullanıcıdan uc basamaklı bır sayı alın.
        * ve sayının rakamlarını bırler onlar ve yuzler basamagı olarak yazdrın.
     * ornek:ınputs:853
         *output: gırdıgınız bırler basamagı:3
         *         girdiginiz sayininin onlar basamagı:5
         *        girdiginiz sayininin yuzler basamagı:8
         */





        Scanner sc=new Scanner(System.in);
        System.out.print("3 basamaklı bır sayı gırınız");

        int  sayi =sc.nextInt();

        // 1 ler basamagı -> bır sayının 10 bolumunden 1 ler basamagıdır.
     int birler=sayi%10; //sayının bırler basamagi
     sayi/=10;// sayi ona bolumunden bolumu verır.853/10-> 85
     int onlar=sayi%10;// 85 ın 10 bolumunden kalan->5
     int yuzler=sayi/10;// 85 ın 10 bolumunu verir.->8

        System.out.println("girdiginiz sayinin birler basamagi:"+birler+"\nGirdiginiz sayinin onlar basamagi:"+onlar+"\nGiridiginiz sayinin yuzler basamagi:"+yuzler);


    }
}
