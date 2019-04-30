class Task7
{
	public static void main(String args[])
	{
		int temp;
		int []n={10,20,45,67,89};
		for(int k=1;k<n.length;k++)
		{
			for(int j=1;j<=n.length-k;j++)
			{
				if(n[j]>n[j+1])
				{
					temp=n[j];
					n[j+1]=n[j];
					n[j+1]=temp;
				}
			}
			for( k=1;k<n.length;k++)
			{
				System.out.println(" "+n[k]);
			}
		}
	}
}