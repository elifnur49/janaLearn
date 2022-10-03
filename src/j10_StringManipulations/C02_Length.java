package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {

        /* Lenght metodu gırılen stringin uzunlugunu:  icinde bulunan karakter sayısını return eder.
         butun karakterlerı (bosluk vs) sayıp adedimi verir.

         */
        String str="maden geldin dünyaya otur çalış javaya";

       int strKrtSayisi= str.length(); //int type bir data verir.
        System.out.println(str);//maden geldi ndünyaya otur calış javaya
        System.out.println(strKrtSayisi);// 38
        System.out.println(str.length());//38

     String str1="";// hiçlik degeri içi kapalı
     System.out.println(str1.length());// 0

     String str2=" ";// içi bos 1 karakter
     System.out.println(str2.length()); // 1

        String str3=null;

        //str3.concat(str1);//rte
        System.out.println(str3.length());//Run time  error
        // TRICK-> null atanan stringler String method çalışmaz cıssss
        /*
        null case sensitivedir. yani Null veyaNULL yazılamaz
        null bir değer değildir(dutluk)sadece hiçliği gösteren  bir pointer(giriş işaretçi)
         */

        String name;// deklare edilmiş ama tanmamış  string String method çalışmaz CTE vcerir.

        //  name.concat(str1);


    }
}


