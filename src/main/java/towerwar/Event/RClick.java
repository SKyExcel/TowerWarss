package towerwar.Event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import towerwar.GUI.MonsterGUI;
import towerwar.GUI.TowerGUI;
import towerwar.util.GUIUtil;

public class RClick implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent event){
        Action action = event.getAction();
        Player player = event.getPlayer();
        String itemName = player.getItemInHand().getItemMeta().getDisplayName();
        if(action.equals(Action.RIGHT_CLICK_AIR)){

            switch (itemName){
                case "§eSummon monsters!":
                    MonsterGUI monster = new MonsterGUI();
                    monster.openInv(player);
                    break;
                case "§eClick to place a tower":
                    TowerGUI.openGui(player);
                    break;

                default:
                    break;
            }

        }
    }
}
