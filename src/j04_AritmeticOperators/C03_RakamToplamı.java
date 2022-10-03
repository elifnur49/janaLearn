package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {
    //  kulanicidan alinan bir sayının rakamları toplamını prınt eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("3 basamaklı bır sayı gırınız");


        int sayi =sc.nextInt();

        // 1 ler basamagı -> bır sayının 10 bolumunden 1 ler basamagıdır.
        int birler=sayi%10; //sayının bırler basamagi
        sayi/=10;// sayi ona bolumunden bolumu verır.853/10> 85
        int onlar=sayi/10;// 85 ın 10 bolumunden kalan->5
        int yuzler=sayi/10;// 85 ın 10 bolumunu verir.->8

        int rakamToplamı= birler+onlar+yuzler;
        System.out.println("rakamToplamı:"+rakamToplamı);


    }
}
