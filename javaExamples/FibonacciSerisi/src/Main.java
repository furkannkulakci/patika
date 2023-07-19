import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisi için sınır sayısını girin: ");
        int limit = inp.nextInt();

        System.out.println("Fibonacci serisi:");
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 3; i <= limit; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");

            num1 = num2;
            num2 = nextNum;
        }

        inp.close();
    }
}