import java.util.Scanner;

/* Sıcaklık derecelerine göre etkinlik öneren uygulama
 * Sıcaklık;
 * <5 ise kayak
 * 5-15 aralığında ise sinema
 * 10-25 aralığında ise piknik
 * >25 ise yüzme
 */

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz: ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Hava soğuk, Kayak yapabilirsin ⛷️");
        } else if (heat <= 25) {
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsin 🧺");
            }
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsin 📽️");
            }
        } else {
            System.out.println("Hava sıcak, Yüzmeye gidebilirsin 🏊🏻");
        }
    }
}

