package towerwar.util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;
import towerwar.TowerWar;

public class ScoreBoard {
    private Player player;
    private String title;
     public ScoreBoard(Player player , String title){
        this.player = player;
        this.title = title;
    }
    public void newScoreBoard(){
         Bukkit.getScheduler().scheduleSyncRepeatingTask(TowerWar.instance, new Runnable() {
             @Override
             public void run() {
                 ScoreboardManager manager = Bukkit.getScoreboardManager();
                 Scoreboard board = manager.getNewScoreboard();
                 Team team = board.registerNewTeam("");
                 Objective objective = board.registerNewObjective(title, "dummy");
                 objective.setDisplaySlot(DisplaySlot.SIDEBAR);
                 objective.setDisplayName(title);

                 Score score = objective.getScore("§6Gold: §e" + TowerWar.instance.Value.get(player).getGold()); //Get a fake offline player
                 score.setScore(1); //Integer only!
                 Score score1 = objective.getScore("§6Income: §e" + TowerWar.instance.Value.get(player).getIncome()); //Get a fake offline player
                 score1.setScore(2); //Integer only!


                 team.setDisplayName(title);
                 player.setScoreboard(board);
             }
         },1,1);


      }
      public void getScore(Objective objective){

           objective.getScore(player).setScore(0);
      }

}
