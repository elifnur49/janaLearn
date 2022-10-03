package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
    // girilen ya numarasına göre kac gun cektıgını prınt eden code create ediniz...

   Scanner scan=new Scanner(System.in);
        System.out.println("bir ay gir ");
int ayNo= scan.nextInt();
 switch (ayNo){

     case 1:
     case 3:
     case 5:
     case 7:
     case 8:
     case 10:
     case 12:
         System.out.println("girilen ay 31 gun icerir");
           break;
     case 4:
     case 6:
     case 9:
     case 11:
         System.out.println("girilen ya 30 gun icerir");
          break;
     case 2:
         System.out.println("yilini giriniz");
         int yil= scan.nextInt();
        if(yil%4==0){
         System.out.println();
    }else System.out.println("girilen ay 28 gun icerir");
     break;
        default:
         System.out.println("adam gibi birey gir:");
}
}
}