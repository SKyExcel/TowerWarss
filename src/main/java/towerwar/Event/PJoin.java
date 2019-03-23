package towerwar.Event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import towerwar.Tstruct.TStruct;

public class PJoin implements Listener {

    public Player p;
    public TStruct v = new TStruct(p);
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        p = event.getPlayer();

        v.addPlayer();
        p.sendMessage("Your Gold" + v.getGold());

    }
}

