package ru.job4j.queue;

import java.util.Deque;

import static java.lang.String.*;

public class ReconstructionPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructionPhrase(Deque<Character> descendingElements,
                                Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    public String getEvenElements() {
        StringBuilder stringBuilder = new StringBuilder();
        String result = null;
        int size = evenElements.size();
        for (int index = 0; index < size; index++) {
            if (index % 2 == 0) {
                result = String.valueOf(stringBuilder.append(evenElements.pollFirst()));
            } else {
                evenElements.pollFirst();
            }
        }
        return result;
    }

    public String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        String result = null;
        int size = descendingElements.size();
        for (int index = 0; index < size; index++) {
            result = valueOf(stringBuilder.append(descendingElements.pollLast()));
        }
        return result;
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
