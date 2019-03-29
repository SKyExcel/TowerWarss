package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

public class TowerArcherIII extends TowerArcher {

    private Class<? extends Tower> clazz;

    private static int cost = 1340;
    private static String name = "Archer - III";
    private static int damage = 250;
    private static double range = 12;
    private static double reload = 1;

    private static int tier = 3;

    public TowerArcherIII() {
        super(null, null, cost, damage, range, reload, name, tier);
    }

    public TowerArcherIII(TStruct.Team team, Location location) {
        super(team, location, cost, damage, range, reload, name, tier);
    }
}
