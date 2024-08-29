package day2;

public class assignment_8 
{
	//int i=22;
	//int j=14000;
	//boolean k;
	//boolean l;
	public static void main(String args[])
	{
		int i=22;
		int j=14000;
		assignment_8 obj=new assignment_8();
		boolean k=obj.Method1(i);
		boolean l=obj.Method2(j);
		
		if(k==true&& l==true)
		System.out.println("Is a new employee");
		else
		System.out.println("Is not a new employee");
	}
	
	public boolean Method1(int i)
	{
		if(i>20&&i<30)
		return true;
		else
		return false;
	}
	
	public boolean Method2(int j)
	{
		if(j>=14000&&j<20000)
		return true;
		else
		return false;
	}
}
