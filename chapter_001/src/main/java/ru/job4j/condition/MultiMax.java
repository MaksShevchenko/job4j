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
     * (first>second) ? ((first>third) ? first : third) : ((second>third) ? second : third);
     */
    public int max(int first, int second, int third) {
        int result = (first>second) ? first : second ;
        return  (result>third) ? result : third;
    }
}
