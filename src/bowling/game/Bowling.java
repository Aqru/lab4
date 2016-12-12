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
		if(pins == PINSOVER && (rolli - 1) %2 == 0)
			rollsArr[rolli++] = 0;
	}
	
	public boolean isSpare(int i) {
		return rollsArr[i] + rollsArr[i + 1] == PINSOVER;
	}
	
	public boolean isStrike(int i) {
		return rollsArr[i] == PINSOVER || rollsArr[i + 1] == PINSOVER;
	}
	
	public int addWrapper(int i) {
		return rollsArr[i] + rollsArr[i + 1];
	}
	

	public int getScore() {
		int result = 0;
		for(int i = 0; i < rolli; i+=2) {
			//if tenth frame
			if(i == ROLLCOUNT && (isStrike(i)|| isSpare(i))) {
				for(int j = i; j < rolli; j++)
					result += rollsArr[j];
				break;
			}
			
			result += addWrapper(i);
			if(isStrike(i) && i < LASTFRAME) {
				result += addWrapper(i + 2);
			}
			else if(isSpare(i) && i < LASTFRAME) {
				result += rollsArr[i + 2];
			}
		}
		return result;
	}

}
