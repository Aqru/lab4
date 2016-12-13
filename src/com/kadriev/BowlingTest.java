package com.kadriev;

        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;

/**
 * Bowling tests.
 * Created by Aqru on 13.12.2016.
 */
public class BowlingTest {
    private Bowling bowling;

    @Before
    public void init() {
        bowling = new Bowling();
    }

    @Test
    public void testBowlingSimpleRoll() {
        bowling.roll(5);
        Assert.assertEquals("wrong score", 5, bowling.getScore());
    }

    @Test
    public void testBowlingSimpleStrike() {
        bowling.roll(10);
        bowling.roll(1);
        bowling.roll(1);
        Assert.assertEquals("wrong score after strike", 14, bowling.getScore());
    }

    @Test
    public void testBowlingSimpleSpare() {
        bowling.roll(4);
        bowling.roll(6);
        bowling.roll(2);
        bowling.roll(3);
        Assert.assertEquals("wrong score after spare", 17, bowling.getScore());
    }
}