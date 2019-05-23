class Student
{
	 String name;
	 String address;
	 int age;
	 float marks;
	 Student(String name,String address, int age, float marks)
	 {
	 this.name=name;
	 this.address=address;
	 this.age=age;
	 this.marks=marks;
	 }
	 String displayName()
	 {

	 return name;
	 }
	 String displayAddress()
	 {
	 return address;
	 }
     int displayAge()
	 {
	 return age;
	 }
     float displayMarks()
	 {
	 return marks;
	 }


}
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


class Result
{
	Student s1;
	MarkSheet m1;
	 			Result(Student obj1,MarkSheet obj2)
	 			{
	 			s1=obj1;
	 			m1=obj2;
	 		}
	 			void createStudentResult()
	 			{
	 			System.out.println(s1.displayName());
	 			System.out.println(s1.displayAddress());
	 			System.out.println(s1.displayAge());
	 			System.out.println(s1.displayMarks());
	 			System.out.println("Student marksheet:");
	 			System.out.println(m1.showTotalMarks());
	 			System.out.println(m1.showPer());
	 			System.out.println(m1.showGrade());
	 			}
}
class Task6
{
			public static void main(String args[])
			{
						Student obj1=new Student("Ali","Jamshoru",19,675);
                        
						MarkSheet obj2=new MarkSheet();
						
						
						Result obj3=new Result(obj1,obj2);
						obj3.createStudentResult();
			}	
}