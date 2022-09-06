package metotlarUygulamalari;

import java.util.Scanner;

public class asalSayıBulma {

    static void asalSayi(int a){
        int sayac = 0;

        for(int i = 2; i < a; i++)
        {
            if(a % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(a + " sayısı ASALDIR!");
        }
        else {
            System.out.println(a + " sayısı ASAL değildir!.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Bir Sayı Giriniz: ");
            int a = scan.nextInt();
            asalSayi(a);
        }
    }
}
