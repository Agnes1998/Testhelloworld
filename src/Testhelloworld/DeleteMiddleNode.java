package Testhelloworld;

import java.util.LinkedList;

public class DeleteMiddleNode {
	
	public LinkedList deleteMiddleNode(LinkedList lList)
	{
		if (lList.size()%2 == 0 )
		{
			System.out.println("No middlenode present to bedin with");	
			return lList;
		}
		else
		{ 
			lList.remove((lList.size()- 1)/2 + 1);		
		}
		
		return lList;
		
	}
	
	

}
