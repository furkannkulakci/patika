import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin sayı adedini girin: ");
        int n = inp.nextInt();

        float[] arr = new float[n];

        System.out.println("Dizideki sayıları girin: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextFloat();
        }

        float harmonicMean = 0;
        for (int i = 0; i < n; i++) {
            harmonicMean += 1.0 / arr[i];
        }
        harmonicMean /= n;
        System.out.println("Dizideki sayıların harmonik ortalaması: " + harmonicMean);
    }
}