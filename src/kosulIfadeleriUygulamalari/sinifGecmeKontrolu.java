package kosulIfadeleriUygulamalari;

import java.util.Scanner;

public class sinifGecmeKontrolu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, sayac = 0, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        /*

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;

        System.out.println("Ortalamanız: " + avarage);

        if (avarage <= 55) {
            System.out.println("Sınıfta Kaldınız");
            System.out.println("Seneye Görüşme Üzere");
        } else {
            System.out.println("Tebrikler, Sınıfı Geçtiniz");
        }

        */

        /*
        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        */

        if ((mat == 0) || (mat == 100)) {
            sayac = sayac;
        } else {
            sayac += 1;
            toplam += mat;
        }

        if ((turkce == 0) || (turkce == 100)) {
            sayac = sayac;
        } else {
            sayac += 1;
            toplam += turkce;
        }

        if ((fizik == 0) || (fizik == 100)) {
            sayac = sayac;
        } else {
            sayac += 1;
            toplam += fizik;
        }

        if ((kimya == 0) || (kimya == 100)) {
            sayac = sayac;
        } else {
            sayac += 1;
            toplam += kimya;
        }

        if ((muzik == 0) || (muzik == 100)) {
            sayac = sayac;
        } else {
            sayac += 1;
            toplam += muzik;
        }

        if (toplam == 0) {
            System.out.println("Bütün Notlarınız 0 olduğundan dolayı ortalamanız hesaplanamadı");
        } else {
            double avarage = toplam / sayac;
            System.out.println("Ortalamanız: " + avarage);
            if (avarage <= 55) {
                System.out.println("Sınıfta Kaldınız");
                System.out.println("Seneye Görüşme Üzere");
            } else {
                System.out.println("Tebrikler, Sınıfı Geçtiniz");
            }
        }
    }
}
