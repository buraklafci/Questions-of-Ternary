package day08_OdevlerTernaryOperators;

import java.util.Scanner;

public class C10_KareMiDegilMi {
    public static void main(String[] args) {
        //kullanicidan dikdörtgenin uzunlugunu ve genisligini alin,
        //girilen degere göre kare olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci kenari girin");
        double birinciKenar=scanner.nextDouble();
        System.out.println("ikinci kenari girin :");
        double ikinciKenar=scanner.nextDouble();

        System.out.println(birinciKenar==ikinciKenar ? "karedir" : "kare degildir");
    }
}
