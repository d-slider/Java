package Heroes;

import java.util.Random;

public abstract class BaseHero {
    protected String hero;
    protected String name;
    protected int health;
    protected int speed;
    protected static Random r;
    protected int maxDamage, minDamage;
    protected int attack;
    protected int protection;

    /** Конструктор который отвечает за инициализацию */
    public BaseHero(String hero, String name, int health, int attack, int speed, int maxDamage, int minDamage,
            int protection) {
        this.hero = hero;
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.attack = attack;
        this.protection = protection;
    }

    /** Метод получения информации */
    public String getInfo() {
        return String.format("Hero: %s Name: %s Health: %d Endurance: %d Speed: %d, maxDamage: %d, minDamage: %d",
                this.hero, this.name, this.health, this.speed, this.maxDamage, this.minDamage,
                this.getClass().getSimpleName());
    }
}