package assn6;

public class Student 
{
	protected static int studentId;
	protected char studentType;
	protected String studentName;
	
	public void setStudentId(int sId)
	{
		this.studentId=sId;
	}
	public void setStudentName(String sName)
	{
		this.studentName=sName;
	}
	public void setStudentType(char sType)
	{
		this.studentType=sType;
	}
	public void getDetails()
	{
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Type: "+studentType);
	}
}
