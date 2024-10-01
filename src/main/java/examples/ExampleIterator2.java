package examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class ExampleIterator2 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i<10; i++){
            set.add(random.nextInt(1000));
        }
        System.out.println(set);

        Iterator<Integer> it = set.iterator();
        int count = 0;
        while (it.hasNext()){
            System.out.println(it.next() + " ");
            if (count++ == 5){
                it.remove();
            }
        }

        System.out.println();
        System.out.println(set);
    }
}
