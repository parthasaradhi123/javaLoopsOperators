
public class Pattern2 {

	public static void main(String[] args) 
	{
		int n = 5;
		int i;
		int j;
		
		 for(i =0;i<n;i++)
		{
			 for(j=0;j<n;j++)
			 {
				 if(j==0|| j==n-1 ||i== (n-1)/2)
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
