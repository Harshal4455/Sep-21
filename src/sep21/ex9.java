package sep21;

public class ex9
{
	public static void main(String[] args) 
	{
		String str = "A BC  DE FF   H";
		int count = 0;
		
				
		
		for(int i =0;i<=str.length()-1;i++)
		{
			char charvalue = str.charAt(i);
			if(charvalue==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
