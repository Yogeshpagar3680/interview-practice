package string;

public class Reverse {
    public static void main(String[] args) {

        String str = "Yogesh";
        String rev = "";

        for (int i=str.length()-1; i>0; i--){

            rev = rev + str.charAt(i);
        }
        System.out.println("Original string : " + str);
        System.out.println("Reversed String is : " + rev);
    }
}
