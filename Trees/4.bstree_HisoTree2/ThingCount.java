//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data E block

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
		count = 1;//set default count to one 
	}
	
	public ThingCount(Object thang, int cnt) //constructor 
	{
		thing = thang; 
		count = cnt; 

	}

	public void setThing(Object obj) //set thing 
	{
		thing = obj; 
		
	}
	
	public void setCount(int cnt) //set count 
	{
		count = cnt; 

	}
	
	public Object getThing() //return thing (value)
	{
		return thing; 
	}

	public int getCount() //return count 
	{
		return count;
	}
	
	public boolean equals(Object obj) //check if equal to another Thing 
	{
		ThingCount other = (ThingCount)obj;
		//check if the "other" getThing is equal to the current "thing", and if their get count is equal to current get count 
		if (other!=null) {
			if (other.getThing().equals(getThing()) && other.getCount() == getCount()) 
				return true;
		}
		return false;
	}
	
	public int compareTo(Object obj) //compare to another Thing 
	{
		ThingCount other = (ThingCount)obj;

		if (other!=null) {
			return ((Comparable) getThing()).compareTo((other.getThing()));
		}
		return -1;		
	}
	
	public String toString() //to string 
	{
		return ""+thing + " - " + count;
	}
}