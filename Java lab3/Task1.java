import java.util.*;
class Task1
{
	
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);

	System.out.println("C++ Marks:");
	int Cp=input.nextInt();
	System.out.println("Data Structure Marks:");
	int DataStructure=input.nextInt();
	System.out.println("Operating System Marks:");
	int OperatingSys=input.nextInt();
	int totalmarks=300;
	System.out.println("Total Marks:"+totalmarks);
	int obtMarks=Cp+DataStructure+OperatingSys;
	System.out.println("Obtained Marks:"+obtMarks);
	long per=(obtMarks*100)/300;
	System.out.println("Percentage:"+per);
	if(per>90)
	{
	System.out.println("Grade A");
	}
	else if(per==90||per>=80)
	{
	System.out.println("Grade B");
	}
	else if(per==79||per>=70)
	{
	System.out.println("Grade C");
	}
	else if(per==69||per>=60)
	{
	System.out.println("Grade D");
	}
	else if(per<60)
	System.out.println("You Are Fail");
	}
}