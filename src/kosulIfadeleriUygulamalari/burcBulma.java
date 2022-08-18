package kosulIfadeleriUygulamalari;

import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay (0-12): ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün: ");
        day = input.nextInt();


        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
                break;
        }

        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız");
            System.out.println("Tekrar Giriş Yapınız");
        } else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}

