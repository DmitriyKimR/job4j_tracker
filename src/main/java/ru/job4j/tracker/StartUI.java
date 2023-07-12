package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(List<String> input, Tracker tracker, List<UserAction> actions) {
    //public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            //int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                  out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
            //if (select < 0 || select >= actions.length) {
              //  out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions.get(select);
            // UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
    //private void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (UserAction action : actions) {
            out.println(actions.indexOf(action) + ". " + action);
        //for (int i = 0; i < actions.length; i++) {
            //out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(0, new CreateAction(output));
        actions.add(1, new ShowAllAction(output));
        actions.add(2, new EditAction(output));
        actions.add(3, new DeleteAction(output));
        actions.add(4, new FindByIdAction(output));
        actions.add(5, new FindByNameAction(output));
        actions.add(6, new ExitAction(output));
        /*UserAction[] actions = {new CreateAction(output), new ShowAllAction(output),
                new EditAction(output), new DeleteAction(output), new FindByIdAction(output),
                new FindByNameAction(output), new ExitAction(output)};
        new StartUI(output).init(input, tracker, actions)*/;
    }
}
