package string;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {

        String str = "I am Yogesh";

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the string");
        //str = sc.next();

        int count = 0;

        //count the no of characters in the string
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ')
                count++;
        }
        System.out.println("no of characters in a string are : " + count);
    }
}


