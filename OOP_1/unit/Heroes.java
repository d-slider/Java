package OOP_1.unit;

public abstract class Heroes {
    protected String name;
    protected int hp;
    protected int def;
    protected int damage;
    public int Attack(int hp, int  def, int damage) {
        hp += def - damage;
        return hp;
    }

    public Heroes(String name, int hp, int def, int damage) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.damage = damage;
    }
}