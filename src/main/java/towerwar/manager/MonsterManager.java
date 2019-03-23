package towerwar.manager;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import towerwar.Tstruct.TStruct;
import towerwar.util.GUIUtil;

import java.util.Arrays;
import java.util.List;

public class MonsterManager {
        private String name;
        private int code;
        private int data;
        private int cost;
        private int income;
        private int Health;
        private double Speed;
        private int Stock;
        private int Summoned;
        private int Loc;
        private boolean AutoSummon;
        private List<String> lore;

        public String getname(){ return name; }
        public int getCode(){return code;}
        public int getData(){return data;}
        public int getCost(){return cost;}
        public int getIncome(){return  income; }
        public int getHealth(){return Health;}
        public double getSpeed(){return Speed;}
        public int getStock(){return Stock;}
        public int getSummoned(){return Summoned;}
        public int getLoc(){return Loc;}
        public void setLore(List<String> newLore){this.lore = newLore;}
        public boolean getAutoSummon(){return AutoSummon;}

        public void Stack(Inventory inv){

        switch (name){
            case "SilverFish":
            DefaultItem(inv);
                break;
            case "Chicken":
                DefaultItem(inv);

                break;
            case "Zombie":
                 Item(Arrays.asList("") , inv);
                break;
            case "Wolf":

                break;
            case "BlackSpider":

                break;
            case "Leather Zombie":

                break;
            case "Rabbit":

                break;
            case "Priest":

                break;
            case "Wild cat":

                break;
            case "Creeper":

                break;
            case "Ghast":

                break;
            default:

                break;
        }

        }
        public void DefaultItem(Inventory inv){
            Item(Arrays.asList("",
                    "§eCost: §6" + getCost() ,
                    "§eIncome: §6+" + getIncome(), "",
                    "§aHealth: §f" + getHealth() ,
                    "§aSpeed: §f" + getSpeed(),
                    "§eSummoned: §6" + getSummoned()) , inv);

        }
        public void Item(  List<String> lore ,Inventory inv ){
            GUIUtil.Stack("§e" +   getname() ,   getCode(),  getData(),  getStock(), lore,  getLoc(),inv);

        }
        public void setParm(String name, int code, int data ,   int cost,int income, int Health, double Speed, int Stock, int Summend, boolean AutoSummon, int Loc){
            this.name = name;
            this.code = code;
            this.data = data;

            this.cost = cost;
            this.income = income;
            this.Health = Health;
            this.Speed = Speed;
            this.Stock = Stock;
            this.Summoned = Summend;
            this.AutoSummon = AutoSummon;
            this.Loc = Loc;
        }
        


}
