
import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        /*
         * 1. print the pattern : filled box
         * 
         */

        // for (int i = 0; i < num; i++) {
        // for (int j = 0; j < num; j++) {
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        /*
         * 2. print the pattern : box boreder
         * 
         */

        // for (int i = 0; i < num; i++) {
        // for (int j = 0; j < num; j++) {
        // if (j == 0 || j == num - 1 || i == 0 || i == num - 1) {
        // System.out.print("_*_");
        // } else {
        // System.out.print("___");
        // }
        // }
        // System.out.print("\n");
        // }

        /*
         * 3. print the pattern : Half pyramid
         * 
         */

        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        /*
         * 4. print the pattern : reverse pyramid
         * 
         */

        // for (int i = num; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        /*
         * 5. print the pattern : Half pyramid - rotate 180 deg
         * 
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");

            }
            System.out.print("\n");
        }
    }
}
