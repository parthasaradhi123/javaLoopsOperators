
public class ConditionalOperator {

	public static void main(String[] args) 
	{
		int a =11;
		int b = 5;
		
		if(a>b)
		{
			if (a == 10)
			{
				int res = a-b;
				System.out.println("subtraction result is :: "+res);
			}
			else
			{
				System.out.println("A is not equal to 10");
			}
		}
		else if(a == b)
		{
			int res = a+b;
			System.out.println("addition result is :: "+res);
		}
		else if(a<b)
		{
			int res = a*b;
			System.out.println("mul result is :: "+res);
		}
		else
		{
			System.out.println("NOTHING");
		}

	}

}
