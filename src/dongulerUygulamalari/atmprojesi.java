package dongulerUygulamalari;

import java.util.Scanner;

public class atmprojesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int inputright = 3;
        int balance = 1500;
        int select;

        while (inputright > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğniz İşlemi Seçiniz: ");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.print("Para Miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para Miktarı: ");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye Yetersiz");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            } else {
                inputright--;
                System.out.println("Hatalı Kullanıcı adı veya Şifre. Tekrar Deneyiniz.");
                if (inputright == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur. Lütfen Banka İle İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " + inputright);
                }
            }
        }


    }
}
