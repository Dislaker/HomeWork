import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Product> product = new HashMap<>();

        product.put(1, new Product("Смартфон"));
        product.put(2, new Product("Наушники"));
        product.put(3, new Product("Часы"));

        printEntrySet(product);
        printKeySet(product);
        printValue(product);
    }
    public static void printEntrySet(Map<Integer, Product> product) {
        Set<Map.Entry<Integer, Product>> devices = product.entrySet();

        for (Map.Entry<Integer, Product> device : devices) {
            Product value = device.getValue();
            Integer key = device.getKey();
            System.out.println(key + " " + value.getName());
        }
    }
    public static void printKeySet(Map<Integer, Product> product) {
        Set<Integer> keySet = product.keySet();

        for (Integer key : keySet) {
            System.out.println(key);
        }
    }
    public static void printValue(Map<Integer, Product> product) {
        Collection<Product> valueSet = product.values();

        for (Product value : valueSet) {
            System.out.println(value.getName());
        }
    }
}
