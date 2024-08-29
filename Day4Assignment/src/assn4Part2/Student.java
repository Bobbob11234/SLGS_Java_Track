package assn4Part2;

public class Student extends CourseRegistration
{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	private int feesPerMonth;
	private int semesterFees;
	
	public Student() {};
	public Student(int id, String cName)
	{
		super(cName);
		this.studentId=id;
	}
	public Student(int id, char type, String firstName, String lastName, int fees, String cName)
	{
		super(cName);
		studentType=type;
		studentName=firstName+" "+lastName;
		semesterFees=fees;
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
	public void setFeesPerMonth(int feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	public void displayStudentDetails() {
		super.displayDetails();
		System.out.println(this.getStudentId());
		System.out.println(this.getStudentName());
		System.out.println(this.getStudentType());
		System.out.println(this.getFeesPerMonth());
	}
	
}
