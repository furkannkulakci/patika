import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = inp.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("3 ve 4 ile bölünebilen sayıların ortalaması: " + average);
    }
}
