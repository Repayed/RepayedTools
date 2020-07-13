package me.repayed.repayedtools.listeners;

import me.repayed.repayedtools.RepayedTools;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    /*
    TODO:
    - When the commands are done, remove  this class.
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().getInventory().setItemInHand(RepayedTools.getInstance().getToolManager().getTools().get(0).getToolItem());
    }
}
