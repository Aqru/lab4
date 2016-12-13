package com.kadriev;

/**
 *
 * Created by Aqru on 13.12.2016.
 */
public class Bowling {
    private int score;
    private boolean frameStart; // used for strike check.
    private int pinDown; // used for calc spare.

    private int strikeBonusScore; // used for calc score after strike.
    private int secondStrikeBonusScore; // used for calc score, when 2 strike in a row.
    private int spareBonusScore; // used for calc score after spare.

    /***
     * Checking strike condition.
     * @param pins current roll pins.
     * @return true if it's strike or false otherwise.
     */
    public boolean strikeCheck(int pins) {
        if (pins == 10){
            if (strikeBonusScore > 0)
                secondStrikeBonusScore+=2;
            else
                strikeBonusScore+=2;
            return true;
        }
        return false;
    }

    public boolean spareCheck(int pins) {
        if (pins+pinDown == 10){
            spareBonusScore+=1;
            return true;
        }
        return false;
    }

    /***
     * Make a roll.
     * @param pins how many pins was knock.
     */
    public void roll (int pins) {
        score+=pins;
        if (strikeBonusScore > 0){
            strikeBonusScore--;
            score+=pins;
        }
        if (secondStrikeBonusScore > 0){
            secondStrikeBonusScore--;
            score+=pins;
        }
        if (spareBonusScore > 0) {
            spareBonusScore--;
            score += pins;
        }
        if (frameStart) {
            if (!strikeCheck(pins)) {
                frameStart = false;
                pinDown = pins;
            }
        }
        else {
            spareCheck(pins);
            frameStart = true;
        }
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
        frameStart = true;
        pinDown = 0;
        strikeBonusScore = 0;
        secondStrikeBonusScore = 0;
        spareBonusScore = 0;
    }
}
