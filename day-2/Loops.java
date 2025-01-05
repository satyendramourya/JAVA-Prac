import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // for Loop

        // for (int i = 0; i < 10; i++) {
        // System.out.println(i);
        // }

        // while loop
        // int i = 0;
        // while (i < 10) {
        // System.out.println(i);
        // i++;
        // }

        // do while loop
        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 10);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int sum = 0;
        // for (int i = 0; i <= num; i++) {
        // sum += i;
        // }
        // System.out.println(sum);

        System.out.println("------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
