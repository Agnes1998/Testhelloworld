package Testhelloworld;

import java.util.HashMap;

public class Permutation {

	public boolean isPermutation( String str1, String  str2)
	{
	   if (str1.length() != str2.length() )
		   return false;
	   
	    HashMap  <Character, Integer> stringMap1 = stringMap(str1);
	    HashMap  <Character, Integer> stringMap2 = stringMap(str2);
	   
	    if ( !stringMap1.keySet().equals(stringMap2.keySet()))
		   {		   
			   return false;
		   }

	
	   for (Character ch : stringMap1.keySet())
	   {

		    if (	stringMap1.get(ch) !=	stringMap2.get(ch))	    	
		    	  return   false;
	   } 
		return true;
	 
	
	}
	
	public HashMap  <Character, Integer> stringMap (String str1)
	{
	           char[] ss = str1.toCharArray();
	           Character Ch;
			   HashMap  <Character, Integer> hsString  = new HashMap<Character, Integer>();
			   for( char c : ss)
			   {
				   Ch = c;
				   if( hsString.containsKey(Ch))
				   {
					   hsString.put(Ch, hsString.get(Ch)+1);					
				   }
				   else
				   {
					   hsString.put(Ch, 1);						
				   }
			   }
			   
			   return hsString;
	}				
}
