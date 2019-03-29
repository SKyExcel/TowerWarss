package towerwar.GUI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import towerwar.TowerWar;
import towerwar.Tstruct.TStruct;
import towerwar.tower.TowerType;
import towerwar.util.ItemBuilder;

import java.util.Locale;

public class TowerGUI {

    public static void openGui(Player player) {

        Inventory towergui = Bukkit.createInventory(null, 9*6, "Place Tower");
        TStruct playerData = TowerWar.instance.Value.get(player);
/*
        for (TowerType towerType : TowerType.values()) {
            ItemStack is = new ItemBuilder()
                    .setType(towerType.getDisplayItem())
                    .setDisplayName("§e" + towerType.getInstance().getName())
                    .addLore("")
                    .addLore(String.format(Locale.US, "§eCost: §6%d", towerType.getInstance().getCost()))
                    .build();

            towergui.setItem(towerType.getSlot(), is);
        }
*/
        player.openInventory(towergui);
    }

}
