import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int lenStr = str.length();
        int endIndex = lenStr % 2 == 0 ? lenStr / 2 - 1 : lenStr / 2;
        System.out.print(str.substring(0, endIndex) + str.substring(lenStr / 2 + 1));
    }
}