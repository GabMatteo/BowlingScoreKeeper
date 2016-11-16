package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	int[] rolls;
	int roll;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		this.rolls = new int[21];
	}
	
	//the score of a single frame
	public int score(){
		int frame = 0;
		int score = 0;

		for (int i = 0; i < 10; i++) {
			if (isStrike(frame)) {
				score += 10 + bonus(frame);
				frame++;
			} else if (isSpare(frame)) {
				score += 10 + bonus(frame);
				frame += 2;
			} else {
				
				
			}
		}

		return score;	
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(int frame){
		
		return rolls[frame]==10;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(int frame){

		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		
		return false;
	}

	//bonus throws
	public int bonus(int frame){
		
		return 0;
	}


}
