package sep21;

public class ex12
{
	public static void main(String[] args) {
		
		String str = "ABC BCA XYZ ABC1";
		
		String ar[]=str.split(" ");
		
		for(int i = 0 ;i<=ar.length-1;i++)
		{
			if(i%2 != 0)
			{
				String s1=ar[i];
				ar[i]=reverseString(s1);
			}
			
		}
		for(int i = 0 ; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}

	private static String reverseString(String inp) 
	{
		String rev = "";
		for(int i=inp.length()-1;i>=0;i--)
		{
			char charval = inp.charAt(i);
			rev = rev+charval;
		}
		
		return rev;
	}

}
