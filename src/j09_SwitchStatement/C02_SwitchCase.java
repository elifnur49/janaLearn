package j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        // Task->kullanıcının girdigi yılın ay sırasına gire ayın ismini prınt
   Scanner scan=new Scanner(System.in);
        System.out.println("bir rakam gir ");
        int ayNo= scan.nextInt();

        switch (ayNo){

            case 1:
                System.out.println("ocak");
  break;
               case 2:
                System.out.println("subat");
              break;
             case 3:
                System.out.println("mart");
                break;
                case 4:
                System.out.println("nısan");
                break;
         case 5:
                System.out.println("mayıs");
                 break;
                case 6:
                System.out.println("hazıran");
                break;
                 case 7:
                System.out.println("temmuz");
                break;
                case 8:
                System.out.println("augtos");

                break;
                case 9:
                System.out.println("eylul");

                case 10:
                System.out.println("ekım");
   break;
                case 11:
                System.out.println("kasım");
   break;
                case 12:
                System.out.println("aralık");







    }
}
    }