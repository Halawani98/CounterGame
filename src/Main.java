import game.CounterGame;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Anas Al-Halawani
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n to start the game!");
        BigInteger n = scanner.nextBigInteger();

        long startTime = System.currentTimeMillis();
        String gameResult = CounterGame.startGame(n);
        long executionTime = System.currentTimeMillis() - startTime;

        System.out.println(gameResult);
        System.out.println("Execution time: " + executionTime + " ms");
    }
}