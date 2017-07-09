package org.mom47.computerscience;

/**
 * Hello world!
 *
 */
public class App {

    public static String message = "Rome is a good guy!";
	public static int intVariable = 1;

	public static long longVariable = 120;
	public static char charVariable = 2;
	public static boolean booleanVariable1 = true;
	public static boolean booleanVariable2 = false;
	public static short shortVariable = 55;
	public static double doubleVariable1 = 0.42;
	public static double doubleVariable2 = -0.85;
	public static float floatVariable = 0.6861f;

    public static void main(String[] args) {
		App app = new App();
		app.printInt();
		app.printLong();
    	// создать экземпляр (объект) класса App
		// вызвать у объекта функцию printInt
    }

	public void printInt() {
		System.out.println(intVariable);
	}

	public void printLong() {
		System.out.println(longVariable);
	}

	// Добавить новые функции для каждой переменной, каждая из которой выводит на консоль свою переменную (пример printInt)
	// Назвать каждую функцию в соответствии с именем переменной (см пример printInt)
}
