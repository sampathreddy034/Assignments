package assignment8;
import java.util.ArrayList;
import java.util.List;
public class assignment8_4{

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        list1.add("hello");
        list1.add("hello world");
        list1.add("hi");
        list1.add("hi everyone");
        list1.add("done");
        list1.add("hello people");
        list1.add("hello buddy");
        list1.removeIf(s->s.length()%2!=0);

        list1.forEach(System.out::println);

    }

}