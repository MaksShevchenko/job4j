package ru.job4j.calculate;
/**
* Class Calculate решение задачи части 001 урок1.
* @author Maks Shevchenko (sheva.maks@gmail.com)
* @since 25.03.2019
*/
public class Calculate {
	/**
	* Медот для тестирования.
	* @param value строка для вывода в консоль
	* @return String value.
	*/
   public String echo(String value) {
	return String.format("%s %s %s", value, value, value);
}
/**
* Main.
* @param args - args.
*/
public static void main (String[] args) {
	 Calculate calc = new Calculate();
	 System.out.println(calc.echo("ahh"));
	 }
}	 