package Testhelloworld;

public class IsSubsring {

	
	//this is so called rotation check
	public boolean isSubstringRotation (String str1, String str2)
	{
		if( str1.length() != str2.length()) return false;
		String str3 = str1+ str1;
	
		
		if( ! str3.contains(str2)) return false;
		

		return true;
		
		
	}

}
