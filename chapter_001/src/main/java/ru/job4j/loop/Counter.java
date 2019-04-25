package ru.job4j.loop;
/**
 * Class Counter решение задачи Подсчет суммы чётных чисел в диапазоне[#122785].
 * @author Maks Shevchenko (sheva.maks@gmail.com)
 * @since 25.04.2019
 */
public class Counter {
    /**
     * Метод add вычисляет сумму четный чисел в диапазоне от start до finish.
     * @param start начальное число.
     * @param finish конечное число.
     * @return сумма четных чисел.
     */
    public int add(int start, int finish) {
        int sum=0;
        /**
         * Цикл for проверяет весь диапазон значений от start до finish.
         * В цикле реализован оператор if для проверки, что число четное и сумирует его.
         */
    for(start = 0; start<=finish  ; start++  ){
        if (start % 2 ==0 ){
            sum=sum+start;
        }
    }
        return sum;
    }
}