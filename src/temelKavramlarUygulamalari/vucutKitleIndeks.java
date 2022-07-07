package temelKavramlarUygulamalari;

import java.util.Scanner;

public class vucutKitleIndeks {
    public static void main(String[] args) {
        // Vücut Kitle İndeksi Hesaplama
        // Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        // Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        double kilo, boy, vki;

        // Scanner Sınıfını tamamladık
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = girdi.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = girdi.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
