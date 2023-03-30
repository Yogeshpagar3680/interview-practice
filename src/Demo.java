import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        int n, m, count;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        n = sc.nextInt();

        m = n / 2;

        for (int i = 2; i <= m; i++) {

            if (n % i == 0) {

                System.out.println(n + "is not a number");
            }
            else{

                System.out.println(n + " is a prime no ");
            }
        }
    }
}
