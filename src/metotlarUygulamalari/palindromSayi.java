package metotlarUygulamalari;

public class palindromSayi {
    // İki Taraftan da Bakıldığı Zaman Aynı Olan Sayı

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastDigit;

        while (temp != 0) {
            System.out.println("===========================");
            System.out.println("Number ==> " + temp);

            lastDigit = temp % 10;
            System.out.println("Last Digit ==> " + lastDigit);

            reverseNumber = (reverseNumber * 10) + lastDigit;
            System.out.println("New Number ==> " + reverseNumber);

            temp /= 10;
            System.out.println("Temp New Value ==> " + temp);
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(247));

    }
}
