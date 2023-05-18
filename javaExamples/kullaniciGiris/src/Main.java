import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;

        Scanner inp = new Scanner(System.in);

        // kullanıcı adı ve şifre bilgilerini alıyoruz
        System.out.print("Kullanıcı Adı: ");
        userName = inp.nextLine();
        System.out.print("Şifre: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı ✅");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı ❗");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? (e/h)");
            String select = inp.nextLine();

            if (select.equals("e")) {
                System.out.print("Yeni şifre: ");
                String newPassword = inp.nextLine();

                if (newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Şifre oluştutulamadı ❌ Yeni şifre önceki şifrelerinizden farklı olmalıdır!");
                } else {
                    System.out.println("Yeni şifre oluşturuldu ✅");
                }
            } else {
                System.out.println("Giriş başarısız. Kullanıcı adı veya şifre yanlış");
            }
        }
    }
}