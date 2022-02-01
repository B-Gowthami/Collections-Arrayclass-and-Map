import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MapCollection {
    static Logger log = Logger.getLogger(MapCollection.class.getName());
    public static void main(String[] args) {
        Map<String, Integer> names = new HashMap<>();
        names.put("Gowthami", 8);
        names.put("Sangeetha", 9);
       log.info("Map: " + names );

       log.info("Keys: " + names .keySet());

       log.info("Values: " + names .values());

       log.info("Entries: " + names .entrySet());

       int value = names .remove("Gowthami");
       log.info("Removed Value: " + value);
    }
}
