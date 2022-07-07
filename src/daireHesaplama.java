import java.util.Scanner;

public class daireHesaplama {
    public static void main(String[] args) {
        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan
        // daire diliminin alanı bulan programı yazınız.

        double pi = 3.14, cevre, alan;
        int yaricap;


        // Scanner Sınıfını tamamladık
        Scanner girdi = new Scanner(System.in);

        System.out.print("Yarıçap uzunluğunu: ");
        yaricap = girdi.nextInt();

        alan = pi * (Math.pow(yaricap, 2));
        cevre = 2 * pi * yaricap;

        System.out.println("Girilen Bilgilere Göre");
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin Alanı: " + alan);
    }
}
