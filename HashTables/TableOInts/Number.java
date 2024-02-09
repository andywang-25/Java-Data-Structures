//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang 

public class Number
{
	private int theValue;
	
	public Number(int value)
	{
		theValue = value; //set theValue to the number 

	}	
	
	public int getValue() //return the number value 
	{
		return theValue;
	}
	
	
	public int hashCode() //return the hashcode (%10)
	{
		return (theValue%10);
	}

	public String toString() //print it out 
	{
		return "";
	}	

	
	public boolean equals(Object obj) { //equals method, checks if equal to another obj 
		return (theValue == (((Number)obj)).getValue());
	}
	
}