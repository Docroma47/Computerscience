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

		app.drawVerticalLine(0, 0, 1);
		app.drawHorizontalLine(0, 0, 1);
	}

	public void drawHorizontalLine(int x, int y, int length) {
		for (int i = 0; i <= 475; i++, y++, x++) {
			if (y == 0) {
				System.out.print("#");
			} else if (y == 8 * length) {
				length++;
				System.out.print("#");
			} else {
				System.out.print(" ");
			}
		}

		Ansi ansi = Ansi.ansi().eraseScreen();
		ansi.cursor(50, 50).fg(Ansi.Color.RED).a("#");
		ansi.cursor(49, 50).fg(Ansi.Color.RED).a("#");
		ansi.cursor(48, 50).fg(Ansi.Color.RED).a("#");
		AnsiConsole.systemUninstall();
	}

	public void drawVerticalLine(int x,int y,int length) {
		for (int i = 0; i <= 475; i++, y++) {
			if (y == 0) {
				System.out.print(" ");
			} else if (y == 8 * length) {
				length++;
				System.out.print(" ");
			} else {
				System.out.print("#");
			}
		}
	}

}
