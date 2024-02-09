//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data Structure 

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

import java.text.ParsePosition;

public class PostFix
{
	private Stack<Double> stack; 
	private String expression;

	public PostFix()
	{
		setExpression(""); //basic constructor 
	}

	public PostFix(String exp)
	{
		setExpression(exp); //constructer that takes in input of string exp
	}

	public void setExpression(String exp)
	{
		stack = new Stack<Double>(); //make new double stack 
		expression = exp; //expression equals the inputted string 
	}

	public double calc(double one, double two, char op) //calculate method 
	{
		if (op == '+') { //if plus sign 
			return one + two; //add the two values 
		}
		if (op == '-') { //if minus sign 
			return one - two; //subtract the 2 values 
		}
		if (op == '/') { //if division sign 
			return one / two; //divide the first value by second 
		}
		if (op == '*') { //if multiply sign 
			return one * two; //multiply the 2 values 
		}
		return 0.0;
	}

	public void solve()
	{
		for (String s : expression.split(" ")) { //solve the given equation 
			char c = s.charAt(0); //c is the first character at the loop
			if (Character.isDigit(c)) { //if they are not operators, they are a number! 
				Double d = (double)c -48; //turn the character into a double, d 
				stack.push(d); //add the double to the stack 
			}
			else { //else they are operator (assuming there are no character inputs in string)
				double num1 = stack.pop(); //set the first number popped to num1
				double num2 = stack.pop(); //the second number popped (before first) is num2
				
				stack.push(calc(num2,num1,c)); //do calculation using the nums given and operator 
			}							 		
		}
	}

	public String toString() {
		return "" + stack + ""; //to string, prints out the stack 
		
	}

	//add a toString
}