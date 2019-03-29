package towerwar.tower;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import towerwar.Tstruct.TStruct;

public enum TowerType {
    ARCHER_I(0, EntityType.SKELETON, TowerArcher.class, Material.BOW),
    ARCHER_II(9, EntityType.SKELETON, TowerArcherII.class, Material.BOW),
    ARCHER_III(18, EntityType.SKELETON, TowerArcherIII.class, Material.BOW),
    ARCHER_SNIPER(36, EntityType.SKELETON, TowerArcherSniper.class, Material.BOW),
    ARCHER_MACHINEGUN(45, EntityType.SKELETON, TowerArcherMachineGun.class, Material.SEEDS);

    private int slot;
    private EntityType entityType;
    private Class<? extends Tower> clazz;
    private Tower instance;
    private Material displayItem;
    private Material[] equipments = new Material[5];

    /**
     * TowerType Constructor with no equipments.
     * See also: {@link TowerType#TowerType(int, EntityType, Tower, Material[])}
     * @param slot       Tower GUI's slot
     * @param entityType The entity of tower
     * @param instance   Tower instance
     */
    TowerType(int slot, EntityType entityType, Class<? extends Tower> clazz, Material displayItem) {
        this(slot, entityType, clazz, displayItem, null);
    }

    /**
     * TowerType Constructor.
     * @param slot       Tower GUI's slot
     * @param entityType The entity of tower
     * @param instance   Tower instance
     * @param equipments Entity's equipment. [0] mainhand, [1] head, [2] chest, [3] legs, [4] feet.
     */
    TowerType(int slot, EntityType entityType, Class<? extends Tower> clazz, Material displayItem, Material[] equipments) {
        this.slot = slot;
        this.entityType = entityType;
        this.clazz = clazz;
        this.displayItem = displayItem;
        this.equipments = equipments;

        //this.instance = clazz.cast();

    }

    public int getSlot() {
        return slot;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public Material getDisplayItem() {
        return displayItem;
    }

    public Material[] getEquipments() {
        return equipments;
    }

    public Class<? extends Tower> getTowerClass() {
        return clazz;
    }

    public Tower getInstance() {
        return instance;
    }
}
