import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arMatrix = new int[n][n];

        for (int i = 0; i < arMatrix.length; i++) {
            for (int j = 0; j < arMatrix[i].length; j++) {
                System.out.printf("%d ", Math.abs(j - i));
            }
            System.out.printf("%n");
        }
    }
}