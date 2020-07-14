package me.repayed.repayedtools.commands.model;

import java.util.Set;

public abstract class Command {
    private String commandName;
    private Set<SubCommand> subCommands;

    public Command(String commandName, Set<SubCommand> subCommands) {
        this.commandName = commandName;
        this.subCommands = subCommands;
    }

    public String getCommandName() {
        return this.commandName;
    }

    public Set<SubCommand> getSubCommands() {
        return this.subCommands;
    }
}
