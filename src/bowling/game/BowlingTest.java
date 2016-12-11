package bowling.game;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class BowlingTest {

	private Bowling bowlObj = new Bowling();
	
	@Test
	public void getScoretest() {
		for(int i = 0; i < bowlObj.ROLLCOUNT; i++)
			bowlObj.roll(1);
		
		assertEquals(20, bowlObj.getScore());
	}
	
	public void spareTest() {
		bowlObj.roll(5);
		bowlObj.roll(5);
		for(int i = 0; i < bowlObj.ROLLCOUNT - 2; i++)
			bowlObj.roll(29);
		
	}

}
