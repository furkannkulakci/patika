import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // gerekli değişkenler
        int mat, fiz, kim, tur, tar, muz;
        double ort;

        // Scanner sınıfı oluşturalım
        Scanner inp = new Scanner(System.in);

        System.out.println(" ***** Not Ortalaması Hesaplayacı *****");

        // kullanıcıdan veri alma işlemi
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tar = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = inp.nextInt();

        // ortalamayı hesaplayalım
        ort = (mat + fiz + kim + tur + tar + muz) / 6.0;
        System.out.println("Ortalamanız: " + ort);

        boolean durum = (ort >= 60);

        String sonuc = durum ? "Sınıfı Geçtiniz " : "Sınıfta Kaldınız ";
        System.out.print(sonuc);

    }
}