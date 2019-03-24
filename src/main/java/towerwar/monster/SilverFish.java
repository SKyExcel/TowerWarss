package towerwar.monster;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import towerwar.TowerWar;
import towerwar.Tstruct.TStruct;
import towerwar.manager.Monster;
import towerwar.util.GUIUtil;

import java.util.Arrays;

public class SilverFish implements Monster {
    private TStruct.Team team;
    private String name = "SilverFish";
    private int Level;
    private Location loc = null;
    private int specialization = 0;
    private int Stock = 5;
    private int[] Cost = {5};
    private int[] Income = {1};
    private int[] Health = {5};
    private double[] Speed = {2.0};
    private Player player;
    private int Summend;
    public SilverFish(Player player){
        this.player = player;
    }
    @Override
    public int getStock() {
        return Stock;
    }

    @Override
    public int getCost() {
        return Cost[Level + specialization];
    }

    @Override
    public int getIncome() {
        return Income[Level + specialization];
    }

    @Override
    public double getSpeed() {
        return Speed[Level];
    }

    @Override
    public int getLevel() {
        return Level;
    }

    @Override
    public int getHealth() {
        return Health[Level + specialization];
    }

    @Override
    public int getSummend() {
        return Summend ;
    }

    @Override
    public void spawn(Location loc, int Level) {
        if(TowerWar.instance.Value.get(player).getGold() >= 200){

        }
     }

    @Override
    public void onDeath() {
     }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Stack(Inventory inv) {
        GUIUtil.Stack("§e" + getName(),97,0,getStock(), Arrays.asList("" ,"§eCost: §6" + getCost() , "§eIncome: §6+" + getIncome() , "" , "§aHealth: §f" + getHealth() , "§aSpeed: §f" + getSpeed() , "§eSummoned: §6" + getSummend()),0,inv);
    }
}
