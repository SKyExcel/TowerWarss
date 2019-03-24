package towerwar.Event;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
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
        int code = item.getTypeId();

        if(title.equals("Summoned Monster")){
            if(code  != 0){
                if(code == 97){
                    SilverFish fish = new SilverFish(p);
                    fish.spawn(loc ,1);
                }
            }
        }

    }
}
