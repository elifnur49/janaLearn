package j09_SwitchStatement;

import java.util.Scanner;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
  //TASK-girilen haftanın gunu haftaiçi veya sonu oldugunu print eden code create ediniz.
  Scanner sacn=new Scanner(System.in);
        System.out.println("haftanın bir gununu gir");

        String gun=sacn.next();
 switch(gun){
     case"pazartesi":
     case"salı":
         case"carsamba":
     case"persembe":
     case"cuma":
         System.out.println("girilen gunler haftaaıcı");
         break;
     case"cumartesı":
     case"pazar":
         System.out.println("girilen gunler haftasonu");
          break;
     default:
         System.out.println("hatalı gırıs yaptınız");



 }







    }
}
