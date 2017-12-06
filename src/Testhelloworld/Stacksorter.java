package Testhelloworld;

import java.util.Stack;

public class Stacksorter {

	public Stack<Integer>  sortStack ( Stack<Integer> st )
	{
		
		Stack <Integer>  st2 = new Stack<Integer>() ;
		
		Integer i =1;
	    Integer counter= 0;
	    Integer maxCandidate;
	    if (!st.isEmpty())
	    {
	        maxCandidate = 	 st.pop(); ;
	    }
	    else 
	    {  
	    	System.out.println( "0 elements in stack " );
	    	return st;
	    }
	    
	    
	    while( !st.isEmpty())
	    {
	    	i++;
	    	
            if ( maxCandidate > st.peek())
            {
            	st2.push(st.pop());
            }
            else
            {
            	st2.push(maxCandidate);
            	maxCandidate =st.pop();            	
            }	
	    }
	    
	    
	    
	    
	    													//System.out.println( " first element Set  ******************************************************** " + maxCandidate);	  
	    													//System.out.println( "number of elements in stack " + i );
	    													//System.out.println( "First round Our counter count " + counter + "  has max candidate "  + maxCandidate);
	  	
	    
	    
	    while (counter<i )
	    {
	     counter++;	
	     
	     
	     													//System.out.println( "Our counter count " + counter + " ------------- has max candidate "  + maxCandidate + " number on stack i = " + i);
	     
	     
	     //put max on bottom
	     st.push(maxCandidate);	
	     
	     
	     													//System.out.println( ">>>>>>>>>>>>>>>>>>>>>MaxCandidate  " + maxCandidate + " put on stack ----- counter " + counter);
	 
	     moveStack2backToStack1( st2, st );
	 	
	     
	    maxCandidate = st.pop();
	    													//System.out.println( "Top of stack reset  to new MaxCandidate  " + maxCandidate + " counter " + counter);
	    //now we know the number of elements in st is i
	    for (int k = 1 ; k < i-counter  ; k++)
	    {
	    													//System.out.println( " ~~~~~~~~~~  Iteration " +  k + " my MaxCandidate  " + maxCandidate + " counter " + counter);
	    													//System.out.println( " ~~~~~~~~~~  considering " + st.peek());
            if ( maxCandidate > st.peek())
            {
            												//System.out.println( " ============  Iteration " +  k + " my element moved to other pile  " + st.peek());
            	st2.push(st.pop());  //disregard candidate put  to other pile
            }
            else
            {
                st2.push(maxCandidate); //changed max candidate to new element and put old max in another pile
            	maxCandidate = st.pop();
            												//System.out.println( " ================= Iteration " +  k + " my MaxCandidate changed " + maxCandidate + " counter " + counter);
            }	
	    }
	   

	    }
	
	   st.push(maxCandidate);	
	   return st; 
	   
	}
	
	
	void moveStack2backToStack1(Stack<Integer> source,Stack <Integer> destination )
	{
														//int j = 0;
		while( !source.isEmpty())
	    {                                               //j++;
		 												//System.out.println( "Popping  element " + j + "  "  + source.peek()  );
		 destination.push(source.pop());
		
	    }
		 												//System.out.println( "-------------------------------------------Moved " + (j) + "  elements"  );
	}
}
