package j04_AritmeticOperators;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

   Scanner scan=new Scanner(System.in);
     int a=2;
     int b=3;
     int c=4;
     int d=5;
        System.out.println(a*b*c*d);
      int sonuc=scan.nextInt();
        System.out.println("sonuc = " + sonuc);

    }
}
