package sep21;

public class ex3
{
	public static void main(String[] args)
	{
		String str = "1234ABCD$%";
		
		String digit = "";
		String other = "";
		
		for(int i = 0;i<=str.length()-1;i++)
		{
			char charvalue = str.charAt(i);
			if(Character.isDigit(charvalue))
			{
				digit=digit+charvalue;
			}
			else {
				other=other+charvalue;
			}
			
		}
		System.out.println(digit);
		System.out.println(other);
	}

}
