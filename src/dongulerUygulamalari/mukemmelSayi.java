package dongulerUygulamalari;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner keybordinput = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int checkValue = keybordinput.nextInt();

        int bolenSayilar = 0;

        for (int i = 1; i < checkValue; i++){
            if (checkValue % i == 0) {
                bolenSayilar += i;
            }
        }

        if (bolenSayilar == checkValue) {
            System.out.println(checkValue + " Bir Mükemmel Sayıdır.");
        } else {
            System.out.println(checkValue + " Bir Mükemmel Sayı Değildir.");
        }
    }
}
