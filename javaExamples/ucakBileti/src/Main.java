import java.util.Scanner;

/*
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

  Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
  Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
  Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
  Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

  */

public class Main {
    public static void main(String[] args) {
        int distance, age, tripType;

        Scanner inp = new Scanner(System.in);

        // kullanıcı girdisi
        System.out.print("Mesafeyi kilometre cinsinden girin: ");
        distance = inp.nextInt();

        System.out.print("Yaşınızı girin: ");
        age = inp.nextInt();

        System.out.print("Yolculuk türünü girin (Tek Yön için 1, Gidiş Dönüş için 2): ");
        tripType = inp.nextInt();

        // girdiyi doğrulama
        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Yanlış veri girdiniz!");
            return;
        }

        // mesafe başına ücret hesaplama
        double farePerDistance = 0.10;

        // bilet fiyatını hesaplama
        double ticketPrice = distance * farePerDistance;

        // farklı koşullara göre indirim uygulama
        if (age < 12) {
            ticketPrice *= 0.5; // 12 yaş altı için 50% indirim
        } else if (age > 12 && age <= 24) {
            ticketPrice *= 0.9; // 12-24 yaş aralığına 10% indirim
        } else if (age > 65) {
            ticketPrice *= 0.7; // 65 yaş üzerine 30% indirim
        }

        if (tripType == 2) {
            ticketPrice *= 2 * (0.8); // bilet gidiş-dönüş ise 20% indirim
        }

        // uçuşun toplam fiyatı
        System.out.print("Uçuşun toplam fiyatı: " + ticketPrice + " TL");

        inp.close();
    }
}