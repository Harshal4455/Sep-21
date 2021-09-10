package sep21;

public class ex4
{
	public static void main(String[] args) 
	{
		int nums = 12345;
		
		
		String num1=Integer.toString(nums);
		String revnum = "";
		for(int i=num1.length()-1;i>=0;i--)
		{
			revnum = revnum+num1.charAt(i);
		}
		
		int revnum1 = Integer.parseInt(revnum);
		System.out.println(revnum1);
	}

}
