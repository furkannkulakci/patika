// kullanıcıdan alınan bir dizi elemanı küçükten büyüğe sıralayan program.

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int arrSize = inp.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Dizi elemanlarını giriniz. ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            arr[i] = inp.nextInt();
        }

        Arrays.sort(arr);

        // Sıralama
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali: ");
        for (int eleman : arr) {
            System.out.print(eleman + " ");
        }

        inp.close();
    }
}