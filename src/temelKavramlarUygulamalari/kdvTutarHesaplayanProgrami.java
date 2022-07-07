package temelKavramlarUygulamalari;

import java.util.Scanner;

public class kdvTutarHesaplayanProgrami {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın
        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;

        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */

        Scanner girdi = new Scanner(System.in);

        System.out.print("Ürünün KDV'siz Tutarını Giriniz: ");
        double urun = girdi.nextDouble();

        int sinir = 1000;
        boolean karsilastirma = (urun > sinir) || (urun == sinir);
        double yuzde = (karsilastirma) ? 0.18 : 0.08;
        String kdvorani = (karsilastirma) ? "%18" : "%8";


        double kdvdeger = (urun * yuzde);

        System.out.println("Ürün Fiyatına Göre Uygulanan KDV Oranı: " + kdvorani);
        System.out.println("Ürüne uygulanacak KDV Tutarı: " + kdvdeger);
        System.out.println("Ürünün KDV Dahil Fiyatı: " + (urun + kdvdeger));


    }
}
