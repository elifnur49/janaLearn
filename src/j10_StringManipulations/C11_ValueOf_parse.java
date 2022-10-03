package j10_StringManipulations;

import com.sun.jdi.IntegerValue;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
    //  Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


// task-> string type verilen ıkı adet bagış miktarını kodlayan code create ediniz.

  String bagıs1="1500";
  String bagıs2="2500";


  int bagısDegeri1=Integer.valueOf(bagıs1);// bagıs1 string içindeki sayı degerini int'e cevirdi,
  int bagısDegeri2= Integer.valueOf(bagıs2);//bagıs2 string içindeki sayı degerini ınt e cevirdi

        System.out.println("toplam bagıs mıktarı:"+(bagısDegeri1+bagısDegeri2));

        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);//1453


        System.out.println("toplam bagıs : "+(Integer.parseInt(bagıs1) + Integer.parseInt(bagıs2)));//4000


        int tc=1234567;
        String strTc = String.valueOf(tc);
        System.out.println("strTc = " + strTc);//1234567
        System.out.println("strTc+tc = " + (strTc + tc));//

        String  fiyat="$150";
        int yeniFiyat=  Integer.valueOf(fiyat);
        System.out.println("yeniFiyat = " + yeniFiyat);


    }
}






