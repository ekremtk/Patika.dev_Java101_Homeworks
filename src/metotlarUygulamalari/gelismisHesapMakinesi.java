package metotlarUygulamalari;

import java.util.Scanner;

public class gelismisHesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci Sayı 0'dan Farklı Olmalıdır.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("a^b: " + result);
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calculateRectangle(int a, int b) {
        System.out.println("Dikdörtgenin Çevresi: " + (2 * (a + b)));
        System.out.println("Dikdörtgenin Alanı: " + (a * b));
        return;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üslü Sayı Hesaplama\n"
                + "6 - Mod Alma\n"
                + "7 - Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0 - Çıkış Yap";

        System.out.println(menu);

        while (true) {
            System.out.print("Bir İşlem Seçiniz: ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("İlk Sayıyı Giriniz: ");
            int a = scan.nextInt();
            System.out.print("İkinci Sayıyı Giriniz: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    System.out.println("Mod İşlemi Sonucu: " + mod(a, b));
                    break;
                case 7:
                    calculateRectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Seçimi Girdiniz.");
            }
        }
        System.out.println("Hesap Makinesi Kapatılıyor...");

    }


}
