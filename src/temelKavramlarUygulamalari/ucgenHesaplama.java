package temelKavramlarUygulamalari;

import java.util.Scanner;

public class ucgenHesaplama {
    public static void main(String[] args) {
        // Üç kenar uzunluğunu kullanıcıdan aldığınız
        // üçgenin alanını hesaplayan programı yazınız.

        double kenar1, kenar2, hipotenus, alan, cevre;

        // Scanner Sınıfını tamamladık
        Scanner girdi = new Scanner(System.in);

        // Kullanıcadan  Kenarların Değerlerini Al
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        kenar1 = girdi.nextInt();

        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        kenar2 = girdi.nextInt();

        // Hipotenus
        hipotenus = Math.sqrt((Math.pow(kenar1, 2)) + (Math.pow(kenar2, 2)));

        // Çevre ve Alan Hesaplamaları
        cevre = kenar1 + kenar2 + hipotenus;

        alan = (kenar1 * kenar2) / 2;

        System.out.println("Girilen Değerlere Göre Dik Üçgenin Değerleri");
        System.out.println("Hipotenüs Uzunluğu: " + hipotenus);
        System.out.println("Çevresi: " + cevre);
        System.out.println("Alanı: " + alan);
    }
}
