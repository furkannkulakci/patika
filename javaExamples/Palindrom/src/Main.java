import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harf girin: ");
        String word = scanner.next();

        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Sonucu yazdıralım
        if (isPalindrome) {
            System.out.println("Bu kelime bir palindromdur.");
        } else {
            System.out.println("Bu kelime palindrom değildir.");
        }
    }
}
