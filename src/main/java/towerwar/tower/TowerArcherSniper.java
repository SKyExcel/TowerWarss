package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

import java.util.Arrays;

public class TowerArcherSniper extends TowerArcher {

    private Class<? extends Tower> clazz;

    private static int cost = 21340;
    private static String name = "Archer IV - Sniper";
    private static int damage = 6000;
    private static double range = 30;
    private static double reload = 2;

    private static int tier = 4;

    public TowerArcherSniper() {
        super(null, null, cost, damage, range, reload, name, tier, Arrays.asList(
                "§bLong range",
                "§bFocus monsters with 50% more HP in priority",
                "§band inflict them twice the damage"
        ), Specialization.PRIMARY);
    }

    public TowerArcherSniper(TStruct.Team team, Location location) {
        super(team, location, cost, damage, range, reload, name, tier, Arrays.asList(
                "§bLong range",
                "§bFocus monsters with 50% more HP in priority",
                "§band inflict them twice the damage"
        ), Specialization.PRIMARY);
    }
}
