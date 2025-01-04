import java.util.Scanner;

public class sum {
    public static void m2ain (String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter variable A :");
        int a = sc.nextInt();
        System.out.println("Enter variable B :");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);
    }
}