package towerwar.GUI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import towerwar.monster.SilverFish;
import towerwar.util.GUIUtil;
import towerwar.manager.MonsterManager;

import java.util.Arrays;

public class MonsterGUI {
    public void openInv(Player p){
         Inventory inv = Bukkit.createInventory(null,27,"Summoned Monster");
         StockMonster(inv , p);

        p.openInventory(inv);
    }
    public void StockMonster(Inventory inv ,Player player){

        SilverFish fish = new SilverFish(player);
        fish.Stack(inv);

    }


}
