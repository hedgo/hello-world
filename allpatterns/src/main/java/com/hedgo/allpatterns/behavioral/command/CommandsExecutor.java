package com.hedgo.allpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandsExecutor {
    private List<Command> commandsList = new ArrayList<Command>();

    public void addCommand(Command command) {
        commandsList.add(command);
    }

    public void runAllCommands() {
        for (Command c : commandsList) {
            c.execute();
        }
        commandsList.clear();
    }

}
