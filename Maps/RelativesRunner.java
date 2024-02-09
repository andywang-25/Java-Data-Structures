//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Relatives r = new Relatives(); //create new relatives class 
		Scanner data = new Scanner(new File("relatives.dat")); //new scanner file 

		int num = data.nextInt();
		data.nextLine();


		for (int i = 0; i < num; i++) {

			r.setPersonRelative(data.nextLine());
		}


		while (data.hasNext()) {
			System.out.println(r.getRelatives(data.next()));
		}
		//add more test cases		
	}
}