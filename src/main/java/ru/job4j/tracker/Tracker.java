package ru.job4j.tracker;

import java.util.ArrayList;

import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();

    private int ids = 1;
    //private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    //public Item[] findAll() {
    //return Arrays.copyOf(items, size);
    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> findByName = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                findByName.add(item);

                //public Item[] findByName(String key) {
                //Item[] findByName = new Item[size];
                //int rsl = 0;
                //for (int i = 0; i < size; i++) {
                //if (key.equals(items[i].getName())) {
                //findByName[rsl] = items[i];
                //rsl++;
            }
        }
        //return Arrays.copyOf(findByName, rsl);
        return findByName;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (Item item : items) {
            if (id == item.getId()) {
                rsl = items.indexOf(item);
            }
            //int rsl = -1;
            //for (int index = 0; index < size; index++) {
            //if (items[index].getId() == id) {
            //rsl = index;
            //break;
        }
        return rsl;
        //return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
        //return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
            //items[index] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            //System.arraycopy(items, index + 1, items, index, size - index - 1);
            //items[size - 1] = null;
            //size--;
        }
        return index != -1;
    }
}