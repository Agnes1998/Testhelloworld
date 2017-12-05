
package Testhelloworld;


import java.util.LinkedList;

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
	    
	    RemoveDupsFromUnsortedLinkedList RD1 = 	new RemoveDupsFromUnsortedLinkedList ();
	    cleaned = RD1.cleanList(linked);
		System.out.println("RemoveDups from linked list " + s1);	
		System.out.println("Linked List Content: " +cleaned.toString());
	
	    
		RemoveDupsFromUnsortedLinkedListJ RDJ1 = new RemoveDupsFromUnsortedLinkedListJ();
		cleaned = RDJ1.cleanList(linked);
		System.out.println("RemoveDups from linked list J " + s1);	
		System.out.println("Linked List Content: " +cleaned.toString());
		
		LinkedListCleaningEasy EJ1 = new LinkedListCleaningEasy();
		cleaned = EJ1.cleanList(linked);
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
		
		cleaned2 = DN1.deleteMiddleNode(linked);
		//System.out.println("Remove middle element from linked list  " + s1);	
		//System.out.println("Linked List Content: " + cleaned2.toString());
		
		
	    
	}
	
}

