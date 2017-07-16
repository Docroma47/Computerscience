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

		app.drawHorizontalLine(1, 0, 49);
		drawHorizontalLine(5, 0, 49);
		drawHorizontalLine(9, 0, 49);
		drawHorizontalLine(13, 0, 49);
		drawHorizontalLine(17, 0, 49);
		drawHorizontalLine(21, 0, 49);
		drawHorizontalLine(25, 0, 49);
		drawHorizontalLine(29, 0, 49);
		drawHorizontalLine(33, 0, 49);
		app.drawVerticalLine(0, 0, 33);
		drawVerticalLine(0, 6, 33);
		drawVerticalLine(0, 13, 33);
		drawVerticalLine(0, 19, 33);
		drawVerticalLine(0, 25, 33);
		drawVerticalLine(0, 31, 33);
		drawVerticalLine(0, 37, 33);
		drawVerticalLine(0, 43, 33);
		drawVerticalLine(0, 49, 33);
		AnsiConsole.systemUninstall();
	}

	public static void drawVerticalLine(int x, int y, int length) {
		Ansi ansi = Ansi.ansi();
		for (x = 0; x <= length; x++)
		ansi.cursor(x, y).fg(Ansi.Color.WHITE).a("#");
		System.out.println(ansi);
	}

	public static void drawHorizontalLine(int x, int y, int length) {
		Ansi ansi = Ansi.ansi();
		for (y = 0; y <= length; y++)
		ansi.cursor(x, y).fg(Ansi.Color.WHITE).a("#");
		System.out.println(ansi);
	}
}