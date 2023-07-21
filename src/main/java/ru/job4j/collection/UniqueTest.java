package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueTest {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        for (String textString : text) {
            if (!check.contains(textString)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
