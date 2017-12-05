

package Testhelloworld;
import java.util.HashSet;

public class  IsUnique {
	public boolean isUniqueMethod (String str1)
	{
	char[] array = str1.toCharArray();
	
	HashSet<Character>  mysetOfChars = new HashSet<Character>();
	
	for (char c : array)
	{
	 mysetOfChars.add(c);
	}
	System.out.println(str1 + " " + mysetOfChars.size()  );

	return mysetOfChars.size() == array.length;
	
	}
}
