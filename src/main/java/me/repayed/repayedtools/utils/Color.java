package me.repayed.repayedtools.utils;

import org.bukkit.ChatColor;

public class Color {

    public static String format(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
