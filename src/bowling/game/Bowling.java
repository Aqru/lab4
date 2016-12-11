package bowling.game;

public class Bowling {
	public static final int ROLLCOUNT = 20;
	public final int EXTROLLCOUNT = 23;
	
	private int rolli;
	
	private int[] rollsArr;
	
	Bowling() {
		rollsArr = new int[EXTROLLCOUNT];
		rolli = 0;
	}
	
	public void roll(int pins) {
		rollsArr[rolli++] = pins;
	}
	
	public int getScore() {
		
		int result = 0;
		for(int i = 0; i < rolli; i++)
			result += rollsArr[i];
		return result;
	}

}
