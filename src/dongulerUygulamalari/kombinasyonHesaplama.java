package dongulerUygulamalari;

import java.util.Scanner;

public class kombinasyonHesaplama {

    // Kombinasyon hesaplayan program.

    public static void main(String[] args) {
        // C(n, r) = n! / (r! (n-r)!)
        // n! = 1 * 2 * 3 * 4 * ... * n

        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman Sayısı (n): ");

        int n = scan.nextInt();

        System.out.print("Seçim Sayısı (r): ");

        int r = scan.nextInt();

        int nFaktoriyel = 1;
        int rFaktoriyel = 1;
        int nrFaktoriyel= 1;
        int kombinasyon;

        for (int i = 1; i <= n; i++) {
            nFaktoriyel = nFaktoriyel * i;
        }

        for (int i = 1; i <= r; i++) {
            rFaktoriyel = rFaktoriyel * i;
        }

        for (int i = 1; i <= (n-r); i++) {
            nrFaktoriyel = nrFaktoriyel * i;
        }

        kombinasyon = nFaktoriyel / (rFaktoriyel * nrFaktoriyel);

        System.out.println("Kombinasyon (" + n + ", " + r + "): " + kombinasyon);
    }
}
