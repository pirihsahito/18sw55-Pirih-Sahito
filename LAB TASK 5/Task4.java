class student
{
	 String name;
	 String address;
	 int age;
	 float marks;
	 student(String name,String address, int age, float marks)
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

class Task4
{
	public static void main(String args [])
	{
	        student obj=new student("Farhana","Jam Shoru",19,766.8f);
	        System.out.println("Student Name Is "+obj.displayName());
	        System.out.println("Student Address Is "+obj.displayAddress());
	        System.out.println("Student Age Is "+obj.displayAge());
	        System.out.println("Student Marks Are "+obj.displayMarks());
	}
}