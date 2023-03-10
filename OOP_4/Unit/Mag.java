package Unit;

import Unit.Human;

import java.util.ArrayList;

public abstract class Mag extends Human {
    protected int mana;
    protected int maxMana;
    public Mag(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die") || mana <= 0) return;
        Human victim = findVeryIll(team1);
        victim.getDamage(damageMin);
        mana -= 1;


        // int a = boolean ? first : second;
        // float damage = (victim.defense - attack)>0 ? damageMin : (victim.defense - attack)<0 ? damageMax : (damageMin+damageMax)/2;
        // victim.getDamage(damage);
        // for (Human human: team1) {
        //     if (human.getInfo().toString().split(":")[0].equals("Фермер") && human.state.equals("Stand")) {
        //         human.state = "Busy";
        //         return;
        //     }
        // }
        // cartridges--;
    }

    protected Human findVeryIll(ArrayList<Human> team){
        double minHp = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            Human pers = team.get(i);
            if(minHp > team.get(i).maxHp - team.get(i).hp) {
                index = i;
                minHp = team.get(i).maxHp - team.get(i).hp;
            }
        }
        return team.get(index);
    }
}
