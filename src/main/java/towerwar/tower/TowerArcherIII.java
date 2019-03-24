package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

public class TowerArcherII extends TowerArcher {

    private Class<? extends Tower> clazz;

    private int kills = 0;
    private int shots = 0;
    private int dealt = 0;

    private static int cost = 10;
    private static String name = "Archer - I";
    private static int damage = 15;
    private static double range = 10;
    private static double reload = 1.5;

    private static int tier = 1;

    public TowerArcherII() {}

    public TowerArcherII(TStruct.Team team, Location location) {
        super(team, location, cost, damage, range, reload, name, tier);
    }
}
