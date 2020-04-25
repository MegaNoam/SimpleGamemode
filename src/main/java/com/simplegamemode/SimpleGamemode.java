package com.simplegamemode;

import com.simplegamemode.commands.*;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleGamemode extends JavaPlugin {

    @Getter private String prefix;
    @Getter private static SimpleGamemode instance;

    @Override
    public void onEnable() {
        SimpleGamemode.instance = this;
        prefix();
        registerCommands();
        getLogger().info("Enable Complete");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disable Complete");
    }

    private void prefix(){
        this.prefix = "" + ChatColor.GOLD + ChatColor.BOLD + "GAMEMODE > " + ChatColor.RESET;
    }

    private void registerCommands() {
        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("creative").setExecutor(new CreativeCommand());
        getCommand("survival").setExecutor(new SurvivalCommand());
        getCommand("adventure").setExecutor(new AdventureCommand());
        getCommand("spectator").setExecutor(new SpectatorCommand());
    }
}