package assignment8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class assignment8_9 {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(25);
        list1.add(2);
        list1.add(4);
        list1.add(71);
        list1.add(172);
        Consumer<List<Integer>> display = list2->list2.forEach(System.out::println);
        System.out.println(display);
        Thread t = new Thread();
        t.run();
    }
}