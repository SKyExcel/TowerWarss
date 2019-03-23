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

     //     StockMonster("test",5,5,5,5,5,5,5,5,5,inv);
        StockMonster("SilverFish",97,0,5,1,5,2,5,0,0,p,inv);
        StockMonster("Chiken",344,0,10,2,40,3,5,0,1,p,inv);
        StockMonster("Sheep",35,0,22,4,88,2.5,5,0,2,p,inv);
        StockMonster("Cave Spider",375,0,50,8,200,3.5,5,0,3,p,inv);
        StockMonster("Wolf",352,0,100,14,400,4,5,0,4,p,inv);


        p.openInventory(inv);
    }
    public void StockMonster(String name,int code, int data, int cost, int income,int Health, double Speed,int Stock, int Summoned,int Loc,Player player,Inventory inv){

        MonsterManager monster = new MonsterManager();
        monster.setParm(name,code,data,cost,income,Health,Speed,Stock,Summoned, false,Loc);
        Monsterparm(player,monster, inv);

    }

    public void Monsterparm(Player player,MonsterManager monster , Inventory inv){

        TStruct v = new TStruct(player);

        if(v.GoldMap.get(player).getGold() >= monster.getCost()){
            if(monster.getAutoSummon() == true){

                GUIUtil.Stack("§e" + monster.getname() , monster.getCode(),monster.getData(),monster.getStock(), Arrays.asList("", "§eCost: §6" + monster.getCost() , "§eIncome: §6+" +monster.getIncome() , "", "§aHealth: §f" + monster.getHealth() , "§aSpeed: §f" + monster.getSpeed() ,"", "§eStock: §6" + monster.getStock() ,"§eSummoned: §6" + monster.getSummoned(), "","§aAuto-summon by: §b" ,"§cRight-click  to disable by:" + player.getName()) ,monster.getLoc(),inv);

            } else{

                GUIUtil.Stack("§e" + monster.getname() , monster.getCode(),monster.getData(),monster.getStock(), Arrays.asList("", "§eCost: §6" + monster.getCost() , "§eIncome: §6+" +monster.getIncome() , "", "§aHealth: §f" + monster.getHealth() , "§aSpeed: §f" + monster.getSpeed() ,"", "§eStock: §6" + monster.getStock() ,"§eSummoned: §6" + monster.getSummoned(), "","§aRight-click to enable auto-summon!") ,monster.getLoc(),inv);

            }
        } else{
            GUIUtil.Stack("§e" + monster.getname() , 166,monster.getData(),monster.getStock(), Arrays.asList("", "§eCost: §6" + monster.getCost() , "§eIncome: §6+" +monster.getIncome() , "", "§aHealth: §f" + monster.getHealth() , "§aSpeed: §f" + monster.getSpeed() ,"", "§eStock: §6" + monster.getStock() ,"§eSummoned: §6" + monster.getSummoned(), "","§aRight-click to enable auto-summon!") ,monster.getLoc(),inv);

        }


    }

}
