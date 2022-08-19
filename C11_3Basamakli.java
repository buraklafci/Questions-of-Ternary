package day08_OdevlerTernaryOperators;

import java.util.Scanner;

public class C11_3Basamakli {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve sayi 3 basamakli ise üc basamakli yazdirin
        //degilse üc basamakli degildir yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("üc basamakli sayi girin :");
        double ücBasamakli=scanner.nextDouble();


        System.out.println(ücBasamakli>99&&ücBasamakli<1000 ? "üc basamakli sayidir" : "üc basamakli sayi degildir");
    }
}
