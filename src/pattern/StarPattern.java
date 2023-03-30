package pattern;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {

        int row = 4;
        int i,j;

        /*System.out.println("Enter the value of row");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();*/

        for (i=0; i<row; i++){

            for (j=0; j<=i; j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
