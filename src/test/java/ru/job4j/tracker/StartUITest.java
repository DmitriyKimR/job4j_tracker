package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out), new ExitAction()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Edited Item"));
        String editedName = "New Item name";
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), editedName, "1"});
        UserAction[] actions = {new EditAction(out), new ExitAction()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(editedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = new UserAction[]{new DeleteAction(out), new ExitAction()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:"
                + System.lineSeparator() + "0. Exit Program" + System.lineSeparator()));
    }
}