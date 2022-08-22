package dongulerUygulamalari;

public class asalSayi {
    public static void main(String[] args) {



        for (int sayi = 2; sayi <= 100; sayi++) {
            int checker = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0){
                    checker = 1;
                    break;
                }
            }

            if (checker == 0){
                System.out.print(sayi + " ");
            }
        }
    }
}
