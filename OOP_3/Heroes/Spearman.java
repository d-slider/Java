package Heroes;

/**Копейщик */
public class Spearman extends Warrior {

    public Spearman(){
       super("Spearman__", "Bredy", 10, 4, 3, 1, 4, 5, 0); 
   }

   /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
   @Override
   public String getInfo() { return "Я Копейщик ";}

}
