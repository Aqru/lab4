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
}