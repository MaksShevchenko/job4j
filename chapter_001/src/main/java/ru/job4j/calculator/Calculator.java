package ru.job4j.calculator;
/**
 * Class Calculator - задание #122807 3.1 Элементарный калькулятор.
 * @author Maks Shevchenko (sheva.maks@gmail.com)
 * @since 08.04.2019
 */
public class Calculator {
    /**
     * Сложение
     * @param first переменная double
     * @param second переменная double
     * @return возвращаем сумму переменных
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Вычитание
     * @param first переменная double
     * @param second переменная double
     * @return возвращаем вычитание переменных
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Деление
     * @param first переменная double
     * @param second переменная double
     * @return возвращаем деление переменных
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Умножение
     * @param first переменная double
     * @param second переменная double
     * @return возвращаем умножение переменных
     */
    public double multiple(double first, double second) {
        return first * second;
    }

}