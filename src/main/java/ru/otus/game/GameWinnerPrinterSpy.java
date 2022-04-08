package ru.otus.game;

public class GameWinnerPrinterSpy implements GameWinnerPrinter {
    private Player winner;

    @Override
    public void printWinner(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }
}
