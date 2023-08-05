public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 30, 130, 110, 50);
        Fighter f2 = new Fighter("Mike Tyson", 30, 125, 115, 40);

        Match match = new Match(f1, f2, 100, 150);
        match.run();
    }
}