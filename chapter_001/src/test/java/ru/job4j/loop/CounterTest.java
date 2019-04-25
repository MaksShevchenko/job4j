package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
    //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    //создаем объект
    Counter counter = new Counter();
    //вводим значения от 1 до 10
    int result = counter.add(10);
    //задаем желаемый результат
    int sum=30;
    assertThat(result, is(30));
    }
}