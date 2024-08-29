package day2;

public class UserType_assignment_6 
{
	String name;
	UserType_assignment_6(String parameterVal)
	{
		name=parameterVal;
	}
	UserType_assignment_6()
	{
		this("student"); //this default constructor is calling the parameterised constructor!!
	}
	public static void main(String args[])
	{
		UserType_assignment_6 usertype1=new UserType_assignment_6("Faculty");
		UserType_assignment_6 usertype2=new UserType_assignment_6();
		
		System.out.println(usertype1.name);
		System.out.println(usertype2.name);
		
	}
}
