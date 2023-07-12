package ru.job4j.tracker;

import java.util.List;

public interface UserAction {
    String name();

    boolean execute(List<Input> input, Tracker tracker);
}
