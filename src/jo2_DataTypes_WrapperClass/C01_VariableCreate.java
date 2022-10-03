package jo2_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
         //1. yol-> bec practıce(recomended) tavsıye edılen
      int yas=45;
      int maas=33000;
        System.out.println("yas");//yas
        System.out.println(yas);//45
        System.out.println(maas);//
        System.out.println("nurhanım baslangıs maası:"+maas);// nur hanım baslangıc maası:33000
   //2.yol->
   int boy; // degeri atanmayan boy isminde bir int tanimlandi declaration
        System.out.println("boy");// degeri atanmamis varaible hicbir aksiyonda kullanılmaz.
     boy=175;
        System.out.println(boy);//175
   //3.yol->
        int yevmiye,age,kilo;// birden cok aynı tıpte degısken tanımlandı.
      age=33;
      yevmiye=1000;
      kilo=99;// tanımlanan degıskenlere deger ataması yapıldı
      int gunluk=1500,yil=2022,agirlik=99;
       //TRICK bir varaible bır kez tanımlanabılır bırden cok deger atanabılır.
        System.out.println(gunluk);//1500

        gunluk=1800;// yeni degerı 1800 olarak atandı.
        System.out.println(gunluk);//
        System.out.println("gunluk son degerı"+1800);
        System.out.println("gunluk degeri:"+gunluk+"yılın degeri:"+yil+ yas+ yevmiye+ agirlik);
    }
}
