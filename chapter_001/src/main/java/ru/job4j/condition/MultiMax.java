package ru.job4j.condition;
/**
 * Class MultiMax - задание Максимум из трех чисел[#122778]
 * @author Maks Shevchenko (sheva.maks@gmail.com)
 * @since 21.04.2019
 */
public class MultiMax {
    /**
     * Method max - сравнение чисел.
     * @param first second third - переменные.
     * @return result - максимальное число.
     * В задании было сказано использовать несколько раз тернарный оператор, т.к. мы уже делали максимум из 2 чисел
     * нам нужно было сравнить результат с третьим числом.
          int maximum = (first>second) ? first : second ;
          int result;
          return result=(maximum>third)? maximum : third;
        я хотел написать вот так, но IDEA выдавала ошибку, погуглив нашел другой способ.
     возможно и в моём коде есть логика правильная, но я не смог это правильно оформить ?
     */
    public int max(int first, int second, int third) {
        return (first>second) ? ((first>third) ? first : third) : ((second>third) ? second : third);
    }
}