package dongulerUygulamalari;

import java.util.Scanner;

public class ebobekokWhileDongusu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını Giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını Giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int k = n1;
        int i = 1;

        System.out.println("=======================");


        while (k >= 1) {
            if ((n1 % k == 0) && (n2 % k == 0)) {
                ebob = k;
                System.out.println("EBOB Değeri: " + ebob);
                break;
            }
            k--;
        }


        while (i <= (n1 * n2)) {
            if ((i % n1 == 0) && (i % n2 == 0)) {
                System.out.println("EKOK Değeri: " + i);
                break;
            }
            i++;
        }


        System.out.println("EKOK Kontrol Hesaplaması: " + ((n1 * n2) / ebob));


    }
}
