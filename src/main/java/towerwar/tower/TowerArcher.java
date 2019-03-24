package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

import java.util.List;

public abstract class TowerArcher implements RangedTower, TimedTower, AttackableTower, SpecilizationTower, LoredTower {

    private int kills = 0;
    private int shots = 0;
    private int dealt = 0;

    private static int cost;
    private static String name;
    private static int damage;
    private static double range;
    private static double reload;

    private static int tier;

    private TStruct.Team team;
    private Location location;

    private boolean isStopped = false;
    private Specialization specialization;

    private List<String> lore;

    public TowerArcher() {}

    public TowerArcher(TStruct.Team team, Location location, int cost,
                       int damage, double range, double reload, String name, int tier) {
        this(team, location, cost, damage, range, reload, name, tier, null);
    }

    public TowerArcher(TStruct.Team team, Location location, int cost,
                       int damage, double range, double reload, String name, int tier, List<String> lore) {
        this(team, location, cost, damage, range, reload, name, tier, lore, Specialization.NONE);
    }


    public TowerArcher(TStruct.Team team, Location location, int cost,
                       int damage, double range, double reload, String name, int tier, List<String> lore, Specialization specialization) {
        this.team = team;
        this.location = location;
        this.cost = cost;
        this.damage = damage;
        this.range = range;
        this.reload = reload;
        this.name = name;
        this.tier = tier;
        this.isStopped = false;
        this.lore = lore;
        this.specialization = specialization;
    }

    public int getDamage() {
        return damage;
    }

    public double getDPS() {
        return damage / reload;
    }

    public double getRange() {
        return range;
    }

    public double getReload() {
        return reload;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public boolean isTowerStoped() {
        return isStopped;
    }

    public int getKills() {
        return kills;
    }

    public int getShots() {
        return shots;
    }

    public int getDealt() {
        return dealt;
    }

    public int getTier() {
        return tier;
    }

    public TStruct.Team getTeam() {
        return team;
    }

    public Location getLocation() {
        return location;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public List<String> getLore() {
        return lore;
    }
}
