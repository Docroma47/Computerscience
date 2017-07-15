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
		App app = new App();
		app.drawVerticalLine(00, 00,48);
		app.drawVerticalLine(06, 06, 48);
	}

	public void drawVerticalLine(int x, int y, int length) {
		for (y = 0; y < length; y++) {
			System.out.print("#");
		}

		AnsiConsole.systemInstall();
		Ansi ansi = Ansi.ansi().eraseScreen();
		ansi.cursor(00, 00).fg(Ansi.Color.RED).a("#");
		ansi.cursor(02, 03).fg(Ansi.Color.RED).a("#"+1);
		ansi.cursor(00, 16).fg(Ansi.Color.RED).a("#"+3);
		System.out.println(ansi.reset());
		AnsiConsole.systemUninstall();
	}
}
