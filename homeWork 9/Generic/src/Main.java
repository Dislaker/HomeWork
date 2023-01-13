import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 1, 2, 3, 3, 4, 4, 5};

        Map<Integer, Integer> number = arrayToMap(array);
        System.out.println(number);
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();

        for (int i = 0; i < ks.length; i++) {
            int amount = 1;
            K key = ks[i];
            if (map.containsKey(key) == true) {
                amount = map.get(key) + 1;
            }
            map.put(key, amount);
        }
        return map;
    }
}

