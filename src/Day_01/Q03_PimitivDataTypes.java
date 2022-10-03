package Day_01;

public class Q03_PimitivDataTypes {

   /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         * !!! soutv degeri ile yazdirma
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim


    public static void main(String[] args) {
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerin

      byte byteMin=Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);
      byte byteMax=Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);
       short shortMin=Short.MIN_VALUE;
        System.out.println("sortMın = " + shortMin);
       short shortMax=Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        int intMin= Integer.MIN_VALUE;
        System.out.println("intMın = " + intMin);
       int intMax= Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);
       long longMin=Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);
      long longMax=Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);
      double doubleMin=Double.MIN_VALUE;
        System.out.println("doubleMin = " + doubleMin);
        double doubleMax=Double.MAX_VALUE;
        System.out.println("doubleMax = " + doubleMax);
        float floatMin=Float.MIN_VALUE;
        System.out.println("floatMin = " + floatMin);
        float floatMax=Float.MAX_VALUE;//byte, short, integer,long, double, float veri tiplerinin max ve min degerlerin

//Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double
//Degiskenler icin anlamli isimler kullanip, yazdiralim

      float laptopfiyat=999.99F;
      double kilometre=123.5;
      char cinsiyet='E';
      boolean dogrumu=true;
        System.out.println("laptopfiyat = " + laptopfiyat);
        System.out.println("kilometre = " + kilometre);
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("dogrumu = " + dogrumu);


    }
}
