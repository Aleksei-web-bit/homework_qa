package ru.otus.game;

public class DiceFakeFirstWin implements Dice {

    int counter;

    @Override
    public int roll() {
        counter++;
        if (counter == 1) return 6;
        return 1;
    }
}
