//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;
import java.io.*;
import java.math.*;

public class Maze_Simple 
{
	private static char[][]mat; //normal matrix 
	private static boolean[][]smat; //path visited already 

	public static void solve(int r, int c) 
	{
		//if rows or columns is below 0, you are out of bounds! 
		//if r>=mat.length or c>=mat[r].length you are out of bounds 
		//if smat[r][c] is true, you already visited this square 
		//if mat[r][c] is '#', you are currently in a wall 
		if (r<0 || c<0 || r>=mat.length || c>=mat[r].length || smat[r][c] || mat[r][c]=='#')
			return;
		smat[r][c] = true; //set this square to true, already been there! 
		solve(r+1, c);
		solve(r-1, c);
		solve(r, c+1);
		solve(r, c-1);		
	}
	
	public static void main(String[]args) throws Exception
	{
		Scanner file=new Scanner(new File("maze_simple.dat"));

		while(file.hasNext()) {
			int size = file.nextInt(); //next int is num of rows and columns 
			file.nextLine();  //go to next line 
			smat = new boolean[size][size];  //create new boolean matrix (store true and false for every square)
			mat = new char[size][size]; //create new boolean matrix containing characters of '.' and '#'
			for (int i = 0; i < size; i++) {
				Arrays.fill(smat[i], false); //fill entire smat array as false
				mat[i] = file.nextLine().trim().toCharArray();
				System.out.println(mat[i]); 
			}
			solve(0,0); //start at the origin (0,0) and search through the matrix 
			if (smat[size-1][size-1]) //if the exit is true (visited) then exit is foun d 
				System.out.println("exit found");
			else 
				System.out.println("no exit found"); 
			 

		}
		
		
		//read in the maze data
		
		//call the solve method
		
		//print out some stuff
	}	
}
