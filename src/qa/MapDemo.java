package qa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo
{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Rohit");
        map.put("sport", "cricket");
        map.put("place", "mumbai");
        map.put("place", "vizag");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
