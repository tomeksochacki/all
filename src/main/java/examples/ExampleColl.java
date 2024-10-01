package examples;

import java.util.*;

public class ExampleColl {
    public static void main(String[] args) {
        Integer[] inty = {12, 13, 45, 52, 29, 17, 29, 49, 39, 3};
        {

            List<Integer> list = new ArrayList<>(Arrays.asList(inty));
            Set<Integer> set = new HashSet<>(Arrays.asList(inty));
            Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(inty));

            System.out.println(list + "\n" + set + "\n" + queue);

            list.clear();
            set.clear();
            queue.clear();

            Collections.addAll(list, inty);
            Collections.addAll(set, inty);
            Collections.addAll(queue, inty);

            System.out.println(list + "\n" + set + "\n" + queue);

            list.addAll(Arrays.asList(inty));
            set.addAll(Arrays.asList(inty));
            queue.addAll(Arrays.asList(inty));

            System.out.println(list + "\n" + set + "\n" + queue);

        }
    }
}
