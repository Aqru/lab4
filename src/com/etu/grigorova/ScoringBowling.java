package com.etu.grigorova;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Bowling game realization
 *
 * @author AlGrigorova
 */
public class ScoringBowling {
    private ArrayList<Integer> rolls;

    private int currentRoll;

    public ScoringBowling () {
        currentRoll = 0;
        rolls = new ArrayList<>();
    }

    /**
     * Method for score recording
     *
     * @param pins - knocked down pins
     */
    public void roll (int pins) {
        rolls.add(pins);
        currentRoll++;
    }

    /**
     * @return current score
     */
    public int getScore () {
        int score = 0;
        ListIterator<Integer> iter = rolls.listIterator();
        for (int currentFrame = 0; currentFrame < 10; currentFrame++) {
            int roll = iter.next();
            if (roll == 10) {
                score += 10;
                score += rolls.get(iter.nextIndex()) + rolls.get(iter.nextIndex() + 1); //bonus
            } else if (isItSpare(iter.nextIndex())) {
                score += 10;
                score += iter.next();//bonus
            } else {
                score += roll;
                score += iter.next();
            }
            System.out.println(roll);
        }
        return score;
    }

    /**
     * @param nextIndex - index of ArrayList, last in current frame
     *
     * @return are this two throws spare
     */
    private boolean isItSpare (int nextIndex) {
        if (rolls.get(nextIndex - 1) + rolls.get(nextIndex) == 10) {
            return true;
        }
        return false;
    }

    @Override
    public String toString () {
        String total = "Total score: " + getScore();
        return total + "\nThrows: " + "\n" + rolls;
    }
}
