package dongulerUygulamalari;

import java.util.Scanner;

public class dortvebeskuvvetleri {

    // Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.

    public static void main(String[] args) {
        int lastValue, i = 1, power4 = 1, power5 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz: ");
        lastValue = input.nextInt();

        while ((power4 <= lastValue) && (power5 <= lastValue)) {
            System.out.println(i + ".Hesaplama");
            System.out.println("4'ün Kuvveti: " + (power4));
            System.out.println("5'in Kuvveti: " + (power5));
            power4 *= 4;
            power5 *= 5;
            i++;
            System.out.println("---------------------------");
        }

    }
}
