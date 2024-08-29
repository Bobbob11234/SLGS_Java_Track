package day2;

public class assignment_5 
{
	int studentId;
	char studentType;
	
	public assignment_5()
	{
		studentId=10;
		studentType='F';
	}
	public void setStudentId(int id)
	{
		this.studentId=id;
	}
	public void setStudentType(char type)
	{
		this.studentType=type;
	}
	public int getStudentId()
	{
		return this.studentId;
	}
	public char getStudentType()
	{
		return this.studentType;
	}
	
	public static void main(String args[])
	{
		assignment_5 student=new assignment_5();
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		
	}
}
