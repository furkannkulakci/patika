import java.util.Scanner;

/*
 ** Çin Zodyağı **
Doğum yılının 12 ye bölümünden kalan ile bulunur.
   0 ➜ Maymun
   1 ➜ Horoz
   2 ➜ Köpek
   3 ➜ Domuz
   4 ➜ Fare
   5 ➜ Öküz
   6 ➜ Kaplan
   7 ➜ Tavşan
   8 ➜ Ejderha
   9 ➜ Yılan
   10 ➜ At
   11 ➜ Koyun
 */
public class Main {
    public static void main(String[] args) {
        int year, zodiacIndex;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin: ");
        year = inp.nextInt();

        zodiacIndex = year % 12;
        String zodiac = "";

        switch (zodiacIndex) {
            case 0:
                zodiac = "Maymun 🐒";
                break;
            case 1:
                zodiac = "Horoz 🐓";
                break;
            case 2:
                zodiac = "Köpek 🐕";
                break;
            case 3:
                zodiac = "Domuz 🐖";
                break;
            case 4:
                zodiac = "Fare 🐁";
                break;
            case 5:
                zodiac = "Öküz 🐂";
                break;
            case 6:
                zodiac = "Kaplan 🐅";
                break;
            case 7:
                zodiac = "Tavşan 🐇";
                break;
            case 8:
                zodiac = "Ejderha 🐉";
                break;
            case 9:
                zodiac = "Yılan 🐍";
                break;
            case 10:
                zodiac = "At 🐎";
                break;
            case 11:
                zodiac = "Koyun 🐑";
                break;
        }
        System.out.println("Çin zodyağı burcunuz: " + zodiac);

        inp.close();
    }
}