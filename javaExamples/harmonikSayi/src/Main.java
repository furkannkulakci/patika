import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = inp.nextInt();

        // kesirli bir işlem olduğu için bir taraf double olmalı.
        // kesrin payı değişmiyor. sadece payda değişeceği için ona da n veriyoruz.
        // döngünün başı ve sonunu bildiğimiz için for döngüsü kullanacağız.

        double result = 0;
        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }

        System.out.println(result);
    }
}