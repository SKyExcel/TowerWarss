package towerwar.Event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import towerwar.TowerWar;
import towerwar.Tstruct.TStruct;



public class PJoin implements Listener {

    public Player p;
     public TStruct v = new TStruct(p);
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        p = event.getPlayer();
        TowerWar.instance.Value.put(p,v);
        v.addPlayer();
        p.sendMessage("Your Gold" + v.getGold());
        p.getInventory().clear();
        ItemStack monster = new ItemStack(Material.NETHER_STAR);
         ItemMeta monsterm = monster.getItemMeta();
        monsterm.setDisplayName("§eSummon monsters!");
        monster.setItemMeta(monsterm );
         p.getInventory().setItem(2,monster);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(TowerWar.instance, new Runnable() {
            @Override
            public void run() {
                if(v.getStock() == 0){
                    if(v.getStock() != 5){
                        v.addStock();
                    }
                } else {
                    if (v.getStock() != 5) {
                        v.addStock();
                    }
                }
             }
        },40,40);

    }
}

