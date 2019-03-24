package towerwar.manager;

import towerwar.manager.Tower;

public interface TowerSpecialization extends Tower {

    void getSpecialization();

    void upgrade(int specialization);

}
