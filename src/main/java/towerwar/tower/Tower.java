package towerwar.tower;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import towerwar.Tstruct.TStruct;

public interface Tower {

    double range = 0;
    double reload = 0;
    int cost = 0;
    int tier = 0;

    double getRange();
    double getReload();

    int getUpgradeCost();
    int getBuyCost();

    int getTier();

    void upgrade();
    void create(TStruct.Team team, Location loc, int tier);
    void remove();

    void showRange();
    void replaceTower();

}
