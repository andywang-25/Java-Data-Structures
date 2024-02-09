//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;
import java.io.*;
import java.math.*;

public class maze_bombs
{
	private static char[][]mat; //normal matrix 
	private static int[][]smat; //path visited already 

	public static void solve(int r, int c, int s) 
	{
		//if rows or columns is below 0, you are out of bounds! 
		//if r>=mat.length or c>=mat[r].length you are out of bounds 
		//if smat[r][c] <=s , keep  track of most efficient path 
		//if mat[r][c] is '#', you are currently in a wall 
		if (r<0 || c<0 || r>=mat.length || c>=mat[r].length || smat[r][c] <= s)
			return;
		if (mat[r][c]=='#') 
			s++; //use a bomb to break through wall 
		smat[r][c] = s; //set smat square to number of bombs used 
		solve(r+1, c, s);
		solve(r-1, c, s);
		solve(r, c+1, s);
		solve(r, c-1, s);		
	}
	
	public static void main(String[]args) throws Exception
	{
		Scanner file=new Scanner(new File("maze_bombs.dat"));

		while(file.hasNext()) {
			int size = file.nextInt(); //next int is num of rows and columns 
			file.nextLine();  //go to next line 
			smat = new int[size][size];  //create new boolean matrix (store true and false for every square)
			mat = new char[size][size]; //create new boolean matrix containing characters of '.' and '#'
			for (int i = 0; i < size; i++) {
				Arrays.fill(smat[i], Integer.MAX_VALUE); //fill entire smat array as big number 
				mat[i] = file.nextLine().trim().toCharArray();
				System.out.println(mat[i]); 
			}
			solve(0,0, 0); //start at the origin (0,0) and search through the matrix 
			if (smat[size-1][size-1] == Integer.MAX_VALUE) //the exit was never modified, remained as max integer 
				System.out.println("no exit found");
			else 
				System.out.println(smat[size-1][size-1] + " bombs"); //the exit's steps 
		}
	}	
}
