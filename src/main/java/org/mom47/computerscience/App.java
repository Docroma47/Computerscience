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
		drawHorizontalLine(0, 0, 50);
		drawHorizontalLine(5, 0, 50);
		drawHorizontalLine(9, 0, 50);
		drawHorizontalLine(13, 0, 50);
		drawHorizontalLine(17, 0, 50);
		drawHorizontalLine(21, 0, 50);
		drawVerticalLine(0, 0, 20);
		drawVerticalLine(0, 8, 20);
		drawVerticalLine(0, 14, 20);
		drawVerticalLine(0, 20, 20);
		drawVerticalLine(0, 26, 20);
		drawVerticalLine(0, 32, 20);
		drawVerticalLine(0, 38, 20);
		drawVerticalLine(0, 44, 20);
		drawVerticalLine(0, 50, 21);
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