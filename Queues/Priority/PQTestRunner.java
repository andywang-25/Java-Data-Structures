//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		PQTester p = new PQTester("one two three four five six seven"); //new pqtester 
		System.out.println(p.toString());//print toString
		System.out.println(p.getMin()); //print minValue 
		System.out.println(p.getNaturalOrder() + "\n"); //print naturalOrder 

		PQTester i = new PQTester("1 2 3 4 5 one two three four five"); //new pqtester 
		System.out.println(i.toString());//print toString
		System.out.println(i.getMin());//print minValue
		System.out.println(i.getNaturalOrder() + "\n"); //print naturalOrder 

		PQTester o = new PQTester("a p h j e f m c i d k l g n o b"); //new pqtester 
		System.out.println(o.toString()); //print toString 
		System.out.println(o.getMin());//print minValue
		System.out.println(o.getNaturalOrder()); //print naturalOrder 
	}
}