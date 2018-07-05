import java.util.*;
import java.util.Map.Entry;

public class MapDemo {
  public static void main(String[] args) {
    // Maps don't have iterators!
    Map<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1, "Thanos");
    hashMap.put(2, "Iron Man");
    hashMap.put(3, "Dr. Strange");
    hashMap.put(4, "I don't feel so good");

    System.out.println(hashMap);
    // The key, 2, maps to the value "Iron Man"
    System.out.println(hashMap.get(2));

    // Using Entry
    // entrySet takes a hashMap and turns it into a set
    for (Entry<Integer, String> e : hashMap.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
  }
}
