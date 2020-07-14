package me.repayed.repayedtools.commands.tools;

import me.repayed.repayedtools.commands.model.Command;
import me.repayed.repayedtools.commands.model.SubCommand;

import java.util.HashSet;
import java.util.Set;

public class ToolsCommand extends Command {

    private static ToolsCommand instance;
    Set<SubCommand> subCommands = new HashSet<>();

    public ToolsCommand() {
        super(commandName, subCommands);
        instance = this;
    }

    private Set<SubCommand> setSubCommands() {
        this.subCommands.add()
    }

    public static ToolsCommand getInstance() {
        return instance;
    }
}
