package day2;

public class assignment_7 
{
	public static void main(String args[])
	{
		int sId=25;
		assignment_7 val=new assignment_7();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are "+sId);
		
		assignment_5 student=new assignment_5();
		student.setStudentId(20);
		val.passTheValueMethod(student);
		System.out.println("The student Id is "+student.getStudentId());
	}
	
	public void passTheValueMethod(int sId)
	{
		sId=10;
		System.out.println("The sId are "+sId);
	}
	
	public void passTheValueMethod(assignment_5 student)
	{
		student.setStudentId(30);
		System.out.println("The student Id is "+student.getStudentId());
	}
}
