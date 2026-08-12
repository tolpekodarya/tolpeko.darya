package Homework16.FirstToLast;
import java.util.*;

public class FirstToLast {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            String first = str.substring(0, 1);
            String last = str.substring(str.length() - 1);
            result.put(first, last);
        }

        return result;
    }
}