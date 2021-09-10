package sep21;

public class ex11 
{
	public static void main(String[] args) 
	{
		int num = 12345;
		int num1 = 0;
		int rem = 0;
		for(int i =num;i>0;i=i/10)
		{
			rem = i%10;
			num1=num1*10+rem;
		}
		System.out.println(num1);
		
	}

}
