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
		print(15, 22, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 22, "        4 ║   │   │   │   │   │   │   │   ║");
		print(15, 22, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 22, "        3 ║   │   │   │   │   │   │   │   ║");
		print(15, 22, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 22, "        2 ║   │   │   │   │   │   │   │   ║");
		print(15, 22, "          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		print(15, 22, "        1 ║   │   │   │   │   │   │   │   ║");
		print(15, 22, "          ╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝");
		print(15, 22, "            A   B   C   D   E   F   G   H");
		// перевести вывод доски на использование метода print
		// пример
		// Ansi ansi = Ansi.ansi();
		// print(12, 1, "╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗"); (координыты 12, 1 - только для примера, подбери правельные)
		// и т.д.

		System.out.println("          ╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗");
		System.out.println("        8 ║   │   │   │   │   │   │   │   ║");
		System.out.println("          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		System.out.println("        7 ║   │   │   │   │   │   │   │   ║");
		System.out.println("          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		System.out.println("        6 ║   │   │   │   │   │   │   │   ║");
		System.out.println("          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		System.out.println("        5 ║   │   │   │   │   │   │   │   ║");
		System.out.println("          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		System.out.println("        4 ║   │   │   │   │   │   │   │   ║");
		System.out.println("          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		System.out.println("        3 ║   │   │   │   │   │   │   │   ║");
		System.out.println("          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		System.out.println("        2 ║   │   │   │   │   │   │   │   ║");
		System.out.println("          ╟───┼───┼───┼───┼───┼───┼───┼───╢");
		System.out.println("        1 ║   │   │   │   │   │   │   │   ║");
		System.out.println("          ╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝");
		System.out.println("            A   B   C   D   E   F   G   H");
	}								// ♖ │ ♘ │ ♗ │ ♕ │ ♔ │ ♗ │ ♘ │ ♖

	private static void print(int x, int y, String text) {
		AnsiConsole.systemInstall();

		Ansi ansi = Ansi.ansi();
		print(10, 10, "ХАХА!! ТЕКСТ!");

		AnsiConsole.systemUninstall();

		System.out.println(ansi);
		// напечатать на консоль произволный текст по координатам x, y с помощью Ansi библиотеки

		// не забывай в конце вызывать System.out.println(ansi); иначе ничего печататься не будет
	}

	private static void printFigures() {

		// напечатать фигуры на доске с помощью метода print, пример (координыи 13 и 2 - только для примера, подебери правильные)

		print(15, 43, WHITE_KING);
		print(15, 39, WHITE_QUEEN);
		print(15, 35, WHITE_BISHOP);
		print(15, 31, WHITE_KNIGHT);
		print(15, 27, WHITE_ROOK);
		print(15, 47, WHITE_BISHOP);
		print(15, 51, WHITE_KNIGHT);
		print(15, 43, WHITE_PAWN);
		print(15, 39, WHITE_PAWN);
		print(15, 35, WHITE_PAWN);
		print(15, 31, WHITE_PAWN);
		print(15, 27, WHITE_PAWN);
		print(15, 47, WHITE_PAWN);
		print(15, 51, WHITE_PAWN);
		// print... - все остальные фигуры
	}
}// ♖ │ ♘ │ ♗ │ ♕ │ ♔ │ ♗ │ ♘ │ ♖
