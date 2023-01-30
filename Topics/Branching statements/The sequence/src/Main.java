import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 1; i > 0 && count < n; i++) {
            for (int j = 1; j <= i  && count < n; j++, count++) {
                System.out.printf("%d ", i);
            }
        }
    }
}
