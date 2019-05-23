class MarkSheet
{
	  int Eng=60;      //variables 
	  int Comp=60;
	  int java=60;
	  float showTotalMarks()
	  {
	   float TotalMarks=Eng+Comp+java;
	   return TotalMarks;
	  }
	    float showPer()
	  {
	   float Percentage=(120.67f*100)/180.0f;
	   return Percentage;
	  }
	    char showGrade()
	  {
	   char Grade='A';
	   return Grade;
	  }

}



class Task5
{
	public static void main(String [] args)
	{
	          MarkSheet obj=new MarkSheet();
	          System.out.println("The Total Marks Are "+obj.showTotalMarks());
	          System.out.println("The Percentage is  "+obj.showPer());
	          System.out.println("The Grade is  "+obj.showGrade());
	}
}