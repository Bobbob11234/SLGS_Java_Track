package assn2;

public class Student 
{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	public Student() {};
	public Student(int id, char type, String firstName, String lastName)
	{
		studentId=id;
		studentType=type;
		studentName=firstName+" "+lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName+" "+lastName;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
}
