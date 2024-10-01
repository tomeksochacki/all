package examples;

import java.util.*;

public class ExampleMap {

    public static String losujString(){
        char[] chars = "abcdefghijklmnopqrstuwxyz".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i<5; i++){
            char c = chars[random.nextInt(chars.length)];
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String > map1 = new LinkedHashMap<>();
        Map<Integer, String> map2 = new TreeMap<>();

        for (int i = 0; i<10; i++){
            int var = random.nextInt(1000);
            String s = losujString();

            map.put(var, s);
            map1.put(var, s);
            map2.put(var, s);
        }

        System.out.println("HashMap:" + map);
        System.out.println("LinkedHashMap:" + map1);
        System.out.println("TreeMap:" + map2);
    }
}
