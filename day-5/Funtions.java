import java.util.*;

public class Funtions {

    public static void printTheName(String name) {
        System.out.println(name);
        return;
    }

    public static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    // find the factorial.
    /*
     * factorail of 5
     * 5 * 5-1
     * 4 * 4-1
     * 3 * 3-1
     * 2 * 2-1
     * 1 --> return 1
     */
    // public static int factorial(int n) {
    // if (n == 2) {
    // return 2;
    // }
    // int factorailValue = n * factorial(n - 1);

    // return factorailValue;

    // }

    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        int factorailValue = 1;
        for (int i = n; i > 1; i--) {
            factorailValue *= i;
        }
        return factorailValue;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // printTheName(name);

        int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // int sum = addTwoNumbers(num1, num2);2
        // int multiply = multiplyTwoNumbers(num1, num2);

        System.out.println("factorial : " + factorial(num1));
    }
}