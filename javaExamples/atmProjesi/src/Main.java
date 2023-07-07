import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 8500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = inp.nextLine();
            System.out.print("Parolanız : ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba. Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1. Bakiye Sorgulama\n" +
                            "2. Para Yatırma\n" +
                            "3. Para Çekme\n" +
                            "4. Çıkış");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para Miktarı : " + balance);
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            int deposit = inp.nextInt();
                            if (deposit > balance) {
                                System.out.println("Bakiye Yetersiz!!");
                            } else {
                                balance += deposit;
                            }
                            break;

                        case 3:
                            System.out.print("Para Çekme : ");
                            int withdraw = inp.nextInt();
                            balance -= withdraw;
                            break;
                        case 4:
                            System.out.println("İyi günler. Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz işlem! Tekrar deneyiniz.");
                            break;
                    }
                    System.out.println();
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre! Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur! Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}

