import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N değerini girin: ");
        int n = inp.nextInt();

        System.out.print("R değerini girin: ");
        int r = inp.nextInt();

        // N'nin faktöriyelini hesaplayın
        int factorialN = 1;
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }

        // R'nin faktöriyelini hesaplayın
        int factorialR = 1;
        for (int i = 1; i <= r; i++) {
            factorialR *= i;
        }

        // (N - R)'nin faktöriyelini hesaplayın
        int factorialNR = 1;
        for (int i = 1; i <= (n - r); i++) {
            factorialNR *= i;
        }

        // Kombinasyonu hesaplayın
        int combination = factorialN / (factorialR * factorialNR);

        System.out.println("Kombinasyon: " + combination);
    }
}
