package org.mom47.computerscience;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class App {
	private static final String WHITE_KING = "♔";
	private static final String BLACK_KING = "♚";
	private static final String WHITE_QUEEN = "♕";
	private static final String BLACK_QUEEN = "♛";
	private static final String WHITE_ROOK = "♖";
	private static final String BLACK_ROOK = "♜";
	private static final String WHITE_BISHOP = "♗";
	private static final String BLACK_BISHOP = "♝";
	private static final String WHITE_KNIGHT = "♘";
	private static final String BLACK_KNIGHT = "♞";
	private static final String WHITE_PAWN = "♙";
	private static final String BLACK_PAWN = "♟";

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
		printChessDesk(5, 5);
		printFigures(5, 5);
		AnsiConsole.systemUninstall();
		printChessDesk(15, 25);
		printFigures(15, 25);
		printChessDesk(55, 18);
		printFigures(55, 18);
	}

	private static void drawBasicBoard() {
		drawHorizontalLine(15, 15, 63);
		drawHorizontalLine(19, 15, 63);
		drawHorizontalLine(23, 15, 63);
		drawHorizontalLine(27, 15, 63);
		drawHorizontalLine(31, 15, 63);
		drawHorizontalLine(35, 15, 63);
		drawHorizontalLine(39, 15, 63);
		drawHorizontalLine(43, 15, 63);
		drawHorizontalLine(47, 15, 63);
		drawVerticalLine(15, 15, 47);
		drawVerticalLine(15, 21, 47);
		drawVerticalLine(15, 27, 47);
		drawVerticalLine(15, 33, 47);
		drawVerticalLine(15, 39, 47);
		drawVerticalLine(15, 45, 47);
		drawVerticalLine(15, 51, 47);
		drawVerticalLine(15, 57, 47);
		drawVerticalLine(15, 63, 47);
	}

	public static void drawVerticalLine(int x, int y, int length) {
		Ansi ansi = Ansi.ansi();
		for (; x <= length; x++)
		ansi.cursor(x, y).fg(Ansi.Color.WHITE).a("#");
		System.out.println(ansi);
	}

	public static void drawHorizontalLine(int x, int y, int length) {
		Ansi ansi = Ansi.ansi();
		for (; y <= length; y++)
		ansi.cursor(x, y).fg(Ansi.Color.WHITE).a("#");
		System.out.println(ansi);
	}

	private static void printChessDesk(int x, int y) {
		Ansi ansi = Ansi.ansi();
		print(x, y,      "  ╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗");
		print(x, y + 1,  "8 ║   │   │   │   │   │   │   │   ║");
		print(x, y + 2,  "  ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(x, y + 3,  "7 ║   │   │   │   │   │   │   │   ║");
		print(x, y + 4,  "  ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(x, y + 5,  "6 ║   │   │   │   │   │   │   │   ║");
		print(x, y + 6,  "  ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(x, y + 7,  "5 ║   │   │   │   │   │   │   │   ║");
		print(x, y + 8,  "  ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(x, y + 9,  "4 ║   │   │   │   │   │   │   │   ║");
		print(x, y + 10, "  ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(x, y + 11, "3 ║   │   │   │   │   │   │   │   ║");
		print(x, y + 12, "  ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(x, y + 13, "2 ║   │   │   │   │   │   │   │   ║");
		print(x, y + 14, "  ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(x, y + 15, "1 ║   │   │   │   │   │   │   │   ║");
		print(x, y + 16, "  ╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝");
		print(x, y + 17, "    A   B   C   D   E   F   G   H");
	}

	private static void print(int x, int y, String text) {
		Ansi ansi = Ansi.ansi();
		ansi.cursor(y, x).fg(Ansi.Color.WHITE).a(text);
		System.out.println(ansi);
	}

	private static void printFigures(int x, int y) {
		print(x + 20, y + 1, WHITE_KING);
		print(x + 16, y + 1, WHITE_QUEEN);
		print(x + 12, y + 1, WHITE_BISHOP);
		print(x + 8, y + 1, WHITE_KNIGHT);
		print(x + 4, y + 1, WHITE_ROOK);
		print(x + 32, y + 1, WHITE_ROOK);
		print(x + 24, y + 1, WHITE_BISHOP);
		print(x + 28, y + 1, WHITE_KNIGHT);
		print(x + 4, y + 3, WHITE_PAWN);
		print(x + 8, y + 3, WHITE_PAWN);
		print(x + 12, y + 3, WHITE_PAWN);
		print(x + 16, y + 3, WHITE_PAWN);
		print(x + 20, y + 3, WHITE_PAWN);
		print(x + 24, y + 3, WHITE_PAWN);
		print(x + 28, y + 3, WHITE_PAWN);
		print(x + 32, y + 3, WHITE_PAWN);
		print(x + 20, y + 15, BLACK_KING);
		print(x + 16, y + 15, BLACK_QUEEN);
		print(x + 12, y + 15, BLACK_BISHOP);
		print(x + 8, y + 15, BLACK_KNIGHT);
		print(x + 4, y + 15, BLACK_ROOK);
		print(x + 32, y + 15, BLACK_ROOK);
		print(x + 24, y + 15, BLACK_BISHOP);
		print(x + 28, y + 15, BLACK_KNIGHT);
		print(x + 4, y + 13, BLACK_PAWN);
		print(x + 8, y + 13, BLACK_PAWN);
		print(x + 12, y + 13, BLACK_PAWN);
		print(x + 16, y + 13, BLACK_PAWN);
		print(x + 20, y + 13, BLACK_PAWN);
		print(x + 24, y + 13, BLACK_PAWN);
		print(x + 28, y + 13, BLACK_PAWN);
		print(x + 32, y + 13, BLACK_PAWN);
	}
}
