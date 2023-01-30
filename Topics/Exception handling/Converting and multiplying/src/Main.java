import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strOutput = "";
        final int multiplier = 10;
        while (!scanner.hasNext("0")) {
            String strInput = scanner.next();
            if (strInput.matches("\\d+")) {
                strOutput += String.format("%d%n", Integer.parseInt(strInput) * multiplier);
            } else {
                strOutput += String.format("Invalid user input: %s%n", strInput);
            }
        }
        System.out.print(strOutput);
    }
}