package org.mom47.computerscience;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class App {

	// добавить остальные константы для каждого типа фигуры, пример:
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
	// остальные переменные тут.. для всех типов и цветов фигур

	// ♖ │ ♘ │ ♗ │ ♕ │ ♔ │ ♗ │ ♘ │ ♖
	// ♜ │ ♞ │ ♝ │ ♛ │ ♚ │ ♝ │ ♞ │ ♜
	// ♟
	// ♙

	// ROOK - ладья
	// KING - король
	// QUEEN - королева
	// BISHOP - слон
	// KNIGHT - конь
	// PAWN - пешка


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

		printChessDesk();

		printFigures();

		AnsiConsole.systemUninstall();
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

	private static void printChessDesk() {
		Ansi ansi = Ansi.ansi();
		print(15, 15, "          ╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗");
		print(15, 16, "        8 ║   │   │   │   │   │   │   │   ║");
		print(15, 17, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 18, "        7 ║   │   │   │   │   │   │   │   ║");
		print(15, 19, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 20, "        6 ║   │   │   │   │   │   │   │   ║");
		print(15, 21, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 22, "        5 ║   │   │   │   │   │   │   │   ║");
		print(15, 23, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 24, "        4 ║   │   │   │   │   │   │   │   ║");
		print(15, 25, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 26, "        3 ║   │   │   │   │   │   │   │   ║");
		print(15, 27, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 28, "        2 ║   │   │   │   │   │   │   │   ║");
		print(15, 29, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 30, "        1 ║   │   │   │   │   │   │   │   ║");
		print(15, 31, "          ╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝");
		print(15, 32, "            A   B   C   D   E   F   G   H");
	}

	private static void print(int x, int y, String text) {
		Ansi ansi = Ansi.ansi();
		ansi.cursor(y, x).fg(Ansi.Color.WHITE).a(text);
		System.out.println(ansi);
	}

	private static void printFigures() {
		print(43, 16, WHITE_KING);
		print(39, 16, WHITE_QUEEN);
		print(35, 16, WHITE_BISHOP);
		print(31, 16, WHITE_KNIGHT);
		print(27, 16, WHITE_ROOK);
		print(27, 16, WHITE_ROOK);
		print(47, 16, WHITE_BISHOP);
		print(51, 16, WHITE_KNIGHT);
		print(55, 16, WHITE_ROOK);
		print(43, 18, WHITE_PAWN);
		print(39, 18, WHITE_PAWN);
		print(35, 18, WHITE_PAWN);
		print(31, 18, WHITE_PAWN);
		print(27, 18, WHITE_PAWN);
		print(47, 18, WHITE_PAWN);
		print(51, 18, WHITE_PAWN);
		print(55, 18, WHITE_PAWN);
		//BLACK
		print(43, 30, BLACK_KING);
		print(39, 30, BLACK_QUEEN);
		print(35, 30, BLACK_BISHOP);
		print(31, 30, BLACK_KNIGHT);
		print(27, 30, BLACK_ROOK);
		print(27, 30, BLACK_ROOK);
		print(47, 30, BLACK_BISHOP);
		print(51, 30, BLACK_KNIGHT);
		print(55, 30, BLACK_ROOK);
		print(43, 28, BLACK_PAWN);
		print(39, 28, BLACK_PAWN);
		print(35, 28, BLACK_PAWN);
		print(31, 28, BLACK_PAWN);
		print(27, 28, BLACK_PAWN);
		print(47, 28, BLACK_PAWN);
		print(51, 28, BLACK_PAWN);
		print(55, 28, BLACK_PAWN);
	}
}
