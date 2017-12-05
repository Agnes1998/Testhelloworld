package Testhelloworld;

import java.util.LinkedList;

public class LinkedListCleaningEasy {
	
	
	public LinkedList <Character> cleanList ( LinkedList<Character> linked )
	{
	  int i = 0;
		  
	  while (i<linked.size()) {
          if (linked.indexOf(linked.get(i)) != i) {
              linked.remove(i);
          } else {
              i++;
          }
      }
	  
	  return linked;
	}

}
