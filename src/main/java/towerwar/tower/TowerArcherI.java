package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

public abstract class TowerArcher implements RangedTower, TimedTower, AttackableTower {

    private Class<? extends Tower> clazz;

    private int kills;
    private int shots;
    private int dealt;

    private static int cost;
    private static String name;
    private static int damage;
    private static double range;
    private static double reload;

    private static int tier;

    private TStruct.Team team;
    private Location location;

    private boolean isStopped = false;

    public TowerArcher(TStruct.Team team, Location location, Class<? extends Tower> clazz) {
        this.team = team;
        this.location = location;
        this.clazz = clazz;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public double getDPS() {
        return damage / reload;
    }

    @Override
    public double getRange() {
        return range;
    }

    @Override
    public double getReload() {
        return reload;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public boolean isTowerStoped() {
        return isStopped;
    }

    @Override
    public int getKills() {
        return kills;
    }

    @Override
    public int getShots() {
        return shots;
    }

    @Override
    public int getDealt() {
        return dealt;
    }

    @Override
    public int getTier() {
        return tier;
    }

    @Override
    public TStruct.Team getTeam() {
        return team;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public Class<? extends Tower> getTowerClass() {
        return clazz;
    }
}
