package Homework16.WordMultipleMap;

import java.util.*;

public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue() >= 2);
        }

        return result;
    }
}
