import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("0")) {
            System.out.println(scanner.nextInt() % 2 == 0 ? "even" : "odd");
        }
    }
}