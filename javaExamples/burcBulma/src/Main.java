import java.util.Scanner;

    /*  Koç Burcu : 21 Mart - 20 Nisan .
        Boğa Burcu : 21 Nisan - 21 Mayıs .
        İkizler Burcu : 22 Mayıs - 22 Haziran .
        Yengeç Burcu : 23 Haziran - 22 Temmuz .
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak .
        Kova Burcu : 22 Ocak - 19 Şubat .
        Balık Burcu : 20 Şubat - 20 Mart .
*/

public class Main {
    public static void main(String[] args) {

        int month, day;

        Scanner inp = new Scanner(System.in);

        System.out.println(" **** Burcunu Öğrenmek İster Misin? ****");
        System.out.print("Doğdunuz ay (1 -12): ");
        month = inp.nextInt();

        System.out.print("Doğdunuz gün (1 - 31): ");
        day = inp.nextInt();

        String zodiac = "";

        if (month == 12 && day >= 22 || month == 1 && day <= 21) {
            zodiac = "Oğlak ♑";
        } else if (month == 1 && day >= 22 || month == 2 && day <= 19) {
            zodiac = "Kova ♒";
        } else if (month == 2 && day >= 20 || month == 3 && day <= 20) {
            zodiac = "Balık ♓";
        } else if (month == 3 && day >= 21 || month == 4 && day <= 20) {
            zodiac = "Koç ♈";
        } else if (month == 4 && day >= 21 || month == 5 && day <= 21) {
            zodiac = "Boğa ♉";
        } else if (month == 5 && day >= 22 || month == 6 && day <= 22) {
            zodiac = "İkizler ♊";
        } else if (month == 6 && day >= 23 || month == 7 && day <= 22) {
            zodiac = "Yengeç ♋";
        } else if (month == 7 && day >= 23 || month == 8 && day <= 22) {
            zodiac = "Aslan ♌";
        } else if (month == 8 && day >= 23 || month == 9 && day <= 22) {
            zodiac = "Başak ♍";
        } else if (month == 9 && day >= 23 || month == 10 && day <= 22) {
            zodiac = "Terazi ♎";
        } else if (month == 10 && day >= 23 || month == 11 && day <= 21) {
            zodiac = "Akrep ♏";
        } else if (month == 10 && day >= 22 || month == 11 && day <= 21) {
            zodiac = "Yay ♐";
        } else {
            zodiac = "Geçersiz giriş yaptınız!";

        }
        System.out.println("Burcunuz: " + zodiac);
    }
}