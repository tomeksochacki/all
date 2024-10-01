package examples;

import java.util.*;

public class ExampleIteratorKangur {

    public static void main(String[] args) {
        String[] imiona = {"Mariusz", "Ola", "Jola", "Pola", "Zenek", "Janek"};
        List<Kangur> kangurs = new ArrayList<>();
        kangurs.add(new Kangur(1));
        kangurs.add(new Kangur(2));
        kangurs.add(new Kangur(3));
        kangurs.add(new Kangur(4));
        kangurs.add(new Kangur(5));
        kangurs.add(new Kangur(6));

        Map<String, Kangur> map = new HashMap<>();
        for (int i = 0; i < imiona.length; i++) {
            map.put(imiona[i], kangurs.get(i));
        }

        System.out.println(map);

        Iterator<Kangur> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().skok();
            //System.out.println(iterator.next());
        }

        LinkedHashMap<String, Kangur> linkedHashMap = new LinkedHashMap<>();
        //for (int j = 0; j<map.size(); j++){
        //linkedHashMap.putAll(map);

        for (Map.Entry<String, Kangur> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        ;


        SortedSet<String> keySet = new TreeSet<>(linkedHashMap.keySet());
        System.out.println("to:" + keySet);


        System.out.println("linked" + linkedHashMap);
        //kangurs.get(1).skok();

        /*for (example.Kangur k:kangurs) {
            k.skok();
        }*/

        /*Iterator<example.Kangur> iterator = kangurs.iterator();
        while (iterator.hasNext()){
            iterator.next().skok();
        }*/

    }
}

