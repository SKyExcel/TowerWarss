package towerwar.manager;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import towerwar.Tstruct.TStruct;
import towerwar.util.GUIUtil;

import java.util.Arrays;
import java.util.List;

public interface Monster {

    int getCost();
    int getIncome();
    int getHealth();
    double getSpeed();
    int getSummend();
    int getLevel();
    int getStock();
    boolean getLocked();
    String getName();
    void spawn(Location loc, int Level);
    void onDeath();
    void Stack(Inventory inv);



}
