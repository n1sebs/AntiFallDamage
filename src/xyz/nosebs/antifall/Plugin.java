package xyz.nosebs.antifall;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new FallListener(), this);
    }
}
