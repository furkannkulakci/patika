import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenler
        double kenar1, kenar2, kenar3, yariCap, alan;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu girin: ");
        kenar1 = inp.nextDouble();

        System.out.print("İkinci kenar uzunluğunu girin: ");
        kenar2 = inp.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu girin: ");
        kenar3 = inp.nextDouble();

        // Üçgenin alanını hesaplamak için Heron formülü kullanılır
        yariCap = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(yariCap * (yariCap - kenar1) * (yariCap - kenar2) * (yariCap - kenar3));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
