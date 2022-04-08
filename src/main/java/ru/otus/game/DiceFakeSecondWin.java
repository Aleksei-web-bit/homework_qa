package ru.otus.game;

public class DiceFakeSecondWin implements Dice {

    int counter;

    @Override
    public int roll() {
        counter++;
        if (counter == 1) {
            return 1;
        } else {
            return 6;
        }
    }
}
