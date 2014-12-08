/**
 * 
 * @author Derek Wider and Nick Napior
 *
 */
public class MagicSquare {
	public int[][] squareMembers;
	public boolean isMagicSquare;
	public int sum;
	public int checkSum;
	
	public MagicSquare(int[][] thisArray){
		squareMembers = thisArray.clone();
		isMagicSquare = true;
		sum = 0;
		checkSum = 0;
	}
	/**
	 * 
	 * @return
	 * TODO: Need to reset sum and add test of isMagicSquare to for loops
	 */
	public boolean isMagicSquare(){
		for(int i = 0; i < squareMembers.length; i++){
			sum += squareMembers[i][0];
		}
		for(int i = 0; i < squareMembers.length; i++){
			for(int j = 0; j < squareMembers.length; j++){
				checkSum += squareMembers[j][0];
			}
			if(sum != checkSum){
				isMagicSquare = false;
			}
		}
		for(int i = 0; i < squareMembers.length; i++){
			for(int j = 0; j < squareMembers.length; j++){
				checkSum += squareMembers[0][j];
			}
		}
		return isMagicSquare;
	}
}
