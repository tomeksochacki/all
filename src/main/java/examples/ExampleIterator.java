package examples;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExampleIterator {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);

        //System.out.println(list);
        List<Integer> list1 = new LinkedList<>();

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            list1.add(listIterator.previous());
        }
        System.out.println(list1);


        //System.out.println("lista 1: " + list1);

    }
}
