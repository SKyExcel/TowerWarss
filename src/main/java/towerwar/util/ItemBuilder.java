package towerwar.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {
    private ItemStack itemStack;

    public ItemBuilder() {
        this.itemStack = new ItemStack(Material.AIR);
    }

    public ItemBuilder setType(Material type) {
        itemStack.setType(type);
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        itemStack.setAmount(amount);
        return this;
    }

    public ItemBuilder setDurability(short durability) {
        itemStack.setDurability(durability);
        return this;
    }

    public ItemBuilder setData(MaterialData data) {
        itemStack.setData(data);
        return this;
    }

    public ItemBuilder setDisplayName(String name) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(name);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLocalizedName(String name) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.setLocalizedName(name);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder clearLore() {
        ItemMeta meta = itemStack.getItemMeta();
        meta.setLore(null);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder addLore(String toAdd) {
        ItemMeta meta = itemStack.getItemMeta();
        List<String> lore = meta.getLore();
        if(lore == null) lore = new ArrayList<>();
        if(toAdd != null)
            lore.add(toAdd);

        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder addLore(String... toAdd) {
        ItemMeta meta = itemStack.getItemMeta();
        List<String> lore = meta.getLore();
        if(lore == null) lore = new ArrayList<>();
        for (int i = 0; i < toAdd.length; i++) {
            if(toAdd[i] != null)
                lore.add(toAdd[i]);
        }
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder addLore(List<String> toAdd) {
        ItemMeta meta = itemStack.getItemMeta();
        List<String> lore = meta.getLore();
        if(lore == null) lore = new ArrayList<>();
        for (String lr : toAdd) {
            if(lr != null) lore.add(lr);
        }
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLore(List<String> lore) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder removeLore(int index) {
        ItemMeta meta = itemStack.getItemMeta();
        List<String> lore = meta.getLore();
        lore.remove(index);
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder addEnchant(Enchantment ench, int level, boolean ignoreLevelRestriction) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.addEnchant(ench, level, ignoreLevelRestriction);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder removeEnchant(Enchantment ench) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.removeEnchant(ench);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder addItemFlags(ItemFlag... itemFlags) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.addItemFlags(itemFlags);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder removeItemFlags(ItemFlag... itemFlags) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.removeItemFlags(itemFlags);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable) {
        ItemMeta meta = itemStack.getItemMeta();
        meta.setUnbreakable(unbreakable);
        itemStack.setItemMeta(meta);
        return this;
    }

    public ItemStack build() {
        return itemStack;
    }
}
