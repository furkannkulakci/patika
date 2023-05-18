import java.util.Scanner;

// Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

public class Main {
    public static void main(String[] args) {
        int turkce, mat, fizik, tarih, kimya;
        int dersSayisi = 5;

        Scanner inp = new Scanner(System.in);

        // ders notlarını kullanıcıdan alalım
        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        // girilen ders notları 0-100 aralığında ise ortalamaya dahil etme durumları
        int toplamNot = 0;

        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce; // turkce dersinden alınan not 0-100 aralığında ise toplam nota ekle.
        } else {
            dersSayisi--; // girilen not 0-100 aralığında değil ise ders sayısını azalt ve ortalamaya dahil etme
        }
        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
        } else {
            dersSayisi--;
        }
        if (tarih >= 0 && tarih <= 100) {
            toplamNot += tarih;
        } else {
            dersSayisi--;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
        } else {
            dersSayisi--;
        }
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
        } else {
            dersSayisi--;
        }

        double average = toplamNot / dersSayisi;

        if (average >= 55) {
            System.out.println("Sınıfı geçtiniz ");
        } else {
            System.out.println("Sınıfta kaldınız ");
        }
        System.out.println("Ortalamanız " + average);
    }
}