package me.repayed.repayedtools.tools.types;

import me.repayed.repayedtools.tools.Tool;
import me.repayed.repayedtools.utils.ItemBuilder;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class ExplosivePickaxeTool extends Tool {

    /*
    TODO:
    - Create the item from the configuration.
     */
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

    /*
    TODO:
    - Check if the block is in the blocked blocks (ha get it?) list. If it is then don't remove that block, and continue to the others.
    - Check what way the the player is facing and change the min/max X,Y,Z's since it doesn't work correctly as of now.
    - Make it so the explosion effect only happens if it's allowed in the configuration.
     */
    @Override
    public void useTool(Location location) {
        // Logic for player facing up
//        final int minX = location.getBlockX() - 1;
//        final int maxX = location.getBlockX() + 2;
//
//        final int minY = location.getBlockY();
//        final int maxY = location.getBlockY() + 3;
//
//        final int minZ = location.getBlockZ() - 1;
//        final int maxZ = location.getBlockZ() + 2;
//
//        for(int i = minX; i < maxX; i++) {
//            for(int j = minY; j < maxY; j++) {
//                for(int k = minZ; k < maxZ; k++) {
//                    Block block = location.getWorld().getBlockAt(i, j, k);
//                    block.setType(Material.AIR);
//                }
//            }
//        }
        // Logic for player facing down
//        final int minX = location.getBlockX() - 1;
//        final int maxX = location.getBlockX() + 2;
//
//        final int minY = location.getBlockY() - 2;
//        final int maxY = location.getBlockY() + 1;
//
//        final int minZ = location.getBlockZ() - 1;
//        final int maxZ = location.getBlockZ() + 2;
//
//        for(int i = minX; i < maxX; i++) {
//            for(int j = minY; j < maxY; j++) {
//                for(int k = minZ; k < maxZ; k++) {
//                    Block block = location.getWorld().getBlockAt(i, j, k);
//                    block.setType(Material.AIR);
//                }
//            }
//        }

        location.getWorld().createExplosion(location, 0.0F);
    }

}
