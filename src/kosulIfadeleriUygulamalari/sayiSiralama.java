package kosulIfadeleriUygulamalari;

import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz (a): ");
        a = input.nextInt();

        System.out.print("2. Sayıyı Giriniz (b): ");
        b = input.nextInt();

        System.out.print("3. Sayıyı Giriniz (c): ");
        c = input.nextInt();

        /*
        // Büyükten Küçüğe Sıralama
        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
            if (b > a) {
                System.out.println("c > b > a");
            } else {
                System.out.println("c > a > b");
            }
        }

         */

        /*
        Ödev
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
         */

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            if (b < a) {
                System.out.println("c < b < a");
            } else {
                System.out.println("c < a < b");
            }
        }

    }
}
