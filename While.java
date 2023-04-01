import java.util.*;
class Partha
{
	int x;
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		l1:while(true)
			{ 
				System.out.println("Enter the value : ");
				x = sc.nextInt();
				if(x>=0 && x<=10)
				{
					break l1;
				}
				else
				{
					System.out.println("Pleae the enter the value with in the Range of 0 to to 10, Thank You");
					System.out.println();
				}
			}
		return x;
	}
}




public class While
{

	public static void main(String[] args) 
	{
		 Partha p = new Partha();
		 int a = p.guessNum();
		 System.out.println("The value enterd by the user is : ");
		 System.out.println(a);
	}

}

