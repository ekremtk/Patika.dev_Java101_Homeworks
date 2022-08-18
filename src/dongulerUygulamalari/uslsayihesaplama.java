package dongulerUygulamalari;

import java.util.Scanner;

public class uslsayihesaplama {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı: ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        k = input.nextInt();
        int total = 1;

        // 3^4 = 3 * 3 * 3 * 3
        int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }

        System.out.println("Cevap: " + total);

    }
}
