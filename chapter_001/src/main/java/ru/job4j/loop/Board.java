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
        /**Цикл for.
         * Цикл для создания шахматной доски.
         */
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                /**Условный оператор if.
                 * Условие для чередования символа "X" c " ".
                 */
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            /** Метод screen.append.
             * Добавляет перевод на новую строку.
             */
            screen.append(ln);
        }
        return screen.toString();
    }
}

/*
    Более менее разобрался с циклами и условием для чередования.
    Проблема StringBuilder - в курсе более детально еще рассматривается ? или же это освоить самостоятельно ?
 */