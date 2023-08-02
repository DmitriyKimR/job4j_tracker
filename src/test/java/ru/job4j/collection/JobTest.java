package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    public void whenJobAscByName() {
        Comparator<Job> comparator = new JobAscByName();
        int result = comparator.compare(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenJobAscByPriority() {
        Comparator<Job> comparator = new JobAscByPriority();
        int result = comparator.compare(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenJobDescByName() {
        Comparator<Job> comparator = new JobDescByName();
        int result = comparator.compare(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenJobDescByPriority() {
        Comparator<Job> comparator = new JobDescByPriority();
        int result = comparator.compare(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenAscComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority =
                new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenDescComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }
}