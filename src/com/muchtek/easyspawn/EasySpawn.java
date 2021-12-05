package com.muchtek.easyspawn;

import com.muchtek.easyspawn.commands.EasySpawnCommands;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class EasySpawn extends JavaPlugin {

    @Override
    public void onEnable() {
        EasySpawnCommands commands = new EasySpawnCommands();
        getCommand("spawn").setExecutor(commands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[EasySpawn] Plugin loaded successfully!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[EasySpawn] Plugin detached successfully!");
    }

}
