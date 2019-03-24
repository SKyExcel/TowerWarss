package towerwar.Tstruct;

import org.bukkit.entity.Player;
import towerwar.manager.MonsterManager;

import java.util.HashMap;

public class TStruct {

    //Player's variable
    private Player player;
    public HashMap<Player , Gold> GoldMap = new HashMap<Player , Gold>();
    public HashMap<Player , Stock> StockMap = new HashMap<Player , Stock>();
    public HashMap<Player , Income> IncomeMap = new HashMap<Player , Income>();
    public HashMap<Player , Health> HealthMap = new HashMap<Player , Health>();
    public HashMap<Player , MonsterManager> MonsterMap = new HashMap<Player , MonsterManager>();

    //Variable's class
    private Stock stockclass = new Stock(5);
    private  Gold goldclass = new Gold(500);
    private Income incomeclass = new Income(0);
    private Health healthclass = new Health(20);

    public TStruct(Player player){
        this.player = player;
    }
    public void addPlayer(){
    GoldMap.put(player, this.goldclass);
    StockMap.put(player, this.stockclass);
    IncomeMap.put(player,this.incomeclass);
     }

    public int getGold(){

        return GoldMap.get(player).getGold();
    }
    public  int getStock(){

        return StockMap.get(player).getStock();
    }
    public void increaseStock(){
        StockMap.get(player).increase();
    }
    public void addStock(){
        StockMap.get(player).addStock();
    }
    public int getIncome(){

         return IncomeMap.get(player).getIncome();
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


    /*Monster Class*/


}
