package ru.job4j.queue;

import java.util.Objects;
import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.count = count;
        this.queue = queue;
    }

    public String getLastHappyCustomer() {
        Queue<Customer> result = queue;
        String lastHappyCustomer = null;
        int size = result.size();
        for (int i = 1; i < size; i++) {
            if (i == count) {
                lastHappyCustomer = Objects.requireNonNull(result.poll()).name();
            } else {
                result.poll();
            }
        }
        return lastHappyCustomer;
    }

    public String getFirstUpsetCustomer() {
        Queue<Customer> result = queue;
        String firstUpsetCustomer = null;
        int size = result.size();
        for (int i = 0; i < size; i++) {
            if (i == count) {
                firstUpsetCustomer = Objects.requireNonNull(result.poll()).name();
            } else {
                result.poll();
            }
        }
        return firstUpsetCustomer;
    }
}
