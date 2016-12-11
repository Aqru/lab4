package bowling.game;

public class Bowling {
	public static final int ROLLCOUNT = 20;
	private final int EXTROLLCOUNT = 23;
	private final int LASTFRAME = 18;
	private final int PINSOVER = 10;
	
	private int rolli;
	
	private int[] rollsArr;
	
	Bowling() {
		rollsArr = new int[EXTROLLCOUNT];
		rolli = 0;
	}
	
	public void roll(int pins) {
		rollsArr[rolli++] = pins;
	}
	
	public boolean isSpare(int i) {
		return rollsArr[i] + rollsArr[i + 1] == PINSOVER;
	}
	
	public int getScore() {
		int result = 0;
		for(int i = 0; i < rolli; i+=2) {
			result += (rollsArr[i] + rollsArr[i + 1]);
			if(isSpare(i) && i < LASTFRAME) {
				result += rollsArr[i + 2];
			}
		}
		return result;
	}

}
