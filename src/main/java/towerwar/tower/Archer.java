package towerwar.tower;

import org.bukkit.Location;
import towerwar.Tstruct.TStruct;

public class Archer implements TowerAttackable, TowerSpecialization {

    private TStruct.Team team;
    private int tier = 0;
    private int specialization = 0;
    private Location location = null;

    private int[] cost = new int[] {0, 10, 90, 1340, -1, 21340, 21340};
    private double[] damage = new double[] {0, 15, 50, 250, -1, 6000, 900};
    private double[] reload = new double[] {0, 1.5, 1.25, 1, -1, 2, 0.75};
    private double[] dps;
    private double[] range = new double[] {0, 10, 11, 12, -1, 30, 10};

    public Archer(TStruct.Team team, int tier, Location location) {
        this.team = team;
        this.tier = tier;
        this.location = location;

        for (int i = 0; i < damage.length; i++) {
            dps[i] = damage[i] / dps[i];
        }
    }

    @Override
    public double getDamage() {
        return damage[tier + specialization];
    }

    @Override
    public double getDPS() {
        return dps[tier + specialization];
    }

    @Override
    public double getRange() {
        return range[tier + specialization];
    }

    @Override
    public double getReload() {
        return reload[tier + specialization];
    }

    @Override
    public int getUpgradeCost() {
        return cost[tier + specialization] - cost[tier + specialization - 1];
    }

    @Override
    public int getBuyCost() {
        return cost[tier + specialization];
    }

    @Override
    public int getTier() {
        return tier;
    }

    @Override
    public void upgrade() {

    }

    @Override
    public void create(TStruct.Team team, Location loc, int tier) {
        // TODO add TowerManager static in TowerWar.java

    }

    @Override
    public void remove() {

    }

    @Override
    public void showRange() {

    }

    @Override
    public void replaceTower() {

    }

    @Override
    public void getSpecialization() {

    }

    @Override
    public void upgrade(int specialization) {

    }
}
