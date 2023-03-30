package prime;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        int i;
        int m = 0;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no");
        n = sc.nextInt();

        m = n/2;

        if (n == 0 || n == 1) {

            System.out.println(n + " is not a prime number");
        }
        else {

            for (i = 2; i <= m; i++) {

                if (n % i == 0) {

                    System.out.println(n + " is not a prime number");
                }
                else {
                    System.out.println(n + " is a prime number");
                }

            }
        }
    }
}

