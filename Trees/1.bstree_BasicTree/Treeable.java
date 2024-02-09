//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data E block

public interface Treeable
{
	public Object getValue();
	public Treeable getLeft();
	public Treeable getRight();
	public void setValue(Comparable value);
	public void setLeft(Treeable left);
	public void setRight(Treeable right);
}