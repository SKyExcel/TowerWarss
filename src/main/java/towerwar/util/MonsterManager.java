package towerwar.util;

import org.bukkit.entity.Player;
import towerwar.Tstruct.TStruct;

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

        public void setParm(String name, int code, int data,int cost,int income, int Health, double Speed, int Stock, int Summend, int Loc){
            this.name = name;
            this.code = code;
            this.data = data;
            this.cost = cost;
            this.income = income;
            this.Health = Health;
            this.Speed = Speed;
            this.Stock = Stock;
            this.Summoned = Summend;
            this.Loc = Loc;
        }



}
