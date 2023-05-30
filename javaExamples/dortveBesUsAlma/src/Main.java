import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        int n = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        int power4 = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(power4);
            power4 *= 4;
        }

        System.out.println("5'in kuvvetleri:");
        int power5 = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(power5);
            power5 *= 5;
        }
    }
}
