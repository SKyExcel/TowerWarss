package towerwar.Event;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import towerwar.TowerWar;
import towerwar.Tstruct.TStruct;
import towerwar.monster.SilverFish;

import java.util.Vector;

public class IClick implements Listener {
    @EventHandler
    public void onClickInventory(InventoryClickEvent event){
        Player p  = (Player)event.getWhoClicked();
        String title = event.getInventory().getTitle();
        ItemStack item = event.getCurrentItem();
        TStruct v = new TStruct(p);
        Location loc ;
        loc  = new Location(p.getWorld(),5,5,5);

        if(title.equals("Summoned Monster")){
            switch (event.getCurrentItem().getItemMeta().getDisplayName()){
                case "§eSilverFish":
                        SilverFish fish = new SilverFish(p);
                        if(TowerWar.instance.Value.get(p).getStock() != 0){
                            fish.spawn(loc,1);
                        }  else{
                            p.sendMessage("§cNot enough monsters in stock!");

                        }
                 event.setCancelled(true);
                    break;
                    default:

                        break;
            }
        }

    }
}
