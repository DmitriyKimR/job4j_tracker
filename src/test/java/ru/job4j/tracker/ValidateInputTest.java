package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"one", "1"});
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"1"});
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select, is(1));
    }

    @Test
    public void whenFewValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"2", "1", "4", "-2"});
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select, is(2));
        select = input.askInt("Enter menu:");
        assertThat(select, is(1));
        select = input.askInt("Enter menu:");
        assertThat(select, is(4));
        select = input.askInt("Enter menu:");
        assertThat(select, is(-2));
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"-2"});
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter name:");
        assertThat(select, is(-2));
    }

}