import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {21, 24, -2, 3, 27, 3, 5, 78, -41};
        Scanner inp = new Scanner(System.in);

        System.out.println("Dizi : " + Arrays.toString(list));

        System.out.print("Sayı girin : ");
        int number = inp.nextInt();
        int min = number;
        int max = number;

        // girilen sayıya yakın en büyük sayı
        Arrays.sort(list);
        System.out.println("Sıralı: " + Arrays.toString(list));
        // En yakın büyük sayıyı bulma
        for (int item : list) {
            if (item > number) {
                max = item;
                break;
            }
        }
        // girilen sayıya yakın en küçük sayı
        for (int i = list.length - 1; i >= 0; --i) {
            if (list[i] < number) {
                min = list[i];
                break;
            }
        }

        System.out.println("En yakın büyük : " + max);
        System.out.println("En yakın küçük : " + min);
    }
}