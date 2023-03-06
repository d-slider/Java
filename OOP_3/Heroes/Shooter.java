package Heroes;

public class Shooter extends BaseHero{
    int shoot;
    
        public Shooter(String hero, String name, int health, int speed, int maxDamage, int minDamage, int attack, int protection, int shoot) {
            super(hero, name, health, speed, maxDamage, minDamage, attack, protection);
            this.shoot = shoot;
    
        }
        
        public String getInfo() {
            return String.format("%s Ammunition: %d Gun: %s Markmanship: %d", 
            super.getInfo());       
        }
}    