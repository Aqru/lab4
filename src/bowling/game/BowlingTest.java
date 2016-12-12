package bowling.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingTest {

	private Bowling bowlObj = new Bowling();
	
	@Test
	public void getScoretest() {
		for(int i = 0; i < bowlObj.ROLLCOUNT; i++)
			bowlObj.roll(1);
		
		assertEquals(20, bowlObj.getScore());
	}
	
	@Test
	public void spareTest() {
		bowlObj.roll(5);
		bowlObj.roll(5);
		for(int i = 0; i < bowlObj.ROLLCOUNT - 2; i++)
			bowlObj.roll(1);
		
		assertEquals(29, bowlObj.getScore());
		
	}
	
	@Test
	public void strikeTest() {
		bowlObj.roll(10);
		bowlObj.roll(4);
		bowlObj.roll(4);
		for(int i = 0; i < bowlObj.ROLLCOUNT - 4; i++)
			bowlObj.roll(1);
		
		assertEquals(42, bowlObj.getScore());
	}
	
	@Test
	public void tenthFrameTest() {
		for(int i = 0; i < bowlObj.ROLLCOUNT - 2; i++)
			bowlObj.roll(1);
		bowlObj.roll(10);
		bowlObj.roll(1);
		
		assertEquals(29, bowlObj.getScore());
	}
	
	

}
