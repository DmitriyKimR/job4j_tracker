package ru.job4j.queue;

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
        for (int i = 1; i < count; i++) {
            result.poll();
        }
        return result.poll().name();
    }

    public String getFirstUpsetCustomer() {
        Queue<Customer> result = queue;

        for (int i = 0; i < count; i++) {
            result.poll();
        }
        return result.poll().name();
    }
}
