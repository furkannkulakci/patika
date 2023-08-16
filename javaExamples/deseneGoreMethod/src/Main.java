import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = inp.nextInt();
        recursiveMethod(n);
        inp.close();
    }

    public static void recursiveMethod(int n) {
        if (n <= 0) {
            System.out.println("Son Değer: " + n);
            return;
        }

        System.out.println("Çıkarma: " + n);
        recursiveMethod(n - 5);
        System.out.println("Ekleme: " + n);
    }
}
