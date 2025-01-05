import java.util.*;

public class conditionalStatements {
    public static void main(String[] args) {

        {
            // if - else
            /**
             * 1. take the age input;
             * 2. check if the age is greater than 18
             * if yes than print adult
             * if no then print Not adult
             */
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }

    }
}