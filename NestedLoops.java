
public class NestedLoops
{

	public static void main(String[] args) 
	{
		int i;
		int n= 10;
		
		int j;
		int m = 10;
	
		for (j=0;j<m;j++) // For j= 0 the inner loop will run 5 times and exit the loop the outer loop updation 
			//occurs and for j =1 5times, j=2 5times, j = 3 5times j = 4 5times and now the outer loop condition
			// is 5<5 which means the outer loop condition fails and loop terminates.
		{
			for(i =0;i<n;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
