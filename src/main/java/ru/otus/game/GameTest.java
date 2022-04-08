package ru.otus.game;

public class GameTest {

    public static void main(String[] args) {
        testFirstWin();

        testSecondWin();

        testNotWin();

        testDiceImplRange();
    }

    private static void testFirstWin() {
        Dice dice1 = new DiceFakeFirstWin();
        GameWinnerPrinterSpy winnerPrinter1 = new GameWinnerPrinterSpy();
        Game game1 = new Game(dice1, winnerPrinter1);
        game1.playGame(new Player("Вася"), new Player("Игорь"));
        if (winnerPrinter1.getWinner().getName().equals("Вася")) {
            System.out.println("Тест1 пройден.");
        } else {
            System.out.println("Тест не1 пройден.");
        }
    }

    private static void testSecondWin() {
        Dice dice2 = new DiceFakeSecondWin();
        GameWinnerPrinterSpy winnerPrinter2 = new GameWinnerPrinterSpy();
        Game game2 = new Game(dice2, winnerPrinter2);
        game2.playGame(new Player("Вася"), new Player("Игорь"));
        if (winnerPrinter2.getWinner().getName().equals("Игорь")) {
            System.out.println("Тест2 пройден.");
        } else {
            System.out.println("Тест2 не пройден.");
        }
    }

    private static void testNotWin() {
        Dice dice2 = new DiceFakeNotWin();
        GameWinnerPrinterSpy winnerPrinter2 = new GameWinnerPrinterSpy();
        Game game2 = new Game(dice2, winnerPrinter2);
        game2.playGame(new Player("Вася"), new Player("Игорь"));
        if (winnerPrinter2.getWinner() == null) {
            System.out.println("Тест3 пройден.");
        } else {
            System.out.println("Тест3 не пройден.");
        }
    }

    private static void testDiceImplRange() {
        DiceImpl dice = new DiceImpl();
        boolean testResult = true;

        for (int i = 0; i < 10; i++) {
            int result = dice.roll();
            if (result < 1 || result > 6) {
                testResult = false;
                break;
            }
        }
        if (testResult) {
            System.out.println("Тест4 пройден.");
        } else {
            System.out.println("Тест4 не пройден.");
        }
    }
}
