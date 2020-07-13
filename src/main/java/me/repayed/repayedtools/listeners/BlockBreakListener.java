package me.repayed.repayedtools.listeners;

import me.repayed.repayedtools.RepayedTools;
import me.repayed.repayedtools.tools.Tool;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreakListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (event.getPlayer().getItemInHand() != null) {
            if (event.getPlayer().getItemInHand().hasItemMeta()) {
                ItemStack itemInHand = event.getPlayer().getItemInHand();
                for (Tool tool : RepayedTools.getInstance().getToolManager().getTools()) {
                    if (itemInHand.getType() == tool.getToolItem().getType() && itemInHand.getItemMeta().getDisplayName().equalsIgnoreCase(tool.getToolItem().getItemMeta().getDisplayName())) {
                        tool.useTool(event.getBlock().getLocation());
                    }
                }
            }
        }
    }
}
