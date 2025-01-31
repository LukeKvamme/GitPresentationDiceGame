package DiceGame;

import java.util.List;

/**
 * Simple interface for a rollable dice.
 * @author Michael Peeler
 *
 */
public interface Dice {

	public abstract int roll();
	
	public abstract List<Integer> rollNDice(int n);
	
	public abstract int numSides();
	
	public abstract List<Integer> sideValues();
}
