package me.repayed.repayedtools;

import me.repayed.repayedtools.listeners.BlockBreakListener;
import me.repayed.repayedtools.listeners.PlayerJoinListener;
import me.repayed.repayedtools.tools.ToolManager;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class RepayedTools extends JavaPlugin {
    private static RepayedTools instance;
    private ToolManager toolManager;

    @Override
    public void onEnable() {
        instance = this;
        toolManager = new ToolManager();
        registerListeners();
    }

    @Override
    public void onDisable() {

    }

    public static RepayedTools getInstance() {
        return instance;
    }

    public ToolManager getToolManager() {
        return this.toolManager;
    }

    private void registerListener(Listener listener) {
        getServer().getPluginManager().registerEvents(listener,this);
    }

    private void registerListeners() {
        registerListener(new BlockBreakListener());
        registerListener(new PlayerJoinListener());
    }

    private void loadCommands() {

    }

    // PS: I love OOP :D
}
