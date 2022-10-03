package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
         concat() metadu içine (parametre)aldıgı string variable'ı calisitgi stringin sonuna ekler
         java'da + işlemi yapılırken eger en az bir string variable varsa java toplama degil concat yapar.
          */

  String name=" Nur";
  String meslek=" Qa terster ";
  name.concat(meslek);
        System.out.println(name.concat(meslek));// Nur Qa teste
        System.out.println(name);// Nur
// ahan da TRICK-> String methodları variable gecici degisklik yapar.
// ama degişken atama yapılırsa kalıcı degişir.
         name=meslek.concat(name);
        System.out.println("name:." + name);//name=Qa tester Nur

        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)




        // TRICK->concat methodu parametre olarak string type harici tüm dataları stringe concat eder.


    }
}
