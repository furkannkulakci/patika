import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int inp = scanner.nextInt();

        if (isPalindrom(inp)) {
            System.out.println(inp + " bir Palindrom Sayıdır.");
        } else {
            System.out.println(inp + " bir Palindrom Sayı değildir.");
        }
    }

    // Sayının Palindrom olup olmadığını kontrol eden metot
    public static boolean isPalindrom(int num) {
        int reverseNum = 0; // reverseNum = ters sayı
        int tempNum = num; // tempNum = geçici sayı

        while (tempNum != 0) {
            int remNum = tempNum % 10;
            reverseNum = reverseNum * 10 + remNum;  // remNum = kalan
            tempNum /= 10;
        }

        return num == reverseNum;
    }
}