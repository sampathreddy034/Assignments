package assignment8;
import java.util.ArrayList;
import java.util.List;

public class assignment8_6 {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        list1.add("lower");
        list1.add("case");
        list1.add("changed to");
        list1.add("upper");
        list1.add("case");

        System.out.println("Before using replaceALL:");
        System.out.println(list1);

        list1.replaceAll(str->str.toUpperCase());
        System.out.println("After using replace all: ");
        System.out.println(list1);
    }

}