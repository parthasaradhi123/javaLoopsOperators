
public class ReverseForLoop {

	public static void main(String[] args) 
	{
		int[] ar = {10,20,30,40,50,60,70};
		//Fetch the values from reverse side
		
		for(int i = ar.length-1; i>=0 ; i--)
		{
			System.out.println(ar[i]);
		}

	}

}
