
public class suduko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, 
				{ 6, 0, 0, 1, 9, 5, 0, 0, 0 }, 
				{ 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, 
				{ 4, 0, 0, 8, 0, 3, 0, 0, 1 }, 
				{ 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, 
				{ 0, 0, 0, 4, 1, 9, 0, 0, 5 }, 
				{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		int n = 9;
		boolean[][] fixedcells = new boolean[n][n];
		fixedcells(board, fixedcells);

		boolean ans = solvesuduko(board, fixedcells, 0, 0, n);
		if(ans) {
			display(board);
		}else {
			System.out.println("Not solvable");
		}
	}

	public static boolean solvesuduko(int[][] board, boolean[][] fixedcells, int row, int col, int n) {
        if(row==n) {
        	return true;
        }
        if(col==n) {
        	return solvesuduko(board, fixedcells, row+1, 0, n);
        }
		if (fixedcells[row][col]) {
			return solvesuduko(board, fixedcells, row, col + 1, n);
		}

		for (int setnum = 1; setnum <= n; setnum++) {
			boolean canplace = checknumber(board, fixedcells, row, col, n, setnum);
			if(canplace) {
				board[row][col]=setnum;
				boolean checkrest=solvesuduko(board, fixedcells, row, col+1, n);
				if(checkrest) {
					return true;
				}else {
					board[row][col]=0;
				}
			}
		}
		
		return false;
	}

	public static boolean checknumber(int[][] board, boolean[][] fixedcells, int row, int col, int n, int setnum) {
		for(int i=0;i<n;i++){
			if(board[i][col]==setnum){
				return false;
			}
			if(board[row][i]==setnum){
				return false;
			}
		}
		int sqrtN=(int)Math.sqrt(n);
		int startRow=(row/sqrtN)*sqrtN;
		int startCol=(col/sqrtN)*sqrtN;
		for(int i=startRow;i<startRow+sqrtN;i++){
			for(int j=startCol;j<startCol+sqrtN;j++){
				if(board[i][j]==setnum){
					return false;
				}
			}
		}
		
		return true;
	}

	public static void fixedcells(int[][] board, boolean[][] fixedcells) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != 0) {
					fixedcells[i][j] = true;
				}
			}
		}
	}

	public static void display(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}

