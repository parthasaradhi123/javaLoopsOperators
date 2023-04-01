
public class ChandanaKrishna {

	public static void main(String[] args) 
	{
		int n= 15;
		int i;
		int j;
		
		for (i =0;i<n;i++)
		{	
			 for(j=0;j<n;j++)
			 {
				 if((i==0 && j>0 && j<3*n/4)||(j==0 && i>0 && i<n-1)||(i == n-1 && j>0 && j<3*n/4))
						 
				 {
					 System.out.print("C");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.print(" ");
			 System.out.print(" ");
			 for(j=0;j<n;j++)
			 {
				 if(j==0 || j ==n-1 ||i ==(n-1)/2)
						 
				 {
					 System.out.print("H");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 
			 }
			 System.out.print(" ");
			 System.out.print(" ");
			 for(j=0;j<n;j++)
			 {
				 if((j==0 && i>0)||(j==3*n/4 && i>0)||(i==(n-1)/2 && j<=3*n/4)||(i==0 && j<3*n/4 && j>0))
						 
				 {
					 System.out.print("A");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 
			 }
			 System.out.print(" ");
			 System.out.print(" ");
				for( j=0;j<n;j++)
				{
				 if(i==j ||  j==0  || j== n-1)
						 
					 {
						 System.out.print("N");
					 }
					 else
					 {
						 System.out.print(" ");
					 }
			   }
				 System.out.print(" ");
				 System.out.print(" ");
				for(j=0;j<n;j++)
				{
					if((i==0 && j<n-1)||j==0||(i==n-1 && j<n-1)||j==n-1 && i>0&&i<n-1)
					{
						System.out.print("D");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				 System.out.print(" ");
				for(j=0;j<n;j++)
				 {
					 if((j==0 && i>0)||(j==3*n/4 && i>0)||(i==(n-1)/2 && j<=3*n/4)||(i==0 && j<3*n/4 && j>0))
							 
					 {
						 System.out.print("A");
					 }
					 else
					 {
						 System.out.print(" ");
					 }
				 }
				System.out.print(" ");
				 System.out.print(" ");
				for(j=0;j<n;j++)
				{
				 if(i==j ||  j==0  || j== n-1)
						 
					 {
						 System.out.print("N");
					 }
					 else
					 {
						 System.out.print(" ");
					 }
				
				}
				System.out.print(" ");
				 System.out.print(" ");
					for(j=0;j<n;j++)
					 {
						 if((j==0 && i>0)||(j==3*n/4 && i>0)||(i==(n-1)/2 && j<=3*n/4)||(i==0 && j<3*n/4 && j>0))
								 
						 {
							 System.out.print("A");
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
