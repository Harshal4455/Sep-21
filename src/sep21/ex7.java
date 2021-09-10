package sep21;

public class ex7 
{
	public static void main(String[] args)
	{
		int num=153;
		int rem = 0;
		int sum = 0;
		for(int i = num;i>0;i=i/10)
		{
			rem = i%10;
			sum = sum + (rem*rem*rem); 
		}
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("Given num is armstrong ");
			
		}
		else {
			System.out.println("Givne Num is not armstraong");
		}
		
	}

}
