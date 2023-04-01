
public class Pattern0 {

	public static void main(String[] args) 
	{
		 int n = 10;
		 int i ;
		 int j;
		 
		 for (i =0;i<n;i++)
		 {
			 for(j=0;j<n;j++)
			 {
				 if((i==n/4 && j>n/4 && j<3*n/4)||
				   (j== n/4 && i>n/4 && i<3*n/4)||
				   (i == 3*n/4 && j>n/4 && j<3*n/4)||
				   (j == 3*n/4 && i> n/4 && i<3*n/4))
						 
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
