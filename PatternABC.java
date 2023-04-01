
public class PatternABC {

	public static void main(String[] args) 
	{
		int n = 12;
		 int i ;
		 int j;
		 
		 for (i =0;i<n;i++)
		 {
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
			 for(j=0;j<n;j++)
			 {
				 if((j==0)||( i==0 && j<3*n/4)||( i == (n-1)/2 && j<3*n/4)||(i== n-1 &&j< 3*n/4)||
							(j==3*n/4 && i>0 && i != (n-1)/2 && i<n-1))
						 
				 {
					 System.out.print("B");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
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
//			 for(j=0;j<n;j++)
//			 {
//				 if(()||()||())
//						 
//				 {
//					 System.out.print("C");
//				 }
//				 else
//				 {
//					 System.out.print(" ");
//				 }
//			 }
			 System.out.println();
		 }

		 

	}

}
