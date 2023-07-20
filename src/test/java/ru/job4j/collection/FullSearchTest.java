package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FullSearchTest {

    @Test
    void extractNumber() {
        FullSearch fullSearch = new FullSearch();
        List<Task> tasks = List.of(new Task("1", "First desc"),
                new Task("2", "Second desk"),
                new Task("1", "First desc"));
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2"));
        assertEquals(fullSearch.extractNumber(tasks), expected);
    }
}