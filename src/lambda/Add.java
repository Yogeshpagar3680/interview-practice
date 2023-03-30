package lambda;

@FunctionalInterface
public interface Add {
    int add(int n1, int n2);
}
class LaunchAdd{
    public static void main(String[] args) {

        Add a = (n1, n2) -> n1 + n2;

        System.out.println("Addition is " + a.add(5,2));
    }

}