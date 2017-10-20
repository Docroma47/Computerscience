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
        Enter
    };

    public static void main(String[] args) throws IOException {

        KeyMap map = new KeyMap();
        map.bind(Action.Up, "[A");
        map.bind(Action.Left, "[D");
        map.bind(Action.Right, "[C");
        map.bind(Action.Down, "[B");
        map.bind(Action.Enter, "\r");

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
