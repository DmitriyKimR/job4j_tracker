package ru.job4j.queue;

import org.junit.jupiter.api.Test;

import java.util.Deque;

import java.util.LinkedList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReconstructionPhraseTest {

    @Test
    void whenSloganOfLanguageJava() {
        Deque<Character> evenElements = new LinkedList<>(List.of(
                'S', '1', 'l', '3', 'o', 'h', 'g', 'h', 'a', 'm', 'n', 't',
                ' ', 't', 'o', ' ', 'f', 'q', ' ', '6', 'l', '.', 'a', ',',
                'n', 'w', 'g', 'd', 'u', 'a', 'a', 'u', 'g', 'd', 'e', 'q',
                ' ', 'y', 'J', 'd', 'a', 'k', 'v', 'p', 'a', 'e', ':', 'b')
        );
        Deque<Character> descendingElements = new LinkedList<>(List.of(
                'e', 'r', 'e', 'h', 'w', 'y', 'r', 'e', 'v', 'e', ' ', 'n', 'u',
                'r', ' ', ',', 'e', 'c', 'n', 'o', ' ', 'e', 't', 'i', 'r', 'W', ' ')
        );
        String expected = "Slogan of language Java: Write once, run everywhere";
        String result = new ReconstructionPhrase(descendingElements,
                evenElements).getReconstructPhrase();
        assertEquals(expected, result);
    }
}