package ru.job4j.tracker;

import java.util.List;

public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit Program";
    }

    @Override
    public boolean execute(List<Input> input, Tracker tracker) {
        return false;
    }
}
