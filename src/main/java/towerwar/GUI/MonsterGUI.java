package towerwar.GUI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import towerwar.Tstruct.TStruct;
import towerwar.util.GUIUtil;
import towerwar.util.MonsterManager;

import java.util.Arrays;

public class MonsterGUI {
    public void openInv(Player p){
        Inventory inv = Bukkit.createInventory(null,27,"Summoned Monster");
      //  StockMonster("testtest",5,5,5,5,5,5,5,5,1,inv);

          StockMonster("test",5,5,5,5,5,5,5,5,5,inv);

        p.openInventory(inv);
    }
    public void StockMonster(String name,int code, int data, int cost, int income,int Health, double Speed,int Stock, int Summoned,int Loc,Inventory inv){

        MonsterManager monster = new MonsterManager();
        monster.setParm(name,code,data,cost,income,Health,Speed,Stock,Summoned,Loc);
         GUIUtil.Stack("§e" + monster.getname() , monster.getCode(),monster.getData(),monster.getStock(), Arrays.asList("", "§eCost: §6" + monster.getCost() , "§eIncome: §6+" +monster.getIncome() , "", "§aHealth: §f" + monster.getHealth() , "§aSpeed: §f" + monster.getSpeed() ,"", "§eStock: §6" + monster.getStock() ,"§eSummoned: §6" + monster.getSummoned()) ,5,inv);

    }
}
