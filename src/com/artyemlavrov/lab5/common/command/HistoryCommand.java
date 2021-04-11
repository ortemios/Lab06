package com.artyemlavrov.lab5.common.command;

import com.artyemlavrov.lab5.common.interpreter.InterpreterData;
import com.artyemlavrov.lab5.common.interpreter.InterpreterLoop;
import com.artyemlavrov.lab5.common.io.IOManager;

import java.util.List;

public class HistoryCommand extends Command {

    @Override
    public void execute(InterpreterLoop interpreterLoop, IOManager ioManager) {
        InterpreterData interpreterData = interpreterLoop.getInterpreterData();
        List<String> history = interpreterData.getHistory(6);
        for (String entry : history) {
            ioManager.writeLine(entry);
        }
    }

    @Override
    public String getDescription() {
        return ": вывести последние 6 команд (без их аргументов)";
    }

    @Override
    public String getName() {
        return "history";
    }
}