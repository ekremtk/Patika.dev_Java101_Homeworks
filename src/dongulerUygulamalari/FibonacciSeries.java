package dongulerUygulamalari;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci Serisi Eleman Sayısını Giriniz: ");
        int fibCount = scan.nextInt();
        int fibV0 = 0;
        int fibV1 = 1;
        int toplam;
        int addValue;

        System.out.println("0. Eleman = " + fibV0);
        System.out.print("1. Eleman = " + fibV1);
        System.out.println(" */* 1. Toplama İşlemi ==> " + fibV0 + " + " + fibV1 + " = " + (fibV0 + fibV1));

        for (int sayac = 2; sayac <= fibCount; sayac++){
            toplam = fibV0 + fibV1;
            System.out.print(sayac + ". Eleman = " + toplam);
            System.out.println(" */* " + sayac + ". Toplama İşlemi ==> " + fibV0 + " + " + fibV1 + " = " + (fibV0 + fibV1));
            fibV0 = fibV1;
            fibV1 = toplam;
        }




    }
}
