package dongulerUygulamalari;

import java.util.Scanner;

public class yildizlarlaelmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int n = input.nextInt();

        // Üst Üçgen
        for (int i = 1; i <= n; i++) {
            // Boşluklar
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt Üçgen
        for (int i = 1; i <= n - 1; i++) {
            // Boşluklar
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = (n - i) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
