package j10_StringManipulations;

public class C05_Start_EndWith {
    public static void main(String[] args) {
/**
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *  String'in basladigi characteri dogrular
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */
  String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("is"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.startsWith(   "a" ,  3));//false 3.indexten itibaren string a ile mi başlar.
                                                                        //istanbul
                                                                        //0123

        System.out.println(sehir.startsWith(   "t" ,  3));//false
        System.out.println(sehir.startsWith("l"));//true
        System.out.println(sehir.startsWith("bul"));//true
        System.out.println(sehir.startsWith("bu"));//false

      String str="bul";
        System.out.println(sehir.endsWith(str));// true
      int yas=48;

      // Task-> girilen e-mail hesabının @gmail.com içermiyorsa lütfen gmail hesabı giriniz.
      //@gmail.com ile bitiyorsaa "hesabınız onaylandı" aksi dutumda gecerli bir hesap giriniz prınt edn code create ediniz.
      // scanner string if (email.contaıns.(gmail)) else if (gmail.endswith gmail.))
      //iceriyorsa contain icermiyorsa...
    }
}
