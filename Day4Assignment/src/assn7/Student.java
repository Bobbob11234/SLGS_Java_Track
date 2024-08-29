package assn7;

public class Student 
{
	protected static int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees=12000;
	protected int feesPerMonth;
	
	public Student() {};
	
	public void setStudentId(int sId)
	{
		this.studentId=sId;
	}
	public void setStudentName(String firstName, String lastName)
	{
		this.studentName=firstName+" "+lastName;
	}
	public void setStudentType(char sType)
	{
		this.studentType=sType;
	}
	
	public void calculateFees()
	{
		this.feesPerMonth=this.semesterFees/6;
	}
	public int getFees()
	{
		return this.feesPerMonth;
	}
}
