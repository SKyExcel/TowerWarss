package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

public class TowerArcherII extends TowerArcher {

    private Class<? extends Tower> clazz;

    private int kills = 0;
    private int shots = 0;
    private int dealt = 0;

    private static int cost = 90;
    private static String name = "Archer - II";
    private static int damage = 50;
    private static double range = 11;
    private static double reload = 1.25;

    private static int tier = 2;

    public TowerArcherII() {
        super(null, null, cost, damage, range, reload, name, tier);
    }

    public TowerArcherII(TStruct.Team team, Location location) {
        super(team, location, cost, damage, range, reload, name, tier);
    }
}
