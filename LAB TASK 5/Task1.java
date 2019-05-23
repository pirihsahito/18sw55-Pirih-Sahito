import java.util.*;
class Task1
{
	Scanner input=new Scanner(System.in);
	int[]arr=new int[6];
	void populateArray()
	{
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=input.nextInt();

	}
	}
	void Tocheck()
	{
     for(int j=0;<arr.length;j++)
     if(arr[j]%==0)
     {
     System.out.println("Number is even at index["+ j +"]:"); 
     continue;
     }	

	}
	System.out.println("\n\n");
	for(int l=0;l<arr.length;l++)
	{
	if(arr[l]%2!=0)
	{
	System.out.println("Number is odd at index");
	continue;
	}
	}
}