//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class Words
{
	private Map<String, Integer> m;
	
	public Words()
	{
		m = new HashMap<String,Integer>();
		m.put("one",1);
		m.put("five",5);
		m.put("eight",8);
		m.put("nine",9);					
	}
	
	public int getNumber( String s )
	{
		return m.get(s);
	}

}