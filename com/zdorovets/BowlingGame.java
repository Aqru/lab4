package com.zdorovets;
/*
 * BowlingGame class
 * @author Evgeny Zdorovets
 * created on 21/10/16
 */
public class BowlingGame {
	private int score = 0;
	/*
	 * @param pins - ���������� ������
	 */
	public void roll(int pins) {
		score += pins;
	}
	/* 
	 * @return ���������� �����
	 */
	public int score(){
		return score;
	}
}
