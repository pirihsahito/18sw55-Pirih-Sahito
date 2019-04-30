import java.util.*;
class Task3
{
	public static void main(String[] args)
	{
		int sum=0;
		int x,i=1;
		System.out.println("Enter Numbers:");
		Scanner input=new Scanner(System.in);
		x=input.nextInt();
		while(i<=x)
		{
			sum+=1;
			i++;
		}

		System.out.println("Sum Of"+x+"Numbers is:"+sum);
	}
}