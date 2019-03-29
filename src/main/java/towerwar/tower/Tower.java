package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

public interface Tower {

    String getName();

    int getCost();

    boolean isTowerStoped();

    int getTier();

    TStruct.Team getTeam();
    Location getLocation();

    int getKills();
    int getShots();
    int getDealt();

}
