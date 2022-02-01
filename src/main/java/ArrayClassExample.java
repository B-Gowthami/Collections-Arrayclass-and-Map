import java.util.Arrays;
import java.util.logging.Logger;

public class ArrayClassExample {
    static Logger log = Logger.getLogger(MapCollection.class.getName());
    public static void main(String[] args)
    {
        String[ ] names = {"Gowthami", "Sangeetha", "Rohit", "Sidharth" };
        log.info("String array as list: " + Arrays.asList(names));

        int[ ] list = {2, 4, 6, 10, 22, 34, 46, 58, 60, 76, 69, 90, 85};
        log.info(" Index of element 22 is " + Arrays.binarySearch(list, 22));
        log.info(" Index of element 90 is " + Arrays.binarySearch(list, 90));

        char[ ] chars = {'a', 'e', 'i', 'o', 'u',};
        log.info(" Index of element 'a' is " + Arrays.binarySearch(chars, 'a'));
        log.info(" Index of element 'o' is " + Arrays.binarySearch(chars, 'o'));

        int [ ] num = {25, 35, 10, 45, 20, 30};
        int key = 20;
        log.info("Key " + key + " found at index = " + Arrays.binarySearch(num, key));
        Arrays.sort(num);
        log.info(" Index of element 45 is " +Arrays.binarySearch(num, 45));
        log.info("Integer sorting Array: " + Arrays.toString(num));

        Arrays.parallelSort(num);
        log.info("Integer parallel sorting Array: " + Arrays.toString(num));


        int[ ] array1 = {10, 20, 30, 40};
        int[ ] array2 = {10, 20, 30, 40};

        log.info("Integer array equals: " +Arrays.equals(array1, array2));

        log.info("Arrays.compare(array1, array2): " +Arrays.compare(array1, array2));

        log.info("Arrays.compareUnsigned(array2, array1): " +Arrays.compareUnsigned(array1, array2));

        int[ ] array3 = {2, 3, 4, 5};
        int[ ] array4 = {2, 3, 4, 6};
        log.info("Integer array equals: " +Arrays.equals(array3, array4));
        log.info("Arrays.compare(array3, array4): " +Arrays.compare(array3, array4));
        log.info("Integer Array: " + Arrays.toString(Arrays.copyOf(array3, 6)));
        log.info("Integer Array: " + Arrays.toString(Arrays.copyOf(array4, 8)));
        log.info("Integer range Array: " + Arrays.toString( Arrays.copyOfRange(array4, 1, 3)));

        int intKey = 10;
        Arrays.fill(array3, intKey);
        log.info("Integer Array filling: " + Arrays.toString(array3));
    }
}


