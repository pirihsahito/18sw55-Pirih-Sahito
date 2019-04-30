import java.util.Scanner;
class Task6
{
	Run  Debug
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Table No:");
		int table=scan.nextInt();
		System.out.print("Upto:");
		for(int i=1;i<=upto;i++)
		{
			System.out.println(table+"x"+i+":"+i*table);
		}
	}
}