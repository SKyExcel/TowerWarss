package towerwar.Event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class IClick implements Listener {
    @EventHandler
    public void onClickInventory(InventoryClickEvent event){
        Player p  = (Player)event.getWhoClicked();


    }
}
