package paralellstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
class paralleStream{
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Yogesh",85),
                new Student("Vikas",90),
                new Student("Shubham",87),
                new Student("Yash",50),
                new Student("Ram",45),
                new Student("Om",44),
                new Student("Sai",55)
        );

        System.out.println("---------------------------------------------------------------");

        System.out.println("Students with score greater than 80 by normal stream ");

        students.stream()
                .filter(s-> s.getScore() >= 80)
                .limit(2)
                .forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));

        System.out.println("---------------------------------------------------------------");

        System.out.println("Students with score greater than 80 by parallel stream ");

        students.parallelStream()
                .filter(s -> s.getScore() >= 80)
                .limit(3)
                .forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));

        System.out.println("---------------------------------------------------------------");
    }
}
