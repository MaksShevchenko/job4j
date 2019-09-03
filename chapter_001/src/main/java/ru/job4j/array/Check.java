package ru.job4j.array;
/**
 * Class FindLoop решение задачи 6.3. Массив заполнен true или false[#122795].
 * @author Maks Shevchenko (sheva.maks@gmail.com).
 * @since 03.09.2019
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                return false;
            }
        }
        return result;
    }
}