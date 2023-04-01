
public class LeastNumber {

	public static void main(String[] args) 
	{
//		 int a = 10;
//		 int b = 5;
//		 int c = 3;
//		 
//		 if(a<b)
//		 {
//			 if(a<c)
//			 {
//				 System.out.println("A is the least value :: " +a);
//			 }
//		 }
//		 else if(b<c)
//		 {
//			 if(b<a)
//			 {
//				 System.out.println("B is the least value :: " +b); 
//			 }
//		 }
//		 else
//		 {
//			 System.out.println("C is the least value :: " +c);
//		 }
		int a =10;
		int b = 2;
		int c = 3;
		
		if(a<b || a ==b)//if(a<b && a<c)
		{
			System.out.println("A is the least value :: " +a);
		}
		else if(b<c)
		{
			System.out.println("B is the least value :: " +b);
		}
		else
		{
			System.out.println("C is the least value :: " +c);
		}
	}

}
