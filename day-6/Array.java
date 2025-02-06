import java.util.*;

public class Array {

    public static void main(String[] arg) {

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the Size : ");
        // int size = sc.nextInt();
        // String names[] = new String[size];

        // array input of numbers
        // for (int i = 0; i < size; i++) {
        // number[i] = sc.nextInt();
        // }

        // System.out.print("Enter the Names : ");

        // array input of names
        // for (int i = 0; i < size; i++) {
        // names[i] = sc.next();
        // }

        // System.out.print("Given Arrat :");

        // // print the array
        // for (int i = 0; i < size; i++) {
        // System.out.println(names[i]);
        // }

        // find the min max number from the array and print it.
        // int numbers[] = { 5, 4, 3, 2, 1 };

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for (int i = 0; i < numbers.length; i++) {
        // if (max < numbers[i]) {
        // max = numbers[i];
        // }
        // if (min > numbers[i]) {
        // min = numbers[i];
        // }
        // }

        // System.out.println("Largest number is : " + max);
        // System.out.println("Smallest number is : " + min);

        // Take an array of numbers as input and check if it is an array sorted in
        // ascending order.

        System.out.println("Take an array of numbers as input and check if it is an array sorted in  ascending order.");

        // int numbers[] = { 5, 4, 3, 2, 1 };
        int numbers[] = { 1, 2, 3, 4, 5 };

        boolean isAscending = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
        }

        System.out.println("Array is Ascending : " + isAscending);
    }
}
