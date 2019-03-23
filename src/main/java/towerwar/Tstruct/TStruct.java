package towerwar.Tstruct;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class TStruct {

    //Player's variable
    private Player player;
    public HashMap<Player , Gold> GoldMap = new HashMap<Player , Gold>();
    public HashMap<Player , Stock> StockMap = new HashMap<Player , Stock>();
    public HashMap<Player , Income> IncomeMap = new HashMap<Player , Income>();
    public HashMap<Player , Health> HealthMap = new HashMap<Player , Health>();
    //Variable's class
    private Stock stockclass = new Stock(100);
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
    public int getIncome(){

         return IncomeMap.get(player).getIncome();
    }

    /*Base Game Logic*/
    public class Gold{
        private int Gold;
        public Gold(int Gold){
            this.Gold = Gold;

        }
        public void addGold(int addGold){
            this.Gold = addGold;
        }
        public int getGold(){
            return Gold;
        }

    }

    public class Stock{

        private int Stock;
        public Stock(int Stock){
            this.Stock = Stock;

        }
        public void addStock(int addStock){
            this.Stock += addStock;
        }
        public int getStock(){
            return Stock;
        }

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
       public String[] messages = {"§eYou got +§6" + getIncome() + "§e gold from passive income!"};
    }



    public enum Team{
    BLUE,RED,GREEN,YELLOW,ORANGE,AQUA
    }


    /*Monster Class*/
    public class Monster{


    public Monster(String Name,int ItemCode, int Cost, int Income, int Health, double Speed, int Stock, int Summoned){
        Name  name = new Name(Name);
        ItemCode itemcode = new ItemCode(ItemCode);
        Cost cost = new Cost(Cost);
        Income income = new Income(Income);
        Health health = new Health(Health);
        Speed speed = new Speed(Speed) ;
        Stock stock = new Stock(Stock);
        Summoned summoned = new Summoned(Summoned);
    }

        public class Name{
            private String Name;
            public Name(String Name){
                this.Name = Name;

            }

            public String getName(){
                return Name;
            }

        }
        public class ItemCode{
            private int ItemCode;
            public ItemCode(int ItemCode){
                this.ItemCode = ItemCode;

            }

            public int getItemCode(){
                return ItemCode;
            }

        }
        public class Cost{
            private int Cost;
            public Cost(int Cost){
                this.Cost = Cost;

            }
            public void addCost(int addCost){
                this.Cost += addCost;
            }
            public int getCost(){
                return Cost;
            }

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
        public class Speed{
            private double Speed;
            public Speed(double Speed){
                this.Speed = Speed;

            }
            public void addSpeed(double addSpeed){
                this.Speed += addSpeed;
            }
            public double getSpeed(){
                return Speed;
            }

        }

        public class Stock{
            private int Stock;
            public Stock(int Stock){
                this.Stock = Stock;

            }
            public void addStock(int addStock){
                this.Stock += addStock;
            }
            public int getStock(){
                return Stock;
            }

        }
        
        public class Summoned{
            private int Summoned;
            public Summoned(int Summoned){
                this.Summoned = Summoned;

            }
            public void addSummoned(int addSummoned){
                this.Summoned += addSummoned;
            }
            public int getSummoned(){
                return Summoned;
            }

        }
    }

}
