package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();

        l.add(5);
        l.add(6);
        l.add(10);
        l.add(7);
        l.add(15);
        l.add(25);
        l.add(22);

        System.out.println(l);

        ArrayList<String> heros = new ArrayList<>();

        heros.add("Yogesh");
        heros.add("Shahrukh");
        heros.add("Hritik");
        heros.add("Salman");
        heros.add("Amir");
        heros.add("Shahid");

        List<Integer> list = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println("After filtering");
        System.out.println(list);

        System.out.println("----------------------------------------------------------------");

        List<Integer> list1 = l.stream().map(i -> i+5).collect(Collectors.toList());
        System.out.println("After Mapping");
        System.out.println(list1);

        System.out.println("----------------------------------------------------------------");

        long lessThanTwenty = l.stream().filter(n -> n <= 20).count();
        System.out.println("no of elements less than 20 are : "+ lessThanTwenty);

        System.out.println("----------------------------------------------------------------");

        List<Integer> sorted = l.stream().sorted().collect(Collectors.toList());
        System.out.println("After natural sorting");
        System.out.println(sorted);

        List<String> sort = heros.stream().sorted().collect(Collectors.toList());
        System.out.println("Before Sorting");
        System.out.println(heros);
        System.out.println("After Sorting");
        System.out.println(sort);


        System.out.println("----------------------------------------------------------------");

        List<Integer> customSort = l.stream().sorted((n1,n2) -> (n1 < n2)? 1 : -1).collect(Collectors.toList());
        System.out.println("After custom sort");
        System.out.println(customSort);

        System.out.println("----------------------------------------------------------------");

        Integer minValue = l.stream().min((n1,n2) -> n1.compareTo(n2)).get();
        System.out.println("Minimum value from list : " + minValue);

        System.out.println("----------------------------------------------------------------");

        Integer maxValue = l.stream().max((n1,n2) -> n1.compareTo(n2)).get();
        System.out.println("Maximum value from list : " + maxValue);

        System.out.println("----------------------------------------------------------------");

        System.out.println("Printing elements by forEach menthod");
        l.stream().forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        System.out.println("Consumer by using forEach");

        Consumer<Integer> c = n->{
            System.out.println("The square of "+n+" is " +(n*n));
        };
        l.stream().forEach(c);

        System.out.println("----------------------------------------------------------------");
    }
}
