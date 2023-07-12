package ru.job4j.tracker;

//import org.junit.Test;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        List<String> in = new ArrayList<>();
        String one = "0";
        String two = "Item name";
        String three = "1";
        in.add(0, one);
        in.add(1, two);
        in.add(2, three);
        //Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new CreateAction(out));
        actions.add(1, new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().)
        /*UserAction[] actions = {new CreateAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));*/
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Edited Item"));
        String editedName = "New Item name";
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), editedName, "1"});
        UserAction[] actions = {new EditAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(editedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add();
        //UserAction[] actions = new UserAction[]{new DeleteAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);

        // assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:"
                + System.lineSeparator() + "0. Exit Program" + System.lineSeparator()));
    }

    @Test
    public void whenReplaceItemOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test 1"));
        String replaceName = "New test name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"});
        UserAction[] actions = new UserAction[]{new EditAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindAllActionOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test item"));
        Input in = new StubInput(new String[]{
                "0", "1"});
        UserAction[] actions = new UserAction[]{new ShowAllAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenDeleteActionOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("item to delete"));
        Input in = new StubInput(new String[]{"0", String.valueOf(one.getId()), "1"});
        UserAction[] actions = new UserAction[]{new DeleteAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Delete item" + ln
                        + "1. Exit Program" + ln
                        + "=== Delete Item ===" + ln
                        + "Заявка удалена успешно." + ln
                        + "Menu:" + ln
                        + "0. Delete item" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindByIdOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("item find"));
        Input in = new StubInput(new String[]{"0", String.valueOf(one.getId()), "1"});
        UserAction[] actions = new UserAction[]{new FindByIdAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find by id ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindByNameOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("name find item"));
        Input in = new StubInput(new String[]{"0", one.getName(), "1"});
        UserAction[] actions = new UserAction[]{new FindByNameAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenExitProgramOutputSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(new String[]{"0"});
        UserAction[] actions = new UserAction[]{new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Exit Program" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(new String[]{"5", "0"});
        UserAction[] actions = new UserAction[]{new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Exit Program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu:" + ln
                        + "0. Exit Program" + ln
        ));
    }
}