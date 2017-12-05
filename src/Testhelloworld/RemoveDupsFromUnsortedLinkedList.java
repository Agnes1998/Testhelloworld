package Testhelloworld;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDupsFromUnsortedLinkedList {
	
	public LinkedList <Character> cleanList ( LinkedList<Character> inputList )
	{
	    int listCurrentSize = inputList.size();
		HashSet <Character> valueSet = new HashSet<Character> ();
		
		for (Character  c:inputList)
		{
			valueSet.add(c);			
		}
		
		
		if ( listCurrentSize == valueSet.size()) 
		{
			return inputList;
		};

		Character c = inputList.getFirst();
	

	    for ( int i = 0 ; i<inputList.size(); i++ )
	    {
	    	
	    	c= inputList.get(i);
	    	
			if( valueSet.contains(c))
			{//first occurrence
				valueSet.remove(c);				
			}
			else
			{	//duplicate			 
			   for (int j = i ; j< inputList.size(); j++)
			   {
					if( inputList.get(j) == c )
					{  
					    inputList.remove(j);		
					}								
				}
			    i--;// crucial here since the current letter is removed
				
			}
		
		}  

		
		return  inputList;
		
	}

}
