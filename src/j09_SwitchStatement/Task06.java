package j09_SwitchStatement;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

        Scanner scan=new Scanner(System.in);
		System.out.println("bir harf giriniz");
     char harf=scan.next().charAt(0);
	 switch(harf){
		 case 'v':
		 case 'V':
			 System.out.println("Very");
		      break;
		 case 'I':
		 case 'ı':
			 System.out.println("Important");
		      break;
		 case 'P':
		 case 'p':
			 System.out.println("Person");
	          break;

		 default:
			 System.out.println("hatalı harf girdiniz");


	 }
}
	}