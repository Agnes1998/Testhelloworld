package Testhelloworld;
import java.util.LinkedList;

public class ReturnKthtolastinLinkedList {
	
  Object ReturnKthtolastinLinkedList ( LinkedList lList, int k )
  
  {
	int i =  lList.size();
	if (i>= k )
	{
    Object o = lList.get(i -k+ 1);
	return o;
	}
	else 
	{ return null;
	
	}
  }

}
