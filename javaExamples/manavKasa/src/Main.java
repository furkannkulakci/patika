import java.util.Scanner;

/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin
kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

 meyveler ve kg fiyatları

    armut : 2,14 TL
    elma : 3,67 TL
    domates : 1,11 TL
    muz: 0,95 TL
    patlıcan : 5,00 TL

*/

public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlican = 5.00;
        double toplam, elmaKg, armutKg, domatesKg, muzKg, patlicanKg;

        System.out.print("Kaç kilo armut aldınız : ");
        armutKg = inp.nextDouble();

        System.out.print("Kaç kilo elma aldınız : ");
        elmaKg = inp.nextDouble();

        System.out.print("Kaç kilo domates aldınız : ");
        domatesKg = inp.nextDouble();

        System.out.print("Kaç kilo muz aldınız : ");
        muzKg = inp.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız : ");
        patlicanKg = inp.nextDouble();

        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}