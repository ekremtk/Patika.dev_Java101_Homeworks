import java.util.Scanner;

public class taksimetreHesaplama {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        * Taksimetre KM başına 2.20 TL tutmaktadır.
        * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        * Taksimetre açılış ücreti 10 TL'dir.
        */
        double mesafe, tutar;
        int min = 20, acilis = 10;

        // Scanner Sınıfını tamamladık
        Scanner girdi = new Scanner(System.in);

        System.out.print("Gideceğiniz Mesafeyi KM cinsinden yazınız: ");
        mesafe = girdi.nextDouble();

        tutar = 10 + (mesafe * 2.20);

        boolean karsilastirma = (tutar > 20) || (tutar == 20);
        String yolculukturu = (karsilastirma) ? "Normal" : "Kısa Mesafe";
        double odeme = (karsilastirma) ? tutar : 20;

        System.out.println("Girilen Bilgilere Göre");
        System.out.println("Yolculuk Türünüz: " + yolculukturu);
        System.out.println("Ödemeniz Gereken Tutar: " + odeme);
    }
}
