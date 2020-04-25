package com.simplegamemode;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils {
    public static String GamemodeText(Player p) {
        return SimpleGamemode.getInstance().getPrefix() + ChatColor.WHITE + "Set game mode "
                + ChatColor.DARK_RED + ChatColor.BOLD + p.getGameMode().name() + ChatColor.WHITE + " for " + p.getDisplayName();
    }
}
