import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdv, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = inp.nextDouble();

        // tutar 0'dan büyük ve 1000 arasında ise kdv oranı 0.18, 1000 tlden fazla ise kdv oranı 0.8 olsun
        kdv = tutar > 0 && tutar <= 1000 ? 0.18 : 0.08;
        kdvTutar = tutar * kdv;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdv);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}