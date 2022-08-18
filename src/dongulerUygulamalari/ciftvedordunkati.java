package dongulerUygulamalari;

import java.util.Scanner;

public class ciftvedordunkati {
    // Tek bir sayı girilene kadar kullanıcıdan giriş almaya devam eden
    // Girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

    public static void main(String[] args) {

        int inputVariable;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            inputVariable = scan.nextInt();
            if ((inputVariable % 2 == 0) && (inputVariable % 4 == 0)) {
                total += inputVariable;
            }
        } while (inputVariable % 2 == 0);

        System.out.println("Toplam: " + total);
    }
}
