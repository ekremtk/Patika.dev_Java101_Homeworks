package dongulerUygulamalari;

import java.util.Scanner;

public class basamaksayilaritoplama {

    // Bir sayının basamak sayılarının toplamını hesaplayan program.
    // Örnek : 1643 = 1 + 6 + 4 + 3 = 14

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int tempNumber = number;
        int basamakValue;
        int result = 0;

        tempNumber = number;
        while (tempNumber != 0) {
            basamakValue = tempNumber % 10;
            result += basamakValue;
            tempNumber /= 10;
        }

        System.out.println(number + " sayısının basamakları toplamı: " + result);

    }
}
