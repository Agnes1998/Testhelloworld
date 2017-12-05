package Testhelloworld;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDupsFromUnsortedLinkedListJ {
	
		
		public LinkedList <Character> cleanList ( LinkedList<Character> inputList )
		{
		    
			HashSet <Character> valueSet = new HashSet<Character> ();
			LinkedList<Character> cleaned = new LinkedList<> ();
		


	        for (char c : inputList) {
	           if (valueSet.contains(c)) 
	           {
	            }
	            else 
	            {
	                cleaned.add(c);
	                valueSet.add(c);
	            }
	        }
	                return cleaned;
		}
}
