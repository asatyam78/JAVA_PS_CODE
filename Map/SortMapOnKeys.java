package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapOnKeys {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Vivek", 55);
    map.put("Abhinav", 65);
    map.put("Raunak", 45);
    map.put("Niranjan", 50);

    List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
    Collections.sort(list,(a,b) -> a.getKey().compareTo(b.getKey()));

    Map<String, Integer> out = new LinkedHashMap<>();

    for (Map.Entry<String, Integer> kv: list) {
      out.put(kv.getKey(), kv.getValue());
    }

    System.out.println(out);
  }
}
