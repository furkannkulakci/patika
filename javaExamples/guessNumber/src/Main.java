import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kullanıcıdan girdi almak için 'inp' adında bir nesne oluşturalım.
        Scanner inp = new Scanner(System.in);

        // 0 ve 100 arasında rastgele tam sayı üretelim.
        int randomNumber = (int) (Math.random() * 100);

        // kullanıcıdan tahminlerini alalım.
        System.out.println("0 ile 100 arasında bir sayı tahmin edin: ");
        int guess = inp.nextInt();

        // kullanıcı sayıyı bilene kadar döngü sürecek.
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Tahmininiz çok yüksek. ");
            } else {
                System.out.println("Tahmininiz çok düşük. ");
            }

            // Kullanıcıdan yeni tahmin için sayı alıyoruz
            System.out.println("Tekrar tahmin et: ");
            guess = inp.nextInt();
        }

        // Kullanıcı tahmini doğruysa tebrik mesajı gösterilir
        if (guess == randomNumber) {
            System.out.println("Tebrikler! Doğru sayıyı tahmin ettiniz. ");
        }
    }
}
