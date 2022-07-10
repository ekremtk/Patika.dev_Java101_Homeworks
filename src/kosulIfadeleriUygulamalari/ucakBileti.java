package kosulIfadeleriUygulamalari;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.

        İlk olarak uçuşun toplam fiyatını hesaplayın ve
        sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        int age, tripType;
        double distance, price;
        String info = "", infoage = "", yas = "Yaş Bilgisine Göre Uygulanan İndirim: ";

        Scanner input = new Scanner(System.in);

        // Get Distance
        System.out.print("Yolculuk Mesafenizi Giriniz: ");
        distance = input.nextInt();
        if (distance <= 0){
            System.out.println("Hatalı Veri Girdiniz !");
            System.out.println("Yolculuk Mesafesi 0 veya 0'dan küçük olamaz");
            System.out.println("Programı Tekrar Çalıştırınız");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }


        // Get Trip Type
        System.out.println("Yolculuk Türünüzü Giriniz");
        System.out.print("\tTek Yön için 1 - Gidiş-Dönüş için 2 Yazınız: ");
        tripType = input.nextInt();
        if ((tripType != 1) && (tripType != 2)){
            System.out.println("Hatalı Veri Girdiniz !");
            System.out.println("Yolculuk Türünü Hatalı Belirttiniz");
            System.out.println("Programı Tekrar Çalıştırınız");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        // Get Passenger Age
        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();
        if (age <= 0){
            System.out.println("Hatalı Veri Girdiniz !");
            System.out.println("Yaş Bilgisi 0 veya 0'dan küçük olamaz");
            System.out.println("Programı Tekrar Çalıştırınız");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        System.out.println("*****************************");

        price = 0.10 * distance;

        if (tripType == 1) {
            System.out.println("Biletinizin İndirimsiz Ücreti: " + price);
            info = "Tek Yönlü Yolculuklarda \"Yolculuk Tipi\" İndirimi Yoktur.";
            if (age < 12) {
                price = price - (price * 0.5);
                infoage = yas + "%50";
            } else if ((age >= 12) && (age <= 24)) {
                price = price - (price * 0.1);
                infoage = yas + "%10";
            } else if (age > 65) {
                price = price - (price * 0.3);
                infoage = yas + "%30";
            } else {
                infoage = "Yaştan Dolayı Herhangi Bir İndiriminiz Olmamıştır.";
            }
        } else {
            System.out.println("Biletinizin İndirimsiz Ücreti: " + 2*price);
            info = "Çift Yönlü Yolculuklarda \"Yolculuk Tipi\" İndirimi %20'dir.";
            if (age < 12) {
                price = price - (price * 0.5);
                infoage = yas + "%50";
            } else if ((age >= 12) && (age <= 24)) {
                price = price - (price * 0.1);
                infoage = yas + "%10";
            } else if (age > 65) {
                price = price - (price * 0.3);
                infoage = yas + "%30";
            } else {
                infoage = "Yaştan Dolayı Herhangi Bir İndiriminiz Olmamıştır.";
            }
            price = price - (price * 0.2);
            price = 2 * price;
        }


        System.out.println("Biletiniz Üzerindeki İndirim Bilgileri: (varsa)");
        System.out.println("\t" + info + "\n" + "\t" + infoage);
        System.out.println("Toplam Tutar: " + price);


    }
}
