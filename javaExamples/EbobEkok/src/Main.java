import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayıyısını girin: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayıyısını girin: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok = (n1 * n2);

        int i = 1;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int j = n1 > n2 ? n1 : n2;
        while (true) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }

        System.out.println("Girilen sayıların EBOB değeri: " + ebob);
        System.out.println("Girilen sayıların EKOK değeri: " + ekok);
    }
}
