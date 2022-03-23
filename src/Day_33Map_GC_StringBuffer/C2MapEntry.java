package Day_33Map_GC_StringBuffer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C2MapEntry {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("Banana", 5.5);
        map.put("Orange", 3.5);
        map.put("Avocado", 10.5);
        map.put("Mango", 11.0);

        System.out.println(map);

       /* System.out.println(map.entrySet());

        Set< Map.Entry<String,Double>> setOfEntries = map.entrySet();


        */

        Set<String> setOfKeys = map.keySet();
        for (String key : setOfKeys) {
            System.out.println(key);
        }

        Collection<Double> Values = map.values();
        System.out.println("Values of the map");
        for (Double value : map.values()) {
            System.out.println(value);


        }
    }
}
