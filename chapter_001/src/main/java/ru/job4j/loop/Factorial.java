package ru.job4j.loop;

/**Class Factorial - программа, вычисляющая факториал.[#122786].
 * @author Maks Shevchenko (sheva.maks@gmail.com).
 * @since 07.05.2019.
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        //Цикл for проходит от 1 до n и перемножает числа.
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}