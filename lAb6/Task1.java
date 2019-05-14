class Authors
{
			private String name;  //instance variables
			private String email;
			private  char gender;
			Authors(String name,String email,char gender)
			{
			this.name=name;
			this.email=email;
			this.gender=gender;

			}
			public String getName()
			{
			return name;
			}
			public String getEmail()
			{
			return email;
			}
			public void setEmail(String email)
			{
			this.email=email;
			}
			public char getGender()
			{
			return gender;
			}
			public void tostring()
			{
				System.out.println("Name="+name+" "+"Email="+email+" "+"Gender ="+gender);
			}
}
 class Task1
 {
         public static void main(String args [])
         {
         			Authors obj=new Authors("Rebort Brown","Rebortbrown345@gmail.com",'M');
         
         			obj.tostring();
         }
 }

