package day08_OdevlerTernaryOperators;

import java.util.Scanner;

public class C04_MatematikselIslem {
    //kullanıcıdan sayi alin pozitifse sayi pozitif yazdirin negatifse karesini yazdirin
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen sayiyi giriniz:");
        int sayi = scan.nextInt();

        //farkli data türlerinde atama yapilmaz yazdirilir

        System.out.println(sayi>0 ? "pozitif" : (sayi*sayi));
    }
}