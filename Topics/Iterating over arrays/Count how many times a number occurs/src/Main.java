import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numArray = new int[scan.nextInt()];

        for (int i = 0; i < numArray.length; i++) {
            if (scan.hasNextInt()) {
                numArray[i] = scan.nextInt();
            }
        }

        int n = scan.nextInt();

        int count = 0;

        for (int num : numArray) {
            if (n == num) {
                count++;
            }
        }

        System.out.println(count);
    }
}