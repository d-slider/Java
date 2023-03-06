package Heroes;

/**Колдун*/
public class Magician extends Priest {

    public Magician(){
        super("Magician__", "Harry", 30, 9, 0, -5, 1, 17, 12); 
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Колдун";}

}
