//(c) A+ Computer Science
//www.apluscompsci.com


//Andy Wang, Winter Term, Algs and Data Structures 


import java.util.*;
import java.io.*;
import java.math.*;

public class stronghold 
{
	private static char[][]mat; //normal matrix 
	private static int[][]smat; //path visited already 
    private static boolean[][]cmat; //mark viable paths 
	public static boolean solved = false; //boolean if the maze is solved 
	public static int ans = 0; //the row index of exit 
	public static int ans2 = 0; //the col index of exit 

	public static void solve(int r, int c, int steps) 
	{
		//if rows or columns is below 0, you are out of bounds! 
		//if r>=mat.length or c>=mat[r].length you are out of bounds 
		//if smat[r][c] <=s , you already visited this square 
		//if mat[r][c] is '#', you are currently in a wall 

        ///base cases 
		//cmat[r][c] will be false if a mob is detected within viscinity of that square 
		if (r<0 || c<0 || r>=mat.length || c>=mat[r].length || smat[r][c] <= steps || mat[r][c] =='#' || mat[r][c] == 'W' || cmat[r][c] == false)
			return;
		/*
		if (r == 0 && c == 0 && mat.length > 3 && mat[r].length > 3) { //at 0,0 origin case. checks if starts within the range of mob 
			if (isMob(r + 1,c) || isMob(r+2,c) || isBadMob(r + 1,c) || isBadMob(r+2, c) || isBadMob(r+3,c))
				return; 
			if (isMob(r,c+1) || isMob(r, c+2) || isBadMob(r, c+1)|| isBadMob(r, c+2) || isBadMob(r,c+3))
				return; 
		}
		*/

		//check for mobs if they are within the square about to be traveled to 
        if (r < mat.length-1) //check for mob to the right 
			checkMob(r+1,c); 
		if (c <  mat[r].length-1) //check for mob above 
			checkMob(r,c+1); 
		if (r > 0) 
			checkMob(r-1,c); //check for mob behind 
		if (c > 0) 
			checkMob(r,c-1); //check for mob below 


		if (mat[r][c] == 'P') { //check for exit square 
			ans = r; //index of exit square to identify the number of steps 
			ans2 = c; 
			solved = true; //found exit 
		}
        
		smat[r][c] = steps++; //add one step to this square 

		solve(r+1, c, steps); 
		solve(r-1, c, steps);
		solve(r, c+1, steps);
		solve(r, c-1, steps);		
	}

    public static void checkMob(int r, int c) {

		//check basic mobs in 4 directions 
        if (r>0 && c>0) { //make sure not out of bounds 
            if (r < mat.length-1 && isMob(r+1,c)) { //check to the right 
                cmat[r][c] = false; //step the square to false, not traversable 
			}
            if (c < mat[r].length-1 && isMob(r,c+1)) { //check up 
				cmat[r][c] = false; 
			}
			if (isMob(r-1,c)) { //check right 
				cmat[r][c] = false;
			}
			if (isMob(r,c-1)) { //check down 
				cmat[r][c] = false; 
			}
        }

		//check bad mobs (skeletons and creepers) in 4 directions 
		//if there is a bad mob, set the 3 trasversable squares in that direction as false 
		if (r > 2 && isBadMob(r-3,c)) { 
			for (int i = 0; i < 3; i++) 
				cmat[r-i][c] = false; 
		} 
		if (c < mat[r].length - 3 && isBadMob(r,c+3)) {
			for (int i = 0; i < 3; i++) 
				cmat[r][c+i] = false; 
		}
		if (r < mat.length - 3 && isBadMob(r+3,c)) {
			for (int i = 0; i < 3; i++) 
				cmat[r+i][c] = false; 
		}
		if (c > 2 && isBadMob(r, c-3)) {
			for (int i = 0; i < 3; i++) 
				cmat[r][c-i] = false; 
		}
    }
    

    public static boolean isMob(int r, int c) { //check if its a basic mob 
        if (mat[r][c] == 'S' || mat[r][c]== 'Z' || mat[r][c] == 'E' || mat[r][c] == 'L' || mat[r][c] == 'C' || mat[r][c] =='F') {
			return true; //return true if a basic mob 
		}
        return false; //return false 
    }
	
	public static boolean isBadMob(int r, int c) { //check if creeper or skeleton, bad mobs 
        if (mat[r][c] == 'K' || mat[r][c]== 'R') { 
			return true; //return true if it is a bad mob 
		}
        return false; //return false 
    }
	
	public static void main(String[]args) throws Exception
	{
		Scanner file=new Scanner(new File("stronghold.dat"));

		while(file.hasNext()) {
			int total = file.nextInt(); //total number of cases 
			file.nextLine(); 

			for (int i = 0; i < total; i++) {
				int rows = file.nextInt(); //next int is num of rows  
				int col = file.nextInt(); //next int is the num of cols 
				file.nextLine();  //go to next line 
				cmat = new boolean[rows][col]; 
				smat = new int[rows][col];  //create new boolean matrix (store true and false for every square)
				mat = new char[rows][col]; //create new boolean matrix containing characters of '.' and '#'

				for (int k = 0; k < rows; k++){
					Arrays.fill(smat[k], Integer.MAX_VALUE); //fill entire smat array as big number 
					Arrays.fill(cmat[k], true); //fill entire cmat array with true 
					mat[k] = file.nextLine().trim().toCharArray();
				}

				for (int r = 0; r < rows; r ++) { //find where T is, the starting point 
					for (int c = 0; c < col; c++) {
						if (mat[r][c] == 'T') 
							solve(r,c,0); 
					}
				}
				
				if (solved) //if a exit was found 
					System.out.println("found exit, steps taken: " + smat[ans][ans2] + ""); //print the amount of steps taken 
				else {
					System.out.println("You cannot afford, ford, ford my diamond SWORD SWORD!" + ""); //no exit found 
				}
				solved = false; //set solved as false so loop keeps going to next case 

			}
		}	
	}	
}

