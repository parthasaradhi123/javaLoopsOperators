
public class TernaryOperatory {

	public static void main(String[] args)
	{
		int a =10;
		int b = 20;
		int c = 3;
		
		//int c = (a<b)?a:b;
		//System.out.println(c);
	
		int d  = (a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println(d);
		
	
	}

}
