package towerwar.Tstruct;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import towerwar.TowerWar;
import towerwar.manager.MonsterManager;

import java.util.HashMap;

public class TStruct {

    //Player's variable
    private Player player;
    public HashMap<Player , Gold> GoldMap = new HashMap<Player , Gold>();
    public HashMap<Player , Stock> StockMap = new HashMap<Player , Stock>();
    public HashMap<Team , Income> IncomeMap = new HashMap<Team , Income>();
    public HashMap<Player , Health> HealthMap = new HashMap<Player , Health>();
    public HashMap<Player , MonsterManager> MonsterMap = new HashMap<Player , MonsterManager>();
    public HashMap<Player , coolTime> CoolTime = new HashMap<Player, coolTime>();
    public HashMap<Player , Team> teamMap = new HashMap<Player, Team>();

    //Variable's class
    private Stock stockclass = new Stock(5);
    private  Gold goldclass = new Gold(500);
    private Income incomeclass = new Income(0);
    private Health healthclass = new Health(20);
    private coolTime timeclass = new coolTime();
    private Team team;


    public TStruct(Player player){
        this.player = player;
    }

    public void addPlayer(){
    GoldMap.put(player, this.goldclass);
    StockMap.put(player, this.stockclass);
    IncomeMap.put(team,this.incomeclass);
    }

     public Team getTeam(){return team;}
    public void setTeam(Team newTeam){ teamMap.put(player,newTeam); }

      public void run(){ CoolTime.get(player).run(); }
    public int getGold(){ return GoldMap.get(player).getGold(); }
    public void increaseGold(int newGold){ GoldMap.get(player).increas(newGold);}
    public  int getStock(){ return StockMap.get(player).getStock(); }


    public void increaseStock(){
        StockMap.get(player).increase();
    }
    public void addStock(){
        StockMap.get(player).addStock();
    }
    public int getIncome(){

         return IncomeMap.get(player).getIncome();
    }


    public void Regenstock(){
        Bukkit.getScheduler().scheduleSyncRepeatingTask(TowerWar.instance, new Runnable() {
            @Override
            public void run() {
                if(getStock() == 0){
                    if(getStock() != 5){
                        addStock();
                    }
                } else {
                    if (getStock() != 5) {
                        addStock();
                    }
                }
            }
        },40,40);
    }


        /*Base Game Logic*/
    public class Gold{
        private int Gold;
        public Gold(int Gold){
            this.Gold = Gold;

        }
        public void add(int addGold){
            this.Gold = addGold;
        }
        public int getGold(){
            return Gold;
        }
        public void increas(int increaseGold){this.Gold  -= increaseGold;}

    }


    public class Stock{

        private int Stock;
        public Stock(int Stock){
            this.Stock = Stock;

        }
        public void addStock(){
            this.Stock ++;
        }
        public int getStock(){
            return Stock;
        }
        public void increase(){ this.Stock --;}

    }


    public class Income{
        private int Income;
        public Income(int Income){
            this.Income = Income;

        }
        public void addIncome(int addIncome){
            this.Income += addIncome;
        }
        public int getIncome(){
            return Income;
        }

    }


    public class Health{
        private int Health;
        public Health(int Health){
            this.Health = Health;

        }
        public void addHealth(int addHealth){
            this.Health += addHealth;
        }
        public int getHealth(){
            return Health;
        }

    }


    public void sendMessage(int message){
        messages messages = new messages();
        player.sendMessage(messages.messages[message]);
    }

    public class messages{
       public String[] messages = {"§eYou got +§6" + getIncome() + "§e gold from passive income!" , "§cNot enough gold!"};
    }


    public enum Team{BLUE,RED,GREEN,YELLOW,ORANGE,AQUA}


    public class coolTime{
        private int sec;
        private int min;
        public int getSec(){ return sec; }
        public int getmin(){return min;}
        public void increaseSec(){sec--;}
        public void IncreaseMin(){min--;}

        public void run(){
            Bukkit.getScheduler().scheduleSyncRepeatingTask(TowerWar.instance, new Runnable() {
                @Override
                public void run() {
                if(sec != 0){sec--;} else{
                    sec = 60;
                    if(min != 0){min--;}
                }
                }
            },20,0);
        }
    }



}
