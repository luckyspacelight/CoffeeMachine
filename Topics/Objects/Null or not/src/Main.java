import java.util.Objects;
import java.util.Scanner;

class Solution {

    public void printIsNull(Object o) {
        System.out.println(Objects.isNull(o) ? "It's null" : "It's an object");
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Object obj = "null".equals(scanner.nextLine()) ? null : new Object();
            solution.printIsNull(obj);
        }
    }
}
