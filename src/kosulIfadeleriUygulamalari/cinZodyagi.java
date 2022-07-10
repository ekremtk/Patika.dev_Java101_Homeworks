package kosulIfadeleriUygulamalari;

import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        int birthYear, result;
        String zodyak = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        birthYear = input.nextInt();

        result = birthYear % 12;

        switch (result){
            case 0:
                zodyak = "Maymun";
                break;
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Kaplan";
                break;
            case 7:
                zodyak = "Tavşan";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yılan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;
            default:
                System.out.println("Hatalı Bir Giriş Yaptınız.");
                System.out.println("Doğum Yılına Göre Kalan 0-12 Arasında Değildir.");
                break;
        }

        System.out.print("Çin Zodyağı Burcunuz: " + zodyak);
    }
}
