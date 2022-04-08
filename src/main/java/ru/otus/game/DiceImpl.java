package ru.otus.game;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        return new Random().nextInt();
    }

//    public int roll() {
//            return new Random().nextInt(5) + 1;
//    }
//
}
