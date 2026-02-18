
/* 
input
dist = [{"fruit_name":"apple", "sold_weight": 10},
{"fruit_name":"banana", "sold_weight": 20},
{"fruit_name":"apple", "sold_weight": 30},
{"fruit_name":"banana", "sold_weight": 40},
{"fruit_name":"orange", "sold_weight": 50}]

output
dist = {"apple": 40, "banana": 60, "orange": 50}
 */

import java.util.*;
public class feb_18 {
    public static void main(String[] args){
        List<Map<String, Object>> dist = new ArrayList<>();
        dist.add(Map.of("fruit_name", "apple", "sold_weight", 10));
        dist.add(Map.of("fruit_name", "banana", "sold_weight", 20));
        dist.add(Map.of("fruit_name", "apple", "sold_weight", 30));
        dist.add(Map.of("fruit_name", "banana", "sold_weight", 40));
        dist.add(Map.of("fruit_name", "orange", "sold_weight", 50));

        Map<String, Integer> result = new HashMap<>();

        for(Map<String, Object> entry : dist){
            String fruitName = (String) entry.get("fruit_name");
            int soldWeight = (int) entry.get("sold_weight");
            result.put(fruitName, result.getOrDefault(fruitName, 0) + soldWeight);
        }
        System.out.println(result);
    }
}
