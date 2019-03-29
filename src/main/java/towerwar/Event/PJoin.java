package towerwar.Event;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import towerwar.TowerWar;
import towerwar.Tstruct.TStruct;
import towerwar.util.GUIUtil;
import towerwar.util.ScoreBoard;

import java.util.Arrays;


public class PJoin implements Listener {

    public Player p;
     public TStruct v = new TStruct(p);
    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        p = event.getPlayer();
        event.setJoinMessage("");
        TowerWar.instance.Value.put(p,v);
        p.setAllowFlight(true);
        p.setGameMode(GameMode.ADVENTURE);
        v.addPlayer();
        p.sendMessage("Your Gold" + v.getGold());
        p.getInventory().clear();
        GUIUtil.ItemBuilder("§eSummon monsters!",399,0,1, Arrays.asList("§fSummoning monsters increase" ,"§fyour income and they can steal" ,"§flives from your enemies if they" , "§freach the end of their lane") , p , 2);
        GUIUtil.ItemBuilder("§eClick to place a tower",416,0,1,Arrays.asList("§fYou can simply aim at a block" , "§fwith this item to §bplace §fa" , "§ftower anywhere in your plot" ,"" ,"§fTowers help you defened against" ,"§fenemy monsters!") ,p,1);
        p.sendMessage("§bYou can start summoning monsters in ");
        v.Regenstock();

        ScoreBoard board = new ScoreBoard(event.getPlayer() , "TOWERWARS");
        board.newScoreBoard();


    }



}

