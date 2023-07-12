package ru.job4j.tracker;

import java.util.List;

public class StubInput implements Input {

    private List<String> answers;
    //private String[] answers;
    private int position = 0;

    public StubInput(List<String> answers) {
    //public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers.toString();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
