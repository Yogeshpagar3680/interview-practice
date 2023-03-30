package string;

public class Pallindrome {
    public static void main(String[] args) {

        String str = "Yogesh";

        boolean flag = true;

        str = str.toLowerCase();

        for (int i=0; i<str.length()/2; i++) {

            if (str.charAt(i) != str.charAt(str.length()-i-1))
                flag = false;
                break;
        }
        if (flag == true) {
            System.out.println("String is pallindrome");
        } else {
            System.out.println("String is not pallindrome");
        }
    }
}