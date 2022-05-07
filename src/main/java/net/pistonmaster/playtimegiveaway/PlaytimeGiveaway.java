package net.pistonmaster.playtimegiveaway;

import org.bukkit.plugin.java.JavaPlugin;

public final class PlaytimeGiveaway extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();

        getCommand("playtimegiveaway").setExecutor(new PlaytimeGiveawayCommand(this));

        getServer().getScheduler().scheduleSyncRepeatingTask(this, () -> {
                    getServer().getOnlinePlayers().forEach(player ->
                            getConfig().set(player.getName(), getConfig().getInt(player.getName()) + 30)
                    );
                    saveConfig();
                },
                20L * 30, 20L * 30);
    }
}
