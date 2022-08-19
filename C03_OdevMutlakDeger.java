package day08_OdevlerTernaryOperators;

import java.util.Scanner;

public class C03_OdevMutlakDeger {
    public static void main(String[] args) {
        //sayidan deger alin mutlak degerini yansitin

        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen sayiyi giriniz:");
        int sayi = scan.nextInt();

        System.out.println("girilen sayinin mutlak degeri :" +(sayi>=0 ? sayi : (-1*sayi)));
    }
}
