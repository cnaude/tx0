/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cnaude.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author cnaude
 */
public class tx0Command implements CommandExecutor {
        
    private final tx0 plugin;
    
    public tx0Command(tx0 instance) {
        this.plugin = instance;
    }
    
     @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        
        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (commandLabel.equalsIgnoreCase("tx0")) {
                if (args.length == 1) {
                    this.plugin.translateURL(args[0],ChatColor.RED + p.getName());
                    return true;
                }
            }

        } else {
            if (commandLabel.equalsIgnoreCase("tx0")) {
                if (args.length == 1) {
                    this.plugin.translateURL(args[0],ChatColor.LIGHT_PURPLE + "[CONSOLE]");
                    return true;
                }
            }
        }
        return false;
    }
}
