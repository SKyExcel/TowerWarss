package towerwar.tower;

public enum Specialization {
    NONE(0),
    PRIMARY(1),
    SECONDARY(2);

    private int id;

    Specialization(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
