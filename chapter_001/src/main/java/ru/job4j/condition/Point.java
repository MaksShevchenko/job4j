package ru.job4j.condition;

/**
 * Class Point - задание 3.4. Расстояние между точками в системе координат[#122808]
 * @author Maks Shevchenko (sheva.maks@gmail.com)
 * @since 12.04.2019
 */
public class Point {
    /**
     * Метод distance вычисляет расстояние методу точками в системе координат.
     * @param   x1 x2 y1 y2 - значения.
     * @return результат.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt( first + second );
    }
}