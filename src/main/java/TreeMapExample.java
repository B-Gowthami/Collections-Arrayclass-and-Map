import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;

public class TreeMapExample {
    static Logger log = Logger.getLogger(MapCollection.class.getName());
    public static void main(String[] args) {
        Map< String,Integer> courses = new TreeMap< String,Integer>();

        courses.put("Java Courses", 3);
        courses.put("AWS Courses",7);
        courses.put("Programming Courses", 8);
        courses.put("Data Science Courses", 2);
        log.info("Map " + courses);

        log.info("Total courses: " + courses.size());

        Set< Map.Entry< String,Integer> > st = courses.entrySet();
        for (Map.Entry< String,Integer> me :st)
        {
            log.info(me.getKey()+":");
        }
        log.info("Map " + courses);
    }
}

