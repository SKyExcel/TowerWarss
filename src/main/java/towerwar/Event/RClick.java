package towerwar.Event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import towerwar.GUI.MonsterGUI;
import towerwar.util.GUIUtil;

public class RClick implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent event){
        Action action = event.getAction();
        Player player = event.getPlayer();

        if(action.equals(Action.RIGHT_CLICK_AIR)){
            MonsterGUI monster = new MonsterGUI();
            monster.openInv(player);
        }
    }
}
