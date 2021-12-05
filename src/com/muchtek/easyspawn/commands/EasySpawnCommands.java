package com.muchtek.easyspawn.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import static org.bukkit.Bukkit.getServer;


public class EasySpawnCommands  implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) { return true; }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("spawn")){
            Location worldspawn = getServer().getWorlds().get(0).getSpawnLocation();
            player.teleport(worldspawn);
            player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "[Server: Teleported you]");
        }
        return true;
    }
}
