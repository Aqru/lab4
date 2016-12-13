package com.kadriev;

/**
 *
 * Created by Aqru on 13.12.2016.
 */
public class Bowling {
    private int score;

    /***
     * Make a roll.
     * @param pins how many pins was knock.
     */
    public void roll (int pins) {
        score+=pins;
    }

    /***
     * Get current score
     * @return current score
     */
    public int getScore(){
        return score;
    }


    public Bowling() {
        score = 0;
    }
}
