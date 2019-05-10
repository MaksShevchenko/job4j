package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        //создаем объект Factorial
        Factorial factorial = new Factorial();
        //вводим значение 5
        int result = factorial.calc(5);
        //задаем желаемый результат
        int sum = 120;
        assertThat(result, is(120));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        //создаем объект Factorial
        Factorial factorial = new Factorial();
        //вводим значение 0
        int result = factorial.calc(0);
        //задаем желаемый результат
        int sum = 1;
        assertThat(result, is(1));
    }
}