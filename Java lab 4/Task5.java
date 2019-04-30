import java.util.*;

class Task5
{
	public static void main(String[] args)
	{
		int n,max;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Elements Of Array:");
		for(int i=0;i<=n;i++)
		{
			a[i]=input.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.print("Maximum Value:"+max);
	}
}