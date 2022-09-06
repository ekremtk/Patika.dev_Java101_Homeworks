package metotlarUygulamalari;

import java.util.Scanner;

public class recursiveUsluSayiHesaplama {

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("Taban Değerini Giriniz: ");
            int a = scan.nextInt();
            System.out.print("Üs Değerini Giriniz: ");
            int b = scan.nextInt();

            System.out.println("Sonuç: " + power(a, b));

        }
    }

}
