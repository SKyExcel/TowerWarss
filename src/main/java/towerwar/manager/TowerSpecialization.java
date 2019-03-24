package towerwar.manager;

import towerwar.manager.Tower;

public interface TowerSpecialization extends Tower {

    int getSpecialization();

    void upgrade(int specialization);

}
