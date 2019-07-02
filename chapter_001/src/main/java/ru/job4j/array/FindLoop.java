package ru.job4j.array;
/**
 * Class FindLoop решение задачи 6.1. Классический поиск перебором.[#122792].
 * @author Maks Shevchenko (sheva.maks@gmail.com).
 * @since 02.07.2019
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}