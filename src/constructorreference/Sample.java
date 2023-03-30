package constructorreference;

public class Sample {
    Sample()
    {
        System.out.println("Sample class constructor...");
    }
    Sample(String s)
    {
        System.out.println("Sample class constructor with arguments get called...");
    }
}
interface Interf{

    public Sample get(String s);
}
class Test{
    public static void main(String[] args) {

        Interf i = Sample::new;
        i.get("Yogesh");
    }
}
