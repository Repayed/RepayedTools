package me.repayed.repayedtools.commands.model;

import me.repayed.repayedtools.commands.tools.ToolsCommand;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommandManager implements CommandExecutor {

    private Set<Command> commands = new HashSet<>();

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        setCommands();

        Iterator<Command> iterator = this.commands.iterator();
        while(iterator.hasNext()) {
            if(command.getName().equalsIgnoreCase(iterator.next().getCommandName())) {
                if(!(sender instanceof Player)) {
                    sender.sendMessage("RepayedTools - Only players may use this command.");
                } else {
                    Player player = (Player) sender;

                    if(args.length == 0) {

                    }
                }
            }
        }

        return false;
    }

    private void setCommands() {
        this.commands.add(ToolsCommand.getInstance());
    }
}
