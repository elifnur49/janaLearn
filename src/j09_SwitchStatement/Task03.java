package j09_SwitchStatement;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task03 Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();

      switch (gunNo){
          case 1:
        System.out.println("pazartesi");
         break;
          case 2:
          System.out.println("Salı");
          break;
          case 3:
          System.out.println("Carsamba");
          break;
          case 4:
          System.out.println("Persembe");
          break;
          case 5:
          System.out.println("Cuma");
          break;
          case 6:
          System.out.println("Cumartes");
          break;
          case 7:
          System.out.println("Pazar");
          break;
          default:
              System.out.println("hatalı sayi girdiniz");


  }
}
}