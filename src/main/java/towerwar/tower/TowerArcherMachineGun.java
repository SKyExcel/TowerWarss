package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

import java.util.Arrays;

public class TowerArcherMachineGun extends TowerArcher {

    private Class<? extends Tower> clazz;

    private static int cost = 21340;
    private static String name = "Archer IV - Machine Gun";
    private static int damage = 900;
    private static double range = 10;
    private static double reload = 0.75;

    private static int tier = 4;

    public TowerArcherMachineGun() {
        super(null, null, cost, damage, range, reload, name, tier, Arrays.asList(
                "§bVery fast",
                "§bFocus monsters with the most speed",
                "§bDamages are multipiled by the speed of the target"
        ), Specialization.PRIMARY);
    }

    public TowerArcherMachineGun(TStruct.Team team, Location location) {
        super(team, location, cost, damage, range, reload, name, tier, Arrays.asList(
                "§bVery fast",
                "§bFocus monsters with the most speed",
                "§bDamages are multipiled by the speed of the target"
        ), Specialization.PRIMARY);
    }
}
