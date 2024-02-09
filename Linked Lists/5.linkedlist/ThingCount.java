import javax.management.RuntimeErrorException;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang 

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
		count =0; //set count to 0 
		thing = null; //set thing to null
	}
	
	public ThingCount(Object thang, int cnt) //constructer 
	{
		thing = thang; //set thing as thang 
		count = cnt; //set count as cnt 
	}
	
	public int getCount()
	{
		return count; //returns count 
	}
	
	public void setCount(int cnt)
	{
		count = cnt; //sets count as cnt (given)
	}

	public void setThing(Object obj)
	{
		thing = obj; //sets thing as object
	}	
	
	public Object getThing()
	{
		return thing; //returns thing 
	}
	
	public boolean equals(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if (other.getThing().equals(thing)) { //compares "other" thing to our own thing value 
			if (other.getCount()==count) return true; //compare the countr value after confirming thing valure is true 
		}
		return false;
	}
	
	public int compareTo(Object obj)
	{
		// If the class of obj and thing are not the same, throw a runtime error
		ThingCount other = (ThingCount)obj;
		if(!other.getThing().getClass().equals(getThing().getClass())){
			throw new RuntimeException("Objects are not the same type");
		}
		// If the class of obj is not a Comparable, and the class of thing is a Comparable, throw a runtime error
		if(!(other.getThing() instanceof Comparable) && getThing() instanceof Comparable){
			throw new RuntimeException("Object is not comparable");
		}

		// Returns the difference between the count of thing and the count of obj
		return ((Comparable)getThing()).compareTo(other.getThing());
			
	}
	
	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}