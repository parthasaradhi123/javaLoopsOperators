
public class Pattern1 {

	public static void main(String[] args) 
	{
	
		int n = 10;
		int i;
		int j;
		
		for(j=0;j<n;j++)
		{
			for(i=0;i<n;i++)
			{
				if(i==0 ||i==n-1||j==0||j==n-1 || j== (n-1)/2 || i == (n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
