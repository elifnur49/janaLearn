package day_03;

import java.util.Scanner;

public class Q07_SwitchCase {
       // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
       public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           System.out.println("3 basamaklı pozitif bir sayi giriniz:");
           int sayi=scan.nextInt();

            int  yuzlerBas=sayi/100, onlarBas1=(sayi/10)%10, birlerBas1=(sayi%10);

            if(sayi>99  && sayi<1000){
          switch (yuzlerBas){
              case 0:
                  System.out.println("");break;
              case 1:
                  System.out.println("yuz");break;
              case 2:
                  System.out.println("ikiyuz");break;
              case 3:
                  System.out.println("ucyuz");break;
              case 4:
                  System.out.println("dortyuz");break;
                 case 5:
                 System.out.println("besyuz");break;
              case 6:
                  System.out.println("altıyuz");break;
              case 7:
                  System.out.println("yedıyuz");break;
              case 8:
                  System.out.println("sekizyuz");break;
              case 9:
                   System.out.println("dokuzyuz");break;

          }    switch (onlarBas1){
          case 0:
              System.out.println("");break;
          case 1:  System.out.println("on");break;
          case 2:   System.out.println("yirmı");break;
          case 3: System.out.println("otuz");break;
          case 4: System.out.println("kırk");break;
          case 5:  System.out.println("elli");break;
          case 6:System.out.println("altmıs");break;
        case 7:  System.out.println("yetmıs");break;
          case 8: System.out.println("seksen");break;
          case 9: System.out.println("doksan");break;
      }
      switch(birlerBas1){
          case 0:    System.out.println(" ");break;
          case 1:  System.out.println("bir");break;
          case 2: System.out.println("iki");break;
          case 3: System.out.println("uc");break;
          case 4:  System.out.println("dort");break;
          case 5:  System.out.println("bes");break;
          case 6: System.out.println("altı");break;
          case 7: System.out.println("yedi");break;
          case 8: System.out.println("sekiz");break;
          case 9: System.out.println("dokuz");break;
      }
}
                }
           }
