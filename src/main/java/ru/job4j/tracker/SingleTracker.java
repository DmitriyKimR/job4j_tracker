package ru.job4j.tracker;

public final class SingleTracker {
    private static SingleTracker instance;
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String name) {
        return tracker.findByName(name);
    }

    public boolean itemReplace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean itemDelete(int id) {
        return tracker.delete(id);
    }
}
