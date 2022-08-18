package dongulerUygulamalari;

import java.util.Scanner;

public class bolmeveortalama {

    // Girilen Sayıya Kadar Olan Sayılardan 3 ve 4'e tam Bölünenleri Bul
    // Tam Bölünenlerin Ortalamasını Hesapla
    public static void main(String[] args) {
        int sayi, sayac = 0, toplam = 0;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        sayi = inputScanner.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println(i);
                toplam = toplam + i;
                sayac++;
            }
        }
        System.out.println("Ortalama Deger: " + toplam/sayac);
    }

}
