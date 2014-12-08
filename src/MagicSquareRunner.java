/**
 * 
 * @author Derek Wider and Nick Napior
 *
 */
public class MagicSquareRunner {

	public static void main(String[] args) {
		int[][] myInts = {{16,3, 2, 13},
						  {5, 10,11,8},
						  {9, 6, 7, 12},
						  {4, 15,14,1}};
		MagicSquare mySquare = new MagicSquare(myInts);
		System.out.println(mySquare.isMagicSquare());
	}

}
