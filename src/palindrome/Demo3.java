package palindrome;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        int n,sum=0,temp, r;

        System.out.println("Enter the no");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        while (n>0) {

            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println("palindrome no");
        }
        else {
            System.out.println("not a palindrome no");
        }
    }
}
