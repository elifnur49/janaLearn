package j09_SwitchStatement;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/* tas
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

	Scanner scan=new Scanner(System.in);
		System.out.println("bir ay sayısı giriniz");
        int ayNo=scan.nextInt();

		switch(ayNo){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				System.out.println("31 gun ceken ay");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
			case 12:
				System.out.println("30 gun ceken ay");
				break;
			case 2:
				System.out.println("28 gun ceken ay");
				break;

				default:
				System.out.println("hatalı isim yazdınız");


		}

}
}