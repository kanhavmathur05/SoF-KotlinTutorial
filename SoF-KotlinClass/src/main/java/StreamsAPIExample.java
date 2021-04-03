import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StreamsAPIExample {
    public static void main(String args[]) {
        ArrayList<String> list=new ArrayList<>();

        list.add("srikanth");
        list.add("srinath");
        list.add("anand");
        list.add("laxmi");
        list.add("ravi");
        list.add("ajay");
        list.add("shiv");
        list.add("indu");


        System.out.println("Names starts with a are");
//        list.stream().filter((item)->item.startsWith("a"));


        System.out.println("Sorted List");
        Collections.sort(list);
/*        list.forEach(item->{
            System.out.println(item);
        });*/

        System.out.println("Uppercase letter list");
//        list.stream().filter(String::toUpperCase);

        System.out.println("Display List");
/*        list.forEach(item->{
            System.out.println(item);
        });*/


        list.stream().filter(element->element.startsWith("a")).map(String::toUpperCase).sorted()
        .forEach(System.out::println);

        list.stream().filter(element->element.startsWith("a")).count();

        list.stream().anyMatch(element->element.startsWith("z"));

        list.stream().allMatch(element->element.startsWith("z"));

        list.stream().noneMatch(element->element.startsWith("z"));
    }
}
