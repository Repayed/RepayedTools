package me.repayed.repayedtools.tools.types;

import me.repayed.repayedtools.tools.Tool;
import me.repayed.repayedtools.utils.ItemBuilder;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class ExplosivePickaxeTool extends Tool {

    public ExplosivePickaxeTool() {
        super("ExplosivePickaxe",
                new ItemBuilder(Material.DIAMOND_PICKAXE)
                        .withName("&cExplosive Pickaxe")
                        .withHiddenEnchantment()
                        .withLore("&7An explosive pickaxe which mines a &43x3&7 radius.",
                                "",
                                "&7Want to get another one? Check out our store",
                                "&8- &7store.gyrenetwork.net")
                        .build());
    }

    @Override
    public void useTool(Location location) {
        final int minX = location.getBlockX() - 1;
        final int maxX = location.getBlockX() + 2;

        final int minY = location.getBlockY() - 2;
        final int maxY = location.getBlockY() + 2;

        final int minZ = location.getBlockZ() - 1;
        final int maxZ = location.getBlockZ() + 1;

        for(int i = minX; i < maxX; i++) {
            for(int j = minY; j < maxY; j++) {
                for(int k = minZ; k < maxZ; k++) {
                    Block block = location.getWorld().getBlockAt(i, j, k);
                    block.setType(Material.AIR);
                }
            }
        }

        location.getWorld().createExplosion(location, 0.0F);
    }
}