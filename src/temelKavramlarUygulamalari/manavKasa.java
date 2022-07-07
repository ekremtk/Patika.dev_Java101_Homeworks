package temelKavramlarUygulamalari;

import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        // Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        // toplam tutarını ekrana yazdıran programı yazın.

        double armutfiyat = 2.14, elmafiyat = 3.67, domatesfiyat = 1.11, muzfiyat = 0.95, patlicanfiyat = 5.00;
        double armutkilo, elmakilo, domateskilo, muzkilo, patlicankilo;
        double armuttutar, elmatutar, domatestutar, muztutar, patlicantutar, toplamtutar;

        // Scanner Sınıfını tamamladık
        Scanner girdi = new Scanner(System.in);

        System.out.print("Kaç kilo \"Armut\" Aldınız?: ");
        armutkilo = girdi.nextDouble();

        System.out.print("Kaç kilo \"Elma\" Aldınız?: ");
        elmakilo = girdi.nextDouble();

        System.out.print("Kaç kilo \"Domates\" Aldınız?: ");
        domateskilo = girdi.nextDouble();

        System.out.print("Kaç kilo \"Muz\" Aldınız?: ");
        muzkilo = girdi.nextDouble();

        System.out.print("Kaç kilo \"Patlıcan\" Aldınız?: ");
        patlicankilo = girdi.nextDouble();

        armuttutar = armutfiyat * armutkilo;
        elmatutar = elmafiyat * elmakilo;
        domatestutar = domatesfiyat * domateskilo;
        muztutar = muzfiyat * muzkilo;
        patlicantutar = patlicanfiyat * patlicankilo;
        toplamtutar = armuttutar + elmatutar + domatestutar + muztutar + patlicantutar;

        System.out.println("***************Ödemeler****************");
        System.out.println("\"Armut\" için ödenecek tutar: " + armuttutar);
        System.out.println("\"Elma\" için ödenecek tutar: " + elmatutar);
        System.out.println("\"Domates\" için ödenecek tutar: " + domatestutar);
        System.out.println("\"Muz\" için ödenecek tutar: " + muztutar);
        System.out.println("\"Patlıcan\" için ödenecek tutar: " + patlicantutar);
        System.out.println("Toplam Ödenecek Tutar: " + toplamtutar);
    }
}
