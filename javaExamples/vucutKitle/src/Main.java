import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenlerimizi yazalım
        double weight, height;

        // kullanıcıdan girdi almak için
        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        height = inp.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        weight = inp.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("Vücut Kitle İndeksi : " + BMI);
    }
}