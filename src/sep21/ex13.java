package sep21;

public class ex13 
{
	public static void main(String[] args)
	{
		
		String str = "ABCD XYZJ JKLM NOPQ RSTU VWXZ";
		
		String ar[]= str.split(" ");
		
		for(int i = 0;i<=ar.length-1;i++)
		{
			if(i%2 != 0)
			{
			String s1=ar[i];
			ar[i]=reversestr(s1);
		    }
			}
		for(int i = 0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

	private static String reversestr(String inp) 
	{
		String rev = "";
		for(int i=inp.length()-1;i>=0;i--)
		{
			rev=rev+inp.charAt(i);
		}
		
		
		return rev;
	}
		
	

}
