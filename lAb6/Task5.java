class Student
{
	    String name;
		int age;
		String address;
		Student()						//default constructor
		{ 
			name="null";
			age=0;
			address="not available";


		} 								//first constructor end
		void SetInfo(String name,int age)      //parameterized mehod
        {
        	this.name=name;
        	System.out.println("Name:"+name);
        	this.age=age;
        	System.out.println("Age:"+age);
        }  									//end method
        void SetInfo(String name,int age,String address)					//parameterized method
        {
             this.name=name;
             System.out.print("\n\n\n");
             System.out.println("Name:"+name);
             this.age=age;
             System.out.println("Age :"+age);
             this.address=address;
             System.out.println("Address:"+address);
        }												//2nd method end
}   

class Task5
{
         public static void main(String args [])
         			{
         				Student [] obj=new Student[10];
         				Student obj1=new Student();
         				obj[0]=new Student();
         				obj[0].SetInfo("Farhana",23,"Muet");
         				obj[1]=new Student();
         				obj[1].SetInfo("Ali",20,"Muet");
                                        obj[2]=new Student();
         				obj[2].SetInfo("Amina",12,"Muet");
         				obj[3]=new Student();
         				obj[3].SetInfo("Rabia",18,"Muet");
         				obj[4]=new Student();
         				obj[4].SetInfo("Aemon",19,"Muet");
         				obj[5]=new Student();
         				obj[5].SetInfo("Durdana",20,"Muet");
         				obj[6]=new Student();
         				obj[6].SetInfo("Pirih",19,"Muet");
         				obj[7]=new Student();
         				obj[7].SetInfo("Kailash",20,"Muet");
         				obj[8]=new Student();
         				obj[8].SetInfo("Roomasa",19,"Muet");
         				obj[9]=new Student();
         				obj[9].SetInfo("Unza",22,"Muet");
                                      


                       
         			
         			}
}

