
public class PatternG {

	public static void main(String[] args) 
	{
		int n = 15;
		 int i ;
		 int j;
		 
		 for (i =0;i<n;i++)
		 {
			 for(j=0;j<n;j++)
			 {
				 if((i==0 && j>0 && j<3*n/4)||
				   (j==0 && i>0 && i<n-1)||
				   ( i==(n-1)/2 && j>= (n-1)/2 && j<=3*n/4)||
				   ( j== 3*n/4 && i >=(n-1)/2)||
				   (i == n-1 && j<(n-1)/2) ||
				   (j==(n-1)/2 && i>=(n-1)/2)
				   )
						 
				 {
					 System.out.print("0");
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
