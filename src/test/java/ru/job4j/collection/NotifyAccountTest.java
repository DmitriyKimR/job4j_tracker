package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotifyAccountTest {

    @Test
    public void whenAddTwoDifferentAccounts() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f")
        );
        HashSet<Account> expected = new HashSet<>(List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f")));
        assertEquals(NotifyAccount.sent(accounts), expected);
    }

    @Test
    public void whenAddTwoDuplicateAccounts() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Ivan Ivanov", "000000001"));
        HashSet<Account> expected = new HashSet<>(List.of(
                new Account("123", "Petr Arsentev", "eDer3432f")));
        assertEquals(NotifyAccount.sent(accounts), expected);
    }

    @Test
    public void whenAddSomeDuplicateAccounts() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Ivan Ivanov", "000000001"),
                new Account("142", "Petr Petrov", "000000002"),
                new Account("123", "Mark Markov", "000000003")
        );
        HashSet<Account> expected = new HashSet<>(List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f")));
        assertEquals(NotifyAccount.sent(accounts), expected);
    }
}