package org.mom47.computerscience;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class App {
	private void calculateDays() {
		IntCalculator daysInJuly;
		IntCalculator daysInJune;
		daysInJuly = new IntCalculator(0);
		daysInJune = new IntCalculator(0);
		daysInJune.add(30);
		daysInJuly.add(31);
		daysInJuly = daysInJune;
		System.out.println("Days in June: " + daysInJune.getValue());
		System.out.println("Days in July: " + daysInJuly.getValue());
	}

	private void calculateHoursAndDayAprilMarch() {
		IntCalculator hoursInApril;
		IntCalculator hoursInMarch;
		IntCalculator hoursInTotalAprilMarch;
		hoursInTotalAprilMarch = new IntCalculator(0);
		hoursInApril = new IntCalculator(0);
		hoursInMarch = new IntCalculator(0);
		hoursInApril.add(30);
		hoursInApril.multiplys(24);
		hoursInMarch.add(31);
		hoursInMarch.multiplys(24);
		System.out.println("Hours in April: " + hoursInApril.getValue());
		System.out.println("Hours im March: " + hoursInMarch.getValue());
		hoursInTotalAprilMarch.add(hoursInApril.getValue() + hoursInMarch.getValue());
		System.out.println("Total hours in March and April: " + hoursInTotalAprilMarch.getValue());
	}

	private void calculatePolyfunction() {
		IntCalculator calculate = new IntCalculator(36);
		calculate.polyfunction(14, 30, 5, 4);
		System.out.println("Polyfunction result: " + calculate.getValue());
	}

	public static void main(String[] args) {
		AnsiConsole.systemInstall();
		Ansi ansi = Ansi.ansi().eraseScreen();
		System.out.println(ansi);

		App app = new App();

		// слудующий две строки - это пример, добавь по смыслу другие строки которые дорисовывают доску 8 на 8
		app.drawHorizontalLine(0, 0, 48);
		app.drawVerticalLine(0, 0, 48);

		AnsiConsole.systemUninstall();
	}

	public void drawVerticalLine(int x, int y, int length) {
		Ansi ansi = Ansi.ansi();

		// тут замени множественные вызовы функций, на цикл с только одним вызовом, задействуй параметры x, y и length

		ansi.cursor(1, 0).fg(Ansi.Color.WHITE).a("#");
		ansi.cursor(2, 0).fg(Ansi.Color.WHITE).a("#");
		ansi.cursor(3, 0).fg(Ansi.Color.WHITE).a("#");
		ansi.cursor(4, 0).fg(Ansi.Color.WHITE).a("#");
		ansi.cursor(5, 0).fg(Ansi.Color.WHITE).a("#");
		ansi.cursor(6, 0).fg(Ansi.Color.WHITE).a("#");
		ansi.cursor(7, 0).fg(Ansi.Color.WHITE).a("#");

		System.out.println(ansi);
	}

	public void drawHorizontalLine(int x, int y, int length) {
		Ansi ansi = Ansi.ansi();

		// тут замени множественные вызовы функций, на цикл с только одним вызовом, задействуй параметры x, y и length

		ansi.cursor(0, 1).fg(Ansi.Color.WHITE).a("# ");
		ansi.cursor(0, 3).fg(Ansi.Color.WHITE).a("# ");
		ansi.cursor(0, 5).fg(Ansi.Color.WHITE).a("# ");
		ansi.cursor(0, 7).fg(Ansi.Color.WHITE).a("# ");
		ansi.cursor(0, 9).fg(Ansi.Color.WHITE).a("# ");
		ansi.cursor(0, 11).fg(Ansi.Color.WHITE).a("# ");
		ansi.cursor(0, 13).fg(Ansi.Color.WHITE).a("# ");

		System.out.println(ansi);
	}
}
