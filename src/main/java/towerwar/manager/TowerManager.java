package towerwar.manager;

import towerwar.manager.Tower;

import java.util.ArrayList;
import java.util.List;

public class TowerManager {

    private List<Tower> towers = new ArrayList<>();

    public void addTower(Tower tower) {
        towers.add(tower);
    }

    public void removeTower(Tower tower) {
        towers.remove(tower);
    }

    public void resetTower() {
        towers.clear();
    }

}
