package me.repayed.repayedtools.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemBuilder {
    private ItemStack itemStack;
    private ItemMeta itemMeta;

    public ItemBuilder(Material material) {
        this.itemStack = new ItemStack(material);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder withName(String name) {
        this.itemMeta.setDisplayName(Color.format(name));
        return this;
    }

    public ItemBuilder withHiddenEnchantment() {
        this.itemMeta.addEnchant(Enchantment.LUCK, 1, true);
        this.itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return this;
    }

    public ItemBuilder withLore(String... lore) {
        ArrayList<String> temporaryLoreStorage = new ArrayList<>();

        for(String line : lore) {
            temporaryLoreStorage.add(Color.format(line));
        }
        this.itemMeta.setLore(temporaryLoreStorage);

        return this;
    }

    public ItemStack build() {
        this.itemStack.setItemMeta(this.itemMeta);
        return this.itemStack;
    }


}
