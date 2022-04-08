package ru.otus.game;

public class DiceFakeNotWin implements Dice {

    @Override
    public int roll() {
        return 1;
    }
}
