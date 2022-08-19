package day08_OdevlerTernaryOperators;

import java.util.Scanner;

public class C06_HarfMiDegilMi {
    public static void main(String[] args) {
        //kullanıcıdan bir harf isteyin kücükse kücük
        //büyükse büyük degilse girdiginiz karakter harf degildir yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen harf giriniz:");
        char harf = scan.next().charAt(0);
        System.out.println(harf>='a'&& harf<='z' ? "kücük harf" : (harf>='A' && harf<='Z' ? "büyük harf" : "girilen harf degil"));
    }
}
