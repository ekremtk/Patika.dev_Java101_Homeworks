package dongulerUygulamalari;

import java.util.Scanner;

public class ebobekokBulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını Giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını Giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        /*
        // EBOB Çalışması

        for (int i = 1; i <= n1; i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
            }
        }

        */
        System.out.println("=======================");

        for (int k = n1; k >= 1; k--) {
            if ((n1 % k == 0) && (n2 % k == 0)) {
                ebob = k;
                System.out.println("EBOB Değeri: " + ebob);
                break;
            }
        }



        for (int i = 1; i <= (n1 * n2); i++) {
            if ((i % n1 == 0) && (i % n2 == 0)) {
                System.out.println("EKOK Değeri: " + i);
                break;
            }
        }

        System.out.println("EKOK Kontrol Hesaplaması: " + ((n1 * n2) / ebob));


    }
}
