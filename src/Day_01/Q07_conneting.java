package Day_01;

public class Q07_conneting {
   /*
    galonu litreye ceviren bir java programı yazınız
    1 gallon=3.785 litre
    litreyi galona ceviren bir java programı yazınız
    1 litre=1/3.785 goallon
    // sıcaklı fahrenayt tan santıgrad derecesine ceviren bir java programı yazınız
// formul
//c=(f-32)*5/9
*/
   public static void main(String[] args) {
    int gallon=1000;
    double litre=gallon*3.785;
    String result1=gallon +" gallon degeri " +litre +" litredir ";
       System.out.println("result:"+result1);

double liters=100;
double galon=liters/3.785;
String  result2=" litres degeri "+ galon +"galona esittir";
       System.out.println("result2 = " + result2);

   }


}

