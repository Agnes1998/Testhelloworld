
package Testhelloworld;


import java.util.LinkedList;
import java.util.Stack;

public class HelloWorld {
	
	public static void main (String[] s)
	{
		System.out.println("Hello world!");
		 
		IsUnique B1 = new IsUnique();
		
		System.out.println(B1.isUniqueMethod("Agnieszka"));
		System.out.println(B1.isUniqueMethod("Jerzy"));
		System.out.println(B1.isUniqueMethod("agnieszka"));
		
		Permutation P1 = new Permutation();
		
		System.out.println("Permutation  \"abc\", \"BVC\"  " + P1.isPermutation("abc", "BVC"));
		System.out.println("Permutation \"abc\", \"abc\"  " + P1.isPermutation("abc", "abc"));
		System.out.println("Permutation \"bca\", \"abc\"  " + P1.isPermutation("bca", "abc"));
		System.out.println("Permutation \"abbbca\", \"bbaabc\"  " + P1.isPermutation("abbbca", "bbaabc"));
		System.out.println("Permutation \"Agnieszka Wojciechowski\", \"Wociechowski Agnieszka \" " + P1.isPermutation("Agnieszka  Wojciechowski", "Wociechowski Agnieszka"));
		System.out.println("Permutation \"Jerzy wojciechowski\", \"Wojciechowski Jerzy\"  " + P1.isPermutation("Jerzy wojciechowski", "Wojciechowski Jerzy"));
		System.out.println("Permutation \"Agnieszka Wojciechowski\", \"Wojciechowski Agnieszka\" " + P1.isPermutation("Agnieszka Wojciechowski", "Wojciechowski Agnieszka"));
	
	    OneAway Oa1 = new OneAway();
	    
		System.out.println("One Away  \"abc\", \"BVC\"  " + Oa1.isOneAway("abc", "BVC"));
		System.out.println("One Away  \"Jerzy Wojciechowski\", \"Wojciechowski Jerzy\" " +Oa1.isOneAway ("Jerzy Wojciechowski", "Wojciechowski Jerzy"));
		System.out.println("One Away  \"Agnieszka Wojciechowski\", \"Agnieszka Wojciechowski\" " +Oa1.isOneAway ("Agnieszka Wojciechowski", "Agnieszka Wojciechowski"));
		System.out.println("One Away  \"Jerzy Wojci echowski\", \"Jerzy Wojciechowski\" " +Oa1.isOneAway ("Jerzy Wojci echowski", "Jerzy Wojciechowski"));
		System.out.println("One Away  \"Jerzy Wojczechowski\", \"Jerzy Wojciechowski\" " +Oa1.isOneAway ("Jerzy Wojczechowski", "Jerzy Wojciechowski"));
		System.out.println("One Away  \"Jerzy Wojczychowski\", \"Jerzy Wojciechowski\" " +Oa1.isOneAway ("Jerzy Wojczychowski", "Jerzy Wojciechowski"));
		System.out.println("One Away  \"Agnieszka Wojciechowski\", \"Agnieszka Wojciechowskia\" " +Oa1.isOneAway ("Agnieszka Wojciechowski", "Agnieszka Wojciechowskia"));
		
		IsSubsring Is1 = new  IsSubsring();
		
		System.out.println("Is Substring  \"Jerzy Wojciechowski\", \"kiJerzy Wojciechows\" " +Is1.isSubstringRotation ("Jerzy Wojciechowski", "kiJerzy Wojciechows"));
		
	    
	    
	    // I will build linked list input
	    String s1 = "Agnieszka Wojciechowski oraz Jerzy Wojciechowski";
	    char  a1[] = s1.toCharArray();
	    LinkedList <Character> linked = new LinkedList<Character>();
	    LinkedList <Character> cleaned = new LinkedList<Character>();
	    for (int i = 0 ; i< a1.length; i++)
	    {
	    	linked.addLast(a1[i]);    		    
	    }	
	    LinkedList <Character> linked1 =new LinkedList<>();
	    LinkedList <Character> linked2 =new LinkedList<>();
	    linked1 = linked;
	    linked2 =linked;
	    
	    RemoveDupsFromUnsortedLinkedList RD1 = 	new RemoveDupsFromUnsortedLinkedList ();
	    cleaned = RD1.cleanList(linked);
		System.out.println("RemoveDups from linked list " + s1);	
		System.out.println("Linked List Content: " +cleaned.toString());
	
	    
		RemoveDupsFromUnsortedLinkedListJ RDJ1 = new RemoveDupsFromUnsortedLinkedListJ();
		cleaned = RDJ1.cleanList(linked1);
		System.out.println("RemoveDups from linked list J " + s1);	
		System.out.println("Linked List Content: " +cleaned.toString());
		
		LinkedListCleaningEasy EJ1 = new LinkedListCleaningEasy();
		cleaned = EJ1.cleanList(linked2);
		System.out.println("RemoveDups from linked list J " + s1);	
		System.out.println("Linked List Content: " +cleaned.toString());
		
		
		ReturnKthtolastinLinkedList RK1 = new ReturnKthtolastinLinkedList();
		
		Object o = RK1.ReturnKthtolastinLinkedList(linked, 6);
		if ( o != null)
		{
		System.out.println("Return 6 th to last in Linked List " + o.toString());	
		}
		else 
		{
			System.out.println("The list is too short");	
	    }	
		
		Object o1 = RK1.ReturnKthtolastinLinkedList(linked, 66);
		if ( o1 != null)
		{
		    System.out.println("Return 6 th to last in Linked List " + o1.toString());
		}
		else 
		{
			System.out.println("The list is too short");	
		}	
		
		LinkedList <Character> cleaned2 = new LinkedList<Character>();
		DeleteMiddleNode DN1 = new DeleteMiddleNode();
		linked.clear();
		for (int i = 0 ; i< a1.length-1; i++)
		{
		    	linked.addLast(a1[i]);    		    
		}	
		//linked2 = linked;  // this  is address only of the list
		
		linked2 =(LinkedList<Character>) linked.clone();
		System.out.println("Linked list2 input size before adding: " + linked2.size());
		linked2.add(('i'));
		System.out.println("Linked list2 input size after adding: " + linked2.size());
		System.out.println("Linked list original  input size: " + linked.size());
		
		System.out.println("                  ***********             *********************                 ");
		System.out.println("                               ");
		System.out.println("                  ***********             *********************                 ");
		
		System.out.println("Linked list input content: " + linked.toString());
		System.out.println("Linked list input size: " + linked.size());
		System.out.println("Remove middle element from linked list input " + s1.substring(0,s1.length()-1));
		cleaned2 = DN1.deleteMiddleNode(linked);		
		System.out.println("Remove middle element Linked List Content Result: " + cleaned2.toString());
		
		System.out.println("                  ***********             *********************                 ");
		System.out.println("                                   ");
		System.out.println("                  ***********             *********************                 ");
		System.out.println("Remove middle element from linked list input " + linked2);
		System.out.println("Linked list input size: " + linked2.size());
		cleaned = DN1.deleteMiddleNode(linked2);		
		System.out.println("Remove middle element Linked List Content Result: " + cleaned.toString());
	 
		
		System.out.println("");
		
		Stack <Integer> st = new Stack <>();
	    for (int i=0; i<20; i++)
	    {
            st.push((int)(Math.random()*1000));
        }
	    Stack <Integer> stJ = (Stack <Integer>) st.clone();
	    
		Stacksorter SS = new Stacksorter();
		
		Stack <Integer> re = new Stack <>();
		re = SS.sortStack(st);
		for ( int i = 1; i<20 ; i++)
		{
			System.out.println("Elements " + re.pop());
		}

		SortedTreeJ STJ = new SortedTreeJ();
		Stack <Integer> re1 = new Stack <>();
		re1 = STJ.sortedTreeJ(stJ);
		for ( int i = 1; i<20 ; i++)
		{
			System.out.println("Elements " + re1.pop());
		}
		
		
		
	
	}
	
	
}

