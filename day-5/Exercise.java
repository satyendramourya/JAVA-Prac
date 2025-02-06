import java.util.*;

public class Exercise {

    public static void Average(int a, int b, int c) {
        /*
         * Enter 3 numbers from the user & make a function to print their average.
         * 
         */
        int avg = (a + b + c) / 3;
        System.out.println("avg : " + avg);
    }

    public static void oddSum(int n) {
        /*
         * Write a function to print the sum of all odd numbers from 1 to n.
         * 
         */
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("odd sum : " + sum);
    }

    public static int greaterNumber(int num1, int num2) {
        /*
         * Write a function which takes in 2 numbers and returns the greater of those
         * two.
         * 
         */
        if (num1 == num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // int num3 = sc.nextInt();

        // Average(num1, num2, num3);

        // oddSum(num1);
        System.out.println(greaterNumber(num1, num2));
    }

}
