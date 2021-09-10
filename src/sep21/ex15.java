package sep21;

import java.util.HashMap;
import java.util.Set;

public class ex15 
{
	public static void main(String[] args)
	{
		String str = "abcdfgertlskjsdkhhhhhhhhh";
		
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for(int i = 0;i<=str.length()-1;i++)
		{
			char charvalue = str.charAt(i);
			if(mp.containsKey(charvalue))
			{
				mp.put(charvalue, mp.get(charvalue)+1);
			}
			else
			{
				mp.put(charvalue, 1);
			}
		}
		
		Set<Character> keys = mp.keySet();
		
		for(Character key:keys)
		{
			System.out.println(key + ":" + mp.get(key));
		}
	}

}
