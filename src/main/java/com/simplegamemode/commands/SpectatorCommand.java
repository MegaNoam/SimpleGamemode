package com.simplegamemode.commands;

import com.simplegamemode.SimpleGamemode;
import com.simplegamemode.Utils;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpectatorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player))
            return true;

        Player p = (Player) sender;
        p.setGameMode(GameMode.SPECTATOR);
        p.sendMessage(Utils.GamemodeText(p));
        return true;
    }
}
