//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		PalinList p = new PalinList("one two three two one"); //new palinlist 
		System.out.println(p.toString()); //print toString
		
		PalinList q = new PalinList("1 2 3 4 5 one two three four five"); //new palinlist
		System.out.println(q.toString()); //print toString

		
		PalinList r = new PalinList("a b c d e f g x y z g f h"); //new palinlist
		System.out.println(r.toString()); //print toString

		
		PalinList s = new PalinList("racecar is racecar"); //new palinlist
		System.out.println(s.toString()); //print toString
		
		PalinList t = new PalinList("1 2 3 a b c c b a 3 2 1"); //new palinlist
		System.out.println(t.toString()); //print toString
		
		
		PalinList u = new PalinList("chicken is a chicken"); //new palinlist
		System.out.println(u.toString()); //print toString

		/* 
1 2 3 4 5 one two three four fivt
a b c d e f g x y z g f h
racecar is racecar
1 2 3 a b c c b a 3 2 1
chicken is a chicken
*/
		
	}
}