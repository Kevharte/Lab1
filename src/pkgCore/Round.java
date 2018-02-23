package pkgCore;
import java.util.LinkedList;
public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	
	public Round() {
		rolls.add(new Roll());
		
		if(isNatural(rolls.getLast().getScore())) {
			eGameResult = eGameResult.NATURAL;
		}
		else if(isCraps(rolls.getLast().getScore())) {
			eGameResult = eGameResult.CRAPS;
		}
		else {
			do {
				rolls.add(new Roll());
			}while((rolls.getLast().getScore()) != 7 || (rolls.getLast().getScore() != rolls.getFirst().getScore()));
		}
		if(rolls.getLast().getScore() == 7 && rolls.size() > 1) {
			eGameResult = eGameResult.SEVEN_OUT;
		}
	}
	
	public int RollCount() {
		return rolls.size();
	}
	
	public static boolean isNatural(int iScore){
		return ((iScore == 7 || iScore == 11));
	}
	
	public static boolean isCraps(int iScore) {
		return ((iScore == 2 || iScore == 3 || iScore == 12));
	}
	public int FirstRoll() {
		return rolls.getFirst.getScore();
	}
	public int LastRoll() {
		return rolls.getLast.getScore();
	}
	
}