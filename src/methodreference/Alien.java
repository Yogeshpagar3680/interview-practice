package methodreference;

public class Alien {
    public void m1()
    {
        for (int i=0; i<10; i++)
        {
            System.out.println("Child thread");
        }
    }
}
class LaunchAlien1{
    public static void main(String[] args) {

        Alien a = new Alien();
        Runnable r = a::m1;
        Thread t = new Thread(r);
        t.start();
    }
}