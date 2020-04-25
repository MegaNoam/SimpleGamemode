package com.simplegamemode.commands;

import com.simplegamemode.SimpleGamemode;
import com.simplegamemode.Utils;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player))
            return true;

        Player p = (Player) sender;

        switch (args[0]) {
            case "0":
                p.setGameMode(GameMode.SURVIVAL);
                break;
            case "1":
                p.setGameMode(GameMode.CREATIVE);
                break;
            case "2":
                p.setGameMode(GameMode.ADVENTURE);
                break;
            case "3":
                p.setGameMode(GameMode.SPECTATOR);
        }

        p.sendMessage(Utils.GamemodeText(p));
        return true;
    }
}
