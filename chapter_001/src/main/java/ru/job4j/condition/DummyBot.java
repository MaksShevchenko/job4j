package ru.job4j.condition;

/**
 * Class DummyBot - задание 4.1. Глупый бот.[#122774]
 * @author Maks Shevchenko (sheva.maks@gmail.com)
 * @since 14.04.2019
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет,умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}

