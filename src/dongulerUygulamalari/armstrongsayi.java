package dongulerUygulamalari;

import java.util.Scanner;

public class armstrongsayi {

    // 407 = 4^3 + 0^3 + 7^3 = 64+0+343 = 407 = Armstrong Sayı

    public static void main(String[] args) {

        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 10'a bölerek sondaki rakam silinmiş olur
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a = a / 10;
            numberCounter++;
        }

        // Bir Sayının Son Basamağını Bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++) {
            result *= sub;
        }
        System.out.println(result);
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int basamakNumber = 0;
        int tempNumber = number;
        int basamakValue;
        int result = 0;
        int basamakPower;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basamakNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basamakValue = tempNumber % 10;
            basamakPower = 1;
            for (int i = 1; i <= basamakNumber; i++) {
                basamakPower *= basamakValue;
            }
            result += basamakPower;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
    }
}
