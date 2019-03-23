package towerwar;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import towerwar.Event.PJoin;

public final class TowerWar extends JavaPlugin {

    private TowerWar instance;
    public void onEnable() {
    instance = this;
    registerEvents();
    }

     public void onDisable() {

     }
    public  TowerWar getInstance(){

        return instance;
    }

    private void registerEvents(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PJoin(), this);

    }
}
