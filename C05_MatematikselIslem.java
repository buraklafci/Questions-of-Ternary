package day08_OdevlerTernaryOperators;

import java.util.Scanner;

public class C05_MatematikselIslem {
    public static void main(String[] args) {
        //kullanicidan bir tamsayi alin 10dan kücükse rakam
        //100den kücükse iki basamakli sayi
        //degilse 3 basamakli sayi veya daha büyük sayi

        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen sayiyi giriniz:");
        int sayi = scan.nextInt();
        System.out.println(sayi<10 ? "rakam" : (sayi<100 ? "iki basamakli sayi" : "üc basamakli sayi " +  "veya daha büyük sayi"));

    }
}
