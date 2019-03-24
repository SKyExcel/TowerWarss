package towerwar.manager;

import java.util.ArrayList;
import java.util.List;

public class MonsterManager extends Summoned{
    private List<Monster> monsters = new ArrayList<>();

    public void addMonster(Monster monster) {monsters.add(monster); }
    public void removeMonster(Monster monster){monsters.remove(monster);}


}
