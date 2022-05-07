package net.pistonmaster.playtimegiveaway;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PlaytimeGiveawayCommand implements CommandExecutor {
    private final PlaytimeGiveaway plugin;

    public PlaytimeGiveawayCommand(PlaytimeGiveaway plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
            return false;
        } else {
            sender.sendMessage(ChatColor.AQUA.toString() + plugin.getConfig().getInt(sender.getName()) + " seconds of playtime");
            return true;
        }
    }
}
