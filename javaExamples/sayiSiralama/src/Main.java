import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner inp = new Scanner(System.in);

        System.out.println(" **** Küçükten Büyüğe Sıralama ****");

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        n3 = inp.nextInt();

        if ((n1 < n2) && (n1 < n3)) {
            if (n2 < n3) {
                System.out.println("Sayıların küçükten büyüğe sıralaması:\n n1 < n2 < n3");
            } else {
                System.out.println("Sayıların küçükten büyüğe sıralaması:\n n1 < n3 < n2");
            }
        } else if ((n2 < n1) && (n2 < n3)) {
            if (n1 < n3) {
                System.out.println("Sayıların küçükten büyüğe sıralaması:\n n2 < n1 < n3");
            } else {
                System.out.println("Sayıların küçükten büyüğe sıralaması:\n n2 < n3 < n1");
            }
        } else {
            if (n1 < n2) {
                System.out.println("Sayıların küçükten büyüğe sıralaması:\n n3 < n1 < n2");
            } else {
                System.out.println("Sayıların küçükten büyüğe sıralaması:\n n3 < n2 < n1");
            }
        }
    }
}