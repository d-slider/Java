package Heroes;

public class Sniper extends Shooter {

    public Sniper(){
        super("Sniper____", "Eagle", 15, 9, 10, 8, 12, 10, 32);
             
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Снайпер";}

}