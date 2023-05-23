import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4 ün katı çift sayıların toplamını bulan uygulama
        Scanner inp = new Scanner(System.in);

        int sum = 0;
        boolean finishLoop = false;

        while (!finishLoop) {
            System.out.print("Bir sayı girin (bitirmek için -1 girin): ");
            int number = inp.nextInt();

            if (number == -1) {
                finishLoop = true;
            } else if (number % 4 == 0 && number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("Dördün katı olan çift sayıların toplamı: " + sum);


    }
}