import java.util.*;

public class Hashing {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("China", 150);
        map.put("USA", 30);

        map.put("China", 200);

        System.out.println(map);

        System.out.println(map.get("India"));
        System.out.println(map.get("Pakisthan"));

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getValue()+" ");
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}