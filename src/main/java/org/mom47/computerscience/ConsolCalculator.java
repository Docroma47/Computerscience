package org.mom47.computerscience;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import org.jline.keymap.BindingReader;
import org.jline.keymap.KeyMap;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.Console;
import java.io.IOException;


public class ConsolCalculator {

    enum Action {
        Up,
        Left,
        Right,
        Down,
        Enter,
        Escape
    }

    public static void main(String[] args) throws IOException {

        KeyMap map = new KeyMap();
        map.bind(Action.Up, "\033[A");
        map.bind(Action.Left, "\033[D");
        map.bind(Action.Right, "\033[C");
        map.bind(Action.Down, "\033[B");
        map.bind(Action.Enter, "\r");
        map.bind(Action.Escape, "\033");

        Console console = System.console();
        Terminal terminal = TerminalBuilder.terminal();
        terminal.enterRawMode();
        BindingReader reader = new BindingReader(terminal.reader());

        AnsiConsole.systemInstall();
        System.out.println(Ansi.ansi().reset().eraseScreen());
        if (console != null) {
            while (true) {
                Action action = (Action) reader.readBinding(map);
                System.out.println(Ansi.ansi().cursor(10, 1).fg(Ansi.Color.WHITE).a(action + "    "));
            }
        }
    }
}