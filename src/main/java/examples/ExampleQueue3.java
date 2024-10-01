package examples;

import java.util.*;

public class ExampleQueue3 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new TreeSet<>();

        for (int i = 0;i<1000; i++){
            int var = random.nextInt((50 - 10) +1) + 10;
            set.add(var);
            set1.add(var);
            set2.add(var);
        }

        System.out.println("HashSet" + set + "\n" + "LinkedHashSet" + set1 +"\n" + "TreeSet" + set2 );

        Queue<Integer> queue = new LinkedList<>();
        for (int k = 0; k<10; k++){
            queue.offer(k);
        }

        System.out.println(queue + "\n");

        int rozmiar = queue.size();
        for (int l = 0; l<rozmiar; l++){
            System.out.println(queue.poll() + " ");
        }
        for (int m = 0; m<10; m++){
            queue.offer(random.nextInt(100));
        }

        System.out.println(queue);
    }
}
