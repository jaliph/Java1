package code.monk.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_Queen {
	
	int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
		N_Queen nq = new N_Queen();
		nq.solveNQueen(N);
	}
	public void printMatrix(int[][] board){
		for(int i = 0 ; i < board.length ; i++ ){
			for(int j = 0 ; j < board[i].length; j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public boolean solveNQueen(int n){
		this.N = n;
		int[][] board = new int[this.N][this.N];
		if(NQueen(board, this.N)){
			printMatrix(board);
			//System.out.println("Done");
			return true;
		}else{
			System.out.println("Solution nt available");
			return false;
		}
	}
	
	public boolean isAttacked(int x ,int  y, int[][] board, int n){
		//straight
		for(int i=0; i<n; i++) if(board[x][i] == 1) return true;
		for(int i=0; i<n; i++) if(board[i][y] == 1) return true;

		//diagonals
		for(int i=0;i<n;i++)
			for(int j=0; j<n;j++)
				if(board[i][j] == 1 && (i+j == x + y || i-j == x - y )) return true;
		return false;
	}
	
	public boolean NQueen(int[][] board, int N){
		if( N == 0 ){
			return true;
		}
		for(int  i = 0 ; i < board.length ; i++ ){
			for(int j = 0 ; j < board[i].length; j++){
				if(isAttacked(i, j, board, board.length)){
					continue;
				}
				board[i][j] = 1;
				if(NQueen(board, N-1)){
					return true;
				}
				board[i][j] = 0;
			}
		}
		return false;
	}
}
