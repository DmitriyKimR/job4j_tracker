package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUi {

    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime date = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String endFormat = date.format(formatter);
        System.out.println(endFormat);
    }
}
