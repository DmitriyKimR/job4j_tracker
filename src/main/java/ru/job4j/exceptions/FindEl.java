package ru.job4j.exceptions;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Key is not found in array");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"on", "off", "switch"}, "temp");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
