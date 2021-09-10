package sep21;

public class ex6 
{
	public static void main(String[] args) 
	{
		String str = "madam";
		String str1 = "";
		
		for(int i =str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str.equals(str1))
		{
			System.out.println(" it is a pallindrome");
		}
		else
		{
			System.out.println("it is not pallindrome");
		}
		
	}

}
