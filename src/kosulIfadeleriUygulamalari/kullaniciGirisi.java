package kosulIfadeleriUygulamalari;

import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, select, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
        }

        System.out.println("---------------------------------------");

        /*
        Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        // Şifrenin yanlış girildiğini kontrol et
        if (!password.equals("java123")) {
            System.out.println("Şifrenizi Yanlış Girdiniz ");
            System.out.println("Sıfırlamak ister misiniz?");
            System.out.print("\tevet veya hayır şeklinde belirtebilirsiniz: ");


            select = inp.nextLine();

            switch (select) {
                case "evet":
                    System.out.println("******************************************");
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    newPassword = inp.nextLine();
                    if (newPassword.equals("java123") || newPassword.equals(password)) {
                        System.out.println("Daha Önce Girdiğiniz Şifre'nin Aynısını Girdiniz !");
                        System.out.print("Şifre Oluşturulamadı");
                    } else {
                        System.out.print("Yeni Şifreniz Oluşturuldu !");
                    }
                    break;
                case "hayır":
                    System.out.println("******************************************");
                    System.out.println("Yeni Şifre Belirlemek İstemediniz");
                    System.out.print("Doğru Şifre Girişi Olmadan\n\tSisteme Giriş Yapmanız Mümkün Değildir");
                    break;
                default:
                    System.out.println("******************************************");
                    System.out.print("Yanlış Bir İşlem Belirttiniz");
                    break;
            }


        }
    }
}
