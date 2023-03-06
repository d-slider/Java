package Heroes;

public class Warrior extends BaseHero {
    int delivery;

    public Warrior(String hero, String name, int health, int speed, int maxDamage, int minDamage, int attack, int protection, int delivery) {
        super(hero, name, health, speed, maxDamage, minDamage, attack, protection);
        this.delivery = delivery;
    }

    public String getInfo() {
        return String.format("%s delivery: %d", super.getInfo(), this.delivery); 
    }
}
