package towerwar.manager;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import towerwar.Tstruct.TStruct;

public interface Tower {

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
