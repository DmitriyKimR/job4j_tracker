package ru.job4j.queue;

import java.util.Deque;

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
        int size = evenElements.size();
        for (int index = 0; index < size; index++) {
            if (index % 2 == 0) {
                stringBuilder.append(evenElements.pollFirst());
            } else {
                evenElements.pollFirst();
            }
        }
        return stringBuilder.toString();
    }

    public String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = descendingElements.size();
        for (int index = 0; index < size; index++) {
            stringBuilder.append(descendingElements.pollLast());
        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
