package towerwar.util;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.List;

public class GUIUtil {

    public static void Stack(String Display, int ID, int  DATA, int STACK, List<String> lore, int loc, Inventory inv) {
        org.bukkit.inventory.ItemStack item = new MaterialData(ID, (byte)DATA).toItemStack(STACK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Display);
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(loc, item);
    }
}
