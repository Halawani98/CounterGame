package game;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anas Al-Halawani
 */
public class CounterGame {
    private static final List<String> players = new ArrayList<>(Arrays.asList("Ali", "Naser"));

    public static String startGame(BigInteger n) {
        if(n.longValue() < 0 || n.longValue() == 0) {
            return "Invalid value of n!";
        }
        int turn = 0;
        while(!n.equals(BigInteger.ONE)) {
            if(isPowerOfTwo(n)) {
                n = n.divide(BigInteger.TWO);
            } else {
                n = reduceToNextPower(n);
            }
            turn++;
        }
        return "The winner is: " + players.get(turn % 2);
    }

    private static boolean isPowerOfTwo(BigInteger n) {
        return n.and(n.subtract(BigInteger.ONE)).equals(BigInteger.ZERO);
    }

    private static BigInteger reduceToNextPower(BigInteger n) {
        BigInteger lowerPowerOfTwo = BigInteger.ONE;
        while (lowerPowerOfTwo.compareTo(n) < 0) {
            lowerPowerOfTwo = lowerPowerOfTwo.multiply(BigInteger.TWO);
        }
        lowerPowerOfTwo = lowerPowerOfTwo.divide(BigInteger.TWO);
        return n.subtract(lowerPowerOfTwo);
    }
}
