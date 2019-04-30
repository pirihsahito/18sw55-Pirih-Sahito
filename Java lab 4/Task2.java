import java.util.Scanner;
class Task2
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter The Number:");
			int Table=input.nextInt();
			System.out.print("Upto");
			int upto=input.nextInt();
			for(int f=1;f<=upto;f++)
			{
				System.out.println(Table+"*"+f+"="+f*Table);
			}
	}
}