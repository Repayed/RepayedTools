package me.repayed.repayedtools.tools;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public abstract class Tool {
    private String toolIdentificationName;
    private ItemStack item;

    protected Tool(String toolIdentificationName, ItemStack item) {
        this.toolIdentificationName = toolIdentificationName;
        this.item = item;
    }

    public ItemStack getToolItem() {
        return this.item;
    }

    public String getToolIdentificationName() {
        return this.toolIdentificationName;
    }

    public String getToolDisplayName() {
        return this.item.getItemMeta().getDisplayName();
    }

    public Material getToolMaterial() {
        return this.item.getType();
    }

    public abstract void useTool(Location location);
}

