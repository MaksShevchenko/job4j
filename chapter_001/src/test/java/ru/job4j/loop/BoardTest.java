package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class BoardTest решение задачи 5.3. Построить шахматную доску в псевдографике.[#122789].
 * @author Maks Shevchenko (sheva.maks@gmail.com)
 * @since 10.05.2019
 */
public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }
}