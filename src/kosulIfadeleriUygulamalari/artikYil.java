package kosulIfadeleriUygulamalari;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int year, result, resultnew, result100, result400;

        Scanner input = new Scanner(System.in);

        System.out.print("Artık Yıl Durumunu Kontrol Etmek İçin Yıl Giriniz: ");
        year = input.nextInt();

        result = year % 4;
        result100 = year % 100;
        result400 = year % 400;


        if (result != 0) {
            System.out.println(year + " Bir Artık Yıl Değildir.");
        } else {
            if ((result100 == 0) && (result400 != 0)) {
                System.out.println(year + " Bir Artık Yıl Değildir.");
            } else if ((result100 == 0) && (result400 == 0)) {
                System.out.println(year + " Bir Artık Yıldır.");
            } else {
                System.out.println(year + " Bir Artık Yıldır.");
            }
        }
    }
}
