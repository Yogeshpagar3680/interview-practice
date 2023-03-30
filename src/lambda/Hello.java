package lambda;

@FunctionalInterface
public interface Hello {
    void hello();

}
class LaunchHello{
    public static void main(String[] args) {

        Hello h = () -> System.out.println("Hello");
        h.hello();
    }
}
