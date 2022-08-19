package day08_OdevlerTernaryOperators;

import java.util.Scanner;

public class C02_OdevCiftMiTekMi {
    public static void main(String[] args) {
        //kullanicidan sayi alin ciftmi tekmi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen sayiyi giriniz:");
        int sayi = scan.nextInt();

        System.out.println("girilen sayi : "+(sayi%2==0 ? "cift" : "tek"));
    }
}
