package j04_AritmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("****Increment->Artırma*****");

int a=7;
        System.out.println(++a);//8  a=8 once arttırır sonra yazdır a=8 olur
        System.out.println(a++);//8 a=9 once yazdırır 8 sonra arttırır a=9 olur
        System.out.println(a);//9 a=9
        System.out.println(a++ + ++a);// (9(a=10)+11)=20 once yazdırır sonra arttırır a=10 once arttırır a=10 sonra yazdırır a=11

// TASK ->
        int k = 5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;// 6+6+7+8+7+7+
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);





    }
}
