package dongulerUygulamalari;

import java.util.Scanner;

public class maxminDegerBulma {
    public static void main(String[] args) {
        Scanner tarama = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz? : ");
        int sayiAdedi = tarama.nextInt();
        int sayac = 1;
        int maxValue = 0;
        int minValue = 0;


        while (sayiAdedi > 0){
            System.out.print(sayac + ". Sayıyı Giriniz: ");
            int enteredNumber = tarama.nextInt();

            if (enteredNumber > maxValue){
                maxValue = enteredNumber;
            }
            if (enteredNumber < minValue){
                minValue = enteredNumber;
            }
            sayiAdedi--;
            sayac++;
        }

        System.out.println("En Büyük Sayı: " + maxValue);
        System.out.println("En Küçük Sayı: " + minValue);
    }
}
