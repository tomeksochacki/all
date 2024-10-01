package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class ExampleIterator3 {
    public static String losujStringa() {
        char[] chars = "abcdefghijklmnopqrstuwxyz".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i< 10; i++){
            int var = random.nextInt(1000);
            String s = losujStringa();
            map.put(var, s);
        }

        System.out.println(map);

        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()){
            int var = it.next();
            System.out.println(var + ":" + map.get(var) + " || ");
        }
    }
}
