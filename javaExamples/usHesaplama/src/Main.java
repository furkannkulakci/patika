import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı girin: ");
        int n = inp.nextInt();

        System.out.print("Üs olacak sayıyı girin: ");
        int k = inp.nextInt();

        int total = 1;

        int i = 1;

        for(i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(n + " üssü " + k + " = " + total);
    }
}