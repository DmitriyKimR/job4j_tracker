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
        String lastHappyCustomer  = null;
        int happy = 0;
        for (int i = 0; i < result.size(); i++) {
            result.poll();
            happy++;
            if (happy == count - 1) {
                lastHappyCustomer = Objects.requireNonNull(result.poll()).name();
            }
        }
        return lastHappyCustomer;
    }

    public String getFirstUpsetCustomer() {
        Queue<Customer> result = queue;
        String firstUpsetCustomer = null;
        int upset = 0;
        for (int i = 0; i < result.size(); i++) {
            result.poll();
            upset++;
            if (upset == count) {
                firstUpsetCustomer = Objects.requireNonNull(result.poll()).name();
            }
        }
        return firstUpsetCustomer;
    }
}
