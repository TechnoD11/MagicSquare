/**
 * 
 * @author Derek Wider and Nick Napior
 * Magic Square HW
 *
 */
public class MagicSquareRunner 
{

	//	A magic square is an arrangement of integers in a square grid, where the numbers 
	//	in each row, and in each column, and the numbers in the forward and backward main 
	//	diagonals, all add up to the same number. A magic square has the same number of 
	//	rows as it has columns.
	
	public static void main(String[] args) 
	{
		int[][] firstArray = { {16,3,2,13},{ 5,10,11,8 },{ 9,6,7,12 },{ 4,15,14,1}};  // made 9 19
		int[][] secondArray = { {10,3,2,13},{ 5,10,11,8 },{ 9,6,7,12 },{ 4,15,14,1}};
		int[][] array3 = { {2,7,6},{ 9,5,1 },{4,3,8 } };
		int[][] array4 = { {23,28,21},{ 22,24,26},{ 27,20,25}};
		
		MagicSquare aSquare = new MagicSquare(firstArray);		
		System.out.println(aSquare);
		if (aSquare.isMagicSquare())
			System.out.println("this array is a magic square and its value is " + aSquare.getValue() + "\n");
		else System.out.println("this array is not a magic square \n");
		 	
		MagicSquare a = new MagicSquare(secondArray);		
		System.out.println(a.toString());
		if (a.isMagicSquare())
			System.out.println("this array is a magic square and its value is " + a.getValue() + "\n");
		else System.out.println("this array is not a magic square \n");

		MagicSquare b = new MagicSquare(array3);		
		System.out.println(b.toString());
		if (b.isMagicSquare())
			System.out.println("this array is a magic square and its value is "+b.getValue() + "\n");
		else System.out.println("this array is not a magic square \n");
				
		MagicSquare c = new MagicSquare(array4);		
		System.out.println(c.toString());
		if (c.isMagicSquare())
			System.out.println("this array is a magic square and its value is "+c.getValue() + "\n");
		else System.out.println("this array is not a magic square \n");
	 
	}
	
}
/************** output ************************************************
				The Array:
				16	3	2	13	
				5	10	11	8	
				9	6	7	12	
				4	15	14	1	
				
				this array is a magic square and its value is 34
				The Array:
				10	3	2	13	
				5	10	11	8	
				9	6	7	12	
				4	15	14	1	
				
				this array is not a magic square
				The Array:
				2	7	6	
				9	5	1	
				4	3	8	
				
				this array is a magic square and its value is 15
				The Array:
				23	28	21	
				22	24	26	
				27	20	25	
				
				this array is a magic square and its value is 72
***************************************************************************/