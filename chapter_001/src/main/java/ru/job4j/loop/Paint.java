package ru.job4j.loop;
import java.util.function.BiPredicate;
/**
 * Class Board решение задачи 5.3. Построить шахматную доску в псевдографике.[#122789].
 * @author Maks Shevchenko (sheva.maks@gmail.com)
 * @since 13.05.2019
 */
public class Paint {
    public String rightTrl(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        int width = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != width; column++) {
                // если строка равна ячейке, то рисуем галку.
                // в данном случае строка определяет, сколько галок будет в строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    public String pyramid(int height) {
        StringBuilder result = new StringBuilder("");
        /**Цикл for - для создания пирамиды.
         */
        for (int i = 0; i <= height + 1; i += 2) {
            for (int j = 0; j < 3 - i; j += 2) {
                result.append(" ");
            }
            for (int k = 0; k <= i; k++) {
                result.append("^");
            }
            /**Метод переход на новую строку.
             */
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }
}
