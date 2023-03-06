package Heroes;

public class Villager extends Warrior {
  

    public Villager() {
        super("Villager__", "Green", 1, 1, 1, 0, 1, 1, 1);
       
    }


    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() {return "Я Крестьянин ";}

}