import java.util.Scanner;

public class Main {
    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calcRectangle(int a, int b) {
        System.out.println("Dikdörtgen Çevresi: " + (2 * (a + b)));
        System.out.println("Diktörtgen Alanı: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi\n"
                + "5. Üslü Sayı Hesaplama\n"
                + "6. Mod Alma\n"
                + "7. Dikdörtgen Alan ve Çevre Hesaplama\n"
                + "0. Çıkış Yap";

        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seç: ");
            select = inp.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk Sayı: ");
            int a = inp.nextInt();
            System.out.print("İkinci Sayı: ");
            int b = inp.nextInt();

            switch (select) {
                case 1:
                    plus(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;

                case 4:
                    divided(a, b);
                    break;

                case 5:
                    System.out.println("Üs Hesabı: " + power(a, b));
                    break;

                case 6:
                    System.out.println("Mod işlemi: " + mod(a, b));
                    break;

                case 7:
                    calcRectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");
            }
        }

        System.out.println("Tekrar görüşmek üzere!");
    }
}