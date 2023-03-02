package OOP_1;

import OOP_1.unit.Villager;

public class Game {
    public static void main(String[] args) {

        Villager Sam = new Villager("Sam", 10, 15, 20);
        System.out.println(Sam.Attack(100, 1001, 50));

    }
}