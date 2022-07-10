package kosulIfadeleriUygulamalari;

import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        /*
        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe Gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
        */

        /*
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi
        farklı çözüm yolları bulunuz.
        */

        if (heat > 25) {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        } else if ((heat <= 25) && (heat >= 15)) {
            System.out.println("Pikniğe Gidebilirsiniz.");
        } else if ((heat <= 15) && (heat >= 10)) {
            System.out.println("Sinemaya Gidebilirsiniz.");
            System.out.println("Pikniğe Gidebilirsiniz.");
        } else if ((heat <= 10) && (heat >= 5)) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        }

    }
}
