import java.util.LinkedHashMap;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class LinkedHashMapExample {
    static Logger log = Logger.getLogger(MapCollection.class.getName());
    public static void main(String []args)
    {
        LinkedHashMap<String, Integer> courses = new LinkedHashMap<String, Integer>();
        courses.put("Java Courses", 3);
        courses.put("Cloud Courses", 7);
        courses.put("Programming Courses", 8);
        courses.put("Data Science Courses",2);
        log.info("LinkedHashMap" + courses);
        log.info("Total courses: " + courses.size());
        log.info("Contains key 'Python'? "+  courses.containsKey("Python"));

        log.info("Getting value for key 'Cloud Courses': " + courses.get("Cloud Courses"));
        log.info("Is map empty? " + courses.isEmpty());

        log.info("delete element 'Data Science Courses': " +  courses.remove("Data Science Courses"));
        log.info("LinkedHashMap" + courses);
    }
}

