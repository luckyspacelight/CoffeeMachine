import java.util.Scanner;

class Util {
    public static int[] swapInts(int[] ints) {
        return new int[]{ints[1], ints[0]};
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());

        ints = Util.swapInts(ints);

        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
