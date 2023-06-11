import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int satir = inp.nextInt();

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < satir - i - 1; j++) {
                System.out.print(" ");
                // bu döngüde satır numarasının satır sayısından çıkarılmasıyla boşluk sayısını bulduk
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
                // bu döngüde ise yıldız sayısını geçerli satır numarasını 2 ile çarparak bulduk
            }
            System.out.println();
        }
        /*
          Elmasın alt ve üst tarafı aynı şekilde yazdırılır.
          Tek fark satırların orta satırın iki satır altındaki satırdan başlayarak ters sırada yazdırılmasıdır.
         */

        for (int i = satir - 2; i >= 0; i--) {
            for (int j = 0; j < satir - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}