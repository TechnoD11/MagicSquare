/**
 * 
 * @author Derek Wider and Nick Napior
 *
 */
public class MagicSquare {
	private int[][] squareMembers;
	private boolean isMagicSquare;
	private int sum;
	private int checkSum;
	private int ROWS;
	private int COLUMNS;
	
	public MagicSquare(int[][] thisArray){
		squareMembers = thisArray.clone();
		isMagicSquare = true;
		sum = 0;
		checkSum = 0;
		ROWS = thisArray.length;
		COLUMNS = thisArray[0].length;
	}
	/**
	 * 
	 * @return
	 * TODO: Need to reset sum and add test of isMagicSquare to for loops
	 * need to change for loop limit to row and column bounds
	 */
	public boolean isMagicSquare(){
		for(int i = 0; i < squareMembers.length; i++){
			sum += squareMembers[i][0];
		}
		System.out.println(sum);
		for(int i = 0; i < squareMembers.length; i++){
			for(int j = 0; j < squareMembers[0].length; j++){
				checkSum += squareMembers[j][i];
				System.out.println(checkSum);
			}
			if(sum != checkSum){
				isMagicSquare = false;
			}
			checkSum = 0;
		}
		for(int i = 0; i < squareMembers[0].length; i++){
			for(int j = 0; j < squareMembers.length; j++){
				checkSum += squareMembers[i][j];
			}
			if(sum != checkSum){
				isMagicSquare = false;
			}
			checkSum = 0;
		}
		
		return isMagicSquare;
	}
}
