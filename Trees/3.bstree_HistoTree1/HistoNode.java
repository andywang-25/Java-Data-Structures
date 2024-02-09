//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data E block

public class HistoNode
{
	private Comparable data;
	private int dataCount;
	private HistoNode left;
	private HistoNode right;

	public HistoNode(Comparable d, int cnt, HistoNode lft, HistoNode rt) //constructor 
	{
		data=d;
		dataCount=cnt;
		left=lft;
		right=rt;
	}

	public Comparable getData() //return data 
	{
		return data;
	}

	public int getDataCount() //return dataCount 
	{
		return dataCount;
	}

	public HistoNode getLeft() //return left node 
	{
	   return left;
	}

	public HistoNode getRight() //return right node 
	{
	   return right;
	}

	public void setData(Comparable d) //set data to d 
	{
		data=d;
	}

	public void setDataCount(int cnt) //set count to cnt 
	{
		dataCount=cnt;
	}

	public void setLeft(HistoNode lft) //set left node 
	{
		left=lft;
	}

	public void setRight(HistoNode rt) //set right node 
	{
		right=rt;
	}
}


