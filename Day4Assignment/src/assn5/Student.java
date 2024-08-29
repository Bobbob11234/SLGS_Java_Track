package assn5;

public class Student 
{
	private static int studentId;
	private char studentType;
	private String studentName;
	
	public Student() {};
	public Student(int id, char type, String name)
	{
		studentId=id++;
		studentType=type;
		studentName=name;
	}
}
