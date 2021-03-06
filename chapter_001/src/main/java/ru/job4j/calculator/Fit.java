package ru.job4j.calculator;
/**
 * Программа расчета идеального веса.
 */
public class Fit {
    /**
     * Идеальный вес для мужщины.
     * @param height Рост в см.
     * @return идеальный вес в кг.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост в см.
     * @return идеальный вес в кг.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}

