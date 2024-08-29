package assn4;

public class Student 
{
	int studentId;
	char studentType;
		
	public Student()
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
		Student student=new Student();
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
			
	}
}
