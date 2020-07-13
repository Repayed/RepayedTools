package me.repayed.repayedtools.listeners;

import me.repayed.repayedtools.RepayedTools;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().getInventory().setItemInHand(RepayedTools.getInstance().getToolManager().getTools().get(0).getToolItem());
    }
}
