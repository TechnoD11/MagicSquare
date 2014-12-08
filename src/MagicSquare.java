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
		int i = ROWS - 1;
		int j = COLUMNS - 1;
		int rowVal = 0;
		int colVal = 0;
		for(int k = 0; k < ROWS; k++){
			while(i != -1 && j != -1){
				rowVal = (i + k) % ROWS;
				//System.out.println(rowVal);
				colVal = (j + k) % COLUMNS;
				checkSum += squareMembers[rowVal][colVal];
				i--;
				j--;
				System.out.println(checkSum);
			}
			i = ROWS - 1;
			j = COLUMNS - 1;
			checkSum = 0;
		}
		
		return isMagicSquare;
	}
}
