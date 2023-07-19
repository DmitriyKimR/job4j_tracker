package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new CreateAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertEquals(tracker.findAll().get(0).getName(), ("Item name"));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Edited Item"));
        String editedName = "New Item name";
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), editedName, "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new EditAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertEquals(tracker.findById(item.getId()).getName(), (editedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new DeleteAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertEquals(out.toString(), "Menu:"
                + System.lineSeparator() + "0. Exit Program" + System.lineSeparator());
    }

    @Test
    public void whenReplaceItemOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test 1"));
        String replaceName = "New test name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new EditAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
        );
    }

    @Test
    public void whenFindAllActionOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test item"));
        Input in = new StubInput(new String[]{
                "0", "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new ShowAllAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
        );
    }

    @Test
    public void whenDeleteActionOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("item to delete"));
        Input in = new StubInput(new String[]{"0", String.valueOf(one.getId()), "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new DeleteAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                        + "0. Delete item" + ln
                        + "1. Exit Program" + ln
                        + "=== Delete Item ===" + ln
                        + "Заявка удалена успешно." + ln
                        + "Menu:" + ln
                        + "0. Delete item" + ln
                        + "1. Exit Program" + ln
        );
    }

    @Test
    public void whenFindByIdOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("item find"));
        Input in = new StubInput(new String[]{"0", String.valueOf(one.getId()), "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new FindByIdAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find by id ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
        );
    }

    @Test
    public void whenFindByNameOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("name find item"));
        Input in = new StubInput(new String[]{"0", one.getName(), "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new FindByNameAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit Program" + ln
        );
    }

    @Test
    public void whenExitProgramOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(new String[]{"0"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                        + "0. Exit Program" + ln
        );
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(new String[]{"5", "0"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                        + "0. Exit Program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu:" + ln
                        + "0. Exit Program" + ln
        );
    }
}