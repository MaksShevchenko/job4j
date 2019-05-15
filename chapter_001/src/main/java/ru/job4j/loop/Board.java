package ru.job4j.loop;
/**
 * Class Board решение задачи 5.3. Построить шахматную доску в псевдографике.[#122789].
 * @author Maks Shevchenko (sheva.maks@gmail.com)
 * @since 11.05.2019
 */
public class Board {
    /**
     * Метод paint рисует шахматную доску.
     * @param width - ширина.
     * @param height - высота.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                if ((x + y) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
