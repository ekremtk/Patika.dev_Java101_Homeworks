import java.util.Scanner;

public class notOrtalamasiProgrami {

    public static void main(String[] args) {
        // Değişkenleri Oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner Sınıfını tamamladık
        Scanner notdegeri = new Scanner(System.in);

        // Kullanıcadan  Derslerin Not Değerlerini Al
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = notdegeri.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = notdegeri.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = notdegeri.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = notdegeri.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = notdegeri.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = notdegeri.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        double sonuc2 = toplam / 6;
        System.out.println("Not Ortalamanız: " + sonuc);
        System.out.println("Not Ortalamanız: " + sonuc2);

        // 60'dan büyükse geçti küçükse kaldı ekleyiniz
        // if-else kullanmayınız
        int sinir = 60;
        boolean karsilastirma = (sonuc > sinir) || (sonuc == sinir);
        String gectikaldi = (karsilastirma) ? "Gecti" : "Kaldi";

        System.out.println("Bu Dönem Sonucunuz: " + gectikaldi);

        /* Ne Yaptık Açıklayınız:
        * Öncelikle Sınır değeri belirledim. Bu da 60
        * Sonrasında Boolean ile Mantıksal True veya False elde ettim.
        * Bunu yapmak için ise elde ettiğim sonuç değerini sınır değeri ile karşılaştırdım.
        * ifade = (ifade2) ? sonuc1 : sonuc2 şeklindeki yazım biçimi ile
        * Karşılaştırma sonucu True ise Gecti False ise Kaldı sonucunu string ifadesine aktardım
        * En sonunda ekrana yazdırdım.
         */
    }
}
