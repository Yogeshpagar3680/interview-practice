package methodreference;

public class Test {
    public static void m1() {
        for(int i=0; i<10; i++)
        {
            System.out.println("child thrad");
        }
    }
}
class LaunchTest{
    public static void main(String[] args) {

        Runnable r = Test::m1; //referes m1 method of Test class
        Thread t = new Thread(r);
        t.start();
    }
}
