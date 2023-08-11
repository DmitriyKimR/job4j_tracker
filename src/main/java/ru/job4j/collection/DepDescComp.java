package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftString = left.split("/", 1);
        String[] rightString = right.split("/", 1);
        /*int length = Math.min(rightString.length, leftString.length);
        int result = rightString[0].compareTo(leftString[0]);
        for (int i = 0; i < length; i++) {
            if (result == 0) {
                result = rightString.length == leftString.length ?
                        leftString[i].compareTo(rightString[i]) :
                        Integer.compare(leftString.length, rightString.length);
            } else {
                result = rightString.length == leftString.length ?
                        leftString[i].compareTo(rightString[i]) :
                        Integer.compare(leftString.length, rightString.length);
            }
        }*/
        return rightString[0].compareTo(leftString[0]) == 0 ?
                leftString[1].compareTo(rightString[1]) :
                right.compareTo(left);
    }
}
