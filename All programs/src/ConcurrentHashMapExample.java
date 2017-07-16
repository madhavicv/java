
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("N","Nokia");
        concurrentHashMap.put("S","Samsung");
        for (Map.Entry e : concurrentHashMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}