package towerwar;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import towerwar.Event.PJoin;
import towerwar.Event.RClick;
import towerwar.Tstruct.TStruct;

import java.util.HashMap;
import java.util.Map;

public final class TowerWar extends JavaPlugin {

    public static TowerWar instance;
    public Map<Player, TStruct> Value = new HashMap<>();

    public void onEnable() {
    instance = this;
    registerEvents();
    }

     public void onDisable() {

     }


    private void registerEvents(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PJoin(), this);
        pm.registerEvents(new RClick(), this);

    }
}
