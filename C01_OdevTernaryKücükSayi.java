package day08_OdevlerTernaryOperators;

import java.util.Scanner;

public class C01_OdevTernaryKücükSayi {
    public static void main(String[] args) {
        //kullanıcıdan iki sayiyi isteyin büyük olmayani yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen birinci sayiyi giriniz:");
        double sayi1 = scan.nextDouble();
        System.out.println("lütfen ikinci sayiyi giriniz:");
        double sayi2 = scan.nextDouble();

        double sonuc=sayi1>sayi2 ? sayi2 : sayi1;
        System.out.println(sonuc);

    }
}
