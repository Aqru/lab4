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

    @Test
    public void testSimpleBowlingGameWithStrikeAndSpare() {
        bowling.roll(10);
        Assert.assertEquals("wrong 1 frame", 10, bowling.getScore());

        bowling.roll(10);
        Assert.assertEquals("wrong 2 frame", 30, bowling.getScore());

        bowling.roll(3);
        bowling.roll(5);
        Assert.assertEquals("wrong 3 frame", 49, bowling.getScore());

        bowling.roll(5);
        bowling.roll(5);
        Assert.assertEquals("wrong 4 frame", 59, bowling.getScore());

        bowling.roll(4);
        bowling.roll(4);
        Assert.assertEquals("wrong 5 frame", 71, bowling.getScore());

        bowling.roll(4);
        bowling.roll(4);
        Assert.assertEquals("wrong 6 frame", 79, bowling.getScore());

        bowling.roll(4);
        bowling.roll(4);
        Assert.assertEquals("wrong 7 frame", 87, bowling.getScore());

        bowling.roll(4);
        bowling.roll(4);
        Assert.assertEquals("wrong 8 frame", 95, bowling.getScore());

        bowling.roll(4);
        bowling.roll(4);
        Assert.assertEquals("wrong 9 frame", 103, bowling.getScore());

        bowling.roll(10);
        bowling.roll(7);
        Assert.assertEquals("wrong score after simple game check", 127, bowling.getScore());
    }
}