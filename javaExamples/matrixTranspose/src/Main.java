import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int rows = inp.nextInt();

        System.out.print("Sütun sayısını girin: ");
        int cols = inp.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Matris elemanlarını girin: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = inp.nextInt();
            }
        }

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris transpozu: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
