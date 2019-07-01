package ru.job4j.array;
/**
 * Class Square решение задачи 6.0. Заполнить массив степенями чисел.[#122791].
 * @author Maks Shevchenko (sheva.maks@gmail.com).
 * @since 01.07.2019
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        /*
            Цикл for заполняет массив элементами от 1 до bound возведенными в квадрат.
         */
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);

        } return rst;
    }
}