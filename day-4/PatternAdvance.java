
public class PatternAdvance {

    public static void main(String[] args) {
        /*
         * 1. butterfly pattern
         */

        // int num = 4;
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // int spaces = (num - i) * 2;
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println("\n");
        // }
        // for (int i = num; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // int spaces = (num - i) * 2;
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println("\n");
        // }

        /*
         * 2. Solid Rhombus
         */

        int stars = 5;
        for (int i = 1; i <= stars; i++) {
            for (int j = stars - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}
