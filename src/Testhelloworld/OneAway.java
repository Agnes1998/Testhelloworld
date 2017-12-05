package Testhelloworld;

public class OneAway {
	
	//checks if there was 1 edit in the string /letter added, deleted  or changed

	public boolean isOneAway(String str1, String str2)
	{
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		
		
		if (Math.abs( s1.length - s2.length )  >1 )
			return false;
		boolean diff = false;
		boolean firstStrLetterAdded  =  ( s1.length > s2.length) ;
		boolean secondStrLetterAdded  = ( s1.length < s2.length) ;

		for (int  i = 0 ; i< Math.min(s1.length, s2.length); i++)
		{
			
			if (s1[i] != s2[i]) 
			{
						
			 		if (firstStrLetterAdded)
			 		{	
			 			if(	s1[i+1] != s2[i])
			 				return false;
			 		}
			 		if (secondStrLetterAdded)
			 		{	
			 			if(	s2[i+1] != s1[i])
			 				return false;
			 		}	
			 		if (  s1.length ==s2.length && diff)
			 		{	
			 			//the second occurence of the difference
			 			return false;
			 		}		 			
			   
			 	diff = true;
			 
			}
		
		}
		 

	
		return true;
	}//is OneAway
	
	
	
}
