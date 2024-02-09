//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang 

public class Word
{
	private String theValue;
	
	public Word(String str) { //constructer 
		theValue = str; //set theValue to the string 
	}

	public int hashCode() {
		String vowels = "aeiouAEIOU"; //vowels 
		int totalVowels = 0; //counts total occurances of vowels 
		if (theValue.equals("BOOT")) return 8; //base case 
		
		for (int i = 0; i < theValue.length(); i++) { //for loop going through each letter of the word 
			if (vowels.contains(theValue.substring(i,i+1))) { //finds vowel
				totalVowels++; //add one to total vowels 
			}
		}
		return ((theValue.length() * totalVowels)%10); //returns the strings hashcode by multiplying total vowels by length of word 
	}

	public boolean equals(Object obj) {
		return (theValue.equals(((Word)obj).getValue())); //compares current theValue (string value) to the inserted Word "obj"'s getValue (its string value)
		}

	public String getValue() {
		return theValue; //return the string 
	}
	
	
	
	
	
	
	public String toString() { //toString, returns theValue, the word 
		return (theValue);
	}
	
	

	
}