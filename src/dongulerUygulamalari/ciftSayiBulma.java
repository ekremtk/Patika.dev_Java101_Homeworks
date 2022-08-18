package dongulerUygulamalari;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ciftSayiBulma {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // While İle Yapımı
        System.out.println("---------------------------------------");
        System.out.println("While Kullanarak Aynı İşlemin Yapılması");
        int sayac = 1;

        while (sayac <= k){
            if (sayac %2 == 0){
                System.out.println(sayac);
            }
            sayac++;
        }

    }
}
