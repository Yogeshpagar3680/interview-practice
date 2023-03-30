package factorial;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {

        int i, fact = 1;

        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (i=1; i<=n; i++){

            fact = fact * i;

        }

        System.out.println("Factorial of "+ n + " is " +fact);
    }
}
