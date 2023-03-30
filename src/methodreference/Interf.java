package methodreference;

import static java.awt.AWTEventMulticaster.add;

@FunctionalInterface
interface Interf {
    int add(int x, int y);
}
class Test1{

    public static int add(int a, int b){
       return a+b;
    }
    public static void main(String[] args) {

           Interf i = (x,y)-> (x+y);
           int j = i.add(10,20);
        System.out.println("The sum is " + j);

        Interf interf = Test1::add;
        int k = interf.add(100,200);
        System.out.println("The sum is "+ k);
    }
}
